package presentacion;

import java.awt.EventQueue; 

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import persistencia.*;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class RegistroDictadoClase extends JInternalFrame {
    
	private static IController control;
	private JTextField txtUrl;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroDictadoClase frame = new RegistroDictadoClase();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroDictadoClase(IController ICnt) {
		IController control = ICnt;
		setResizable(true);
		setClosable(true);
		setTitle("Registro Dictado de Clase");
		setBounds(100, 100, 450, 456);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 46, 92, 15);
		getContentPane().add(lblInstitucin);
		
		JComboBox cmbActividad = new JComboBox();
		cmbActividad.addItem(" ");
		cmbActividad.setBounds(179, 75, 231, 24);
		getContentPane().add(cmbActividad);
		
		JFormattedTextField txtFecha = new JFormattedTextField();
		txtFecha.setEditable(false);
		txtFecha.setBounds(179, 134, 231, 20);
		getContentPane().add(txtFecha);
		
		JLabel lblActividadDeportiva = new JLabel("Actividad Deportiva:");
		lblActividadDeportiva.setBounds(30, 80, 149, 15);
		getContentPane().add(lblActividadDeportiva);
		
		JLabel lblNombre = new JLabel("Nombre de Clase:");
		lblNombre.setBounds(30, 113, 131, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(30, 134, 92, 15);
		getContentPane().add(lblFechaInicio);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setBounds(30, 195, 70, 15);
		getContentPane().add(lblProfesor);
		
		JLabel lblHoraInicio = new JLabel("Hora inicio:");
		lblHoraInicio.setBounds(30, 168, 92, 15);
		getContentPane().add(lblHoraInicio);
		
		JLabel lblSociosMinimos = new JLabel("Socios minimos:");
		lblSociosMinimos.setBounds(30, 243, 117, 15);
		getContentPane().add(lblSociosMinimos);
		
		JLabel lblSociosMaximos = new JLabel("Socios maximos:");
		lblSociosMaximos.setBounds(240, 243, 117, 15);
		getContentPane().add(lblSociosMaximos);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(30, 281, 70, 15);
		getContentPane().add(lblUrl);
		
		JFormattedTextField txtHora = new JFormattedTextField();
		txtHora.setEditable(false);
		txtHora.setBounds(179, 166, 231, 20);
		getContentPane().add(txtHora);
		
		JTextField txtProfesor = new JTextField();
		txtProfesor.setEditable(false);
		txtProfesor.setText("Profesor");
		txtProfesor.setBounds(179, 195, 231, 24);
		getContentPane().add(txtProfesor);
		
		JTextField txtMin = new JTextField();
		txtMin.setEditable(false);
		txtMin.setBounds(179, 241, 52, 20);
		getContentPane().add(txtMin);
		
		JTextField txtMax = new JTextField();
		txtMax.setEditable(false);
		txtMax.setBounds(358, 241, 52, 20);
		getContentPane().add(txtMax);
		
		txtUrl = new JTextField();
		txtUrl.setEditable(false);
		txtUrl.setText("URL");
		txtUrl.setBounds(179, 279, 231, 19);
		getContentPane().add(txtUrl);
		txtUrl.setColumns(10);
		
		JLabel lblSocio = new JLabel("Socio");
		lblSocio.setBounds(30, 334, 70, 15);
		getContentPane().add(lblSocio);
		
		JComboBox cmbSocio = new JComboBox();
		if(control.getUsr()!=null) {
			for(Map.Entry<String,Usuario> hm:control.getUsr().entrySet()) {
				if(hm.getValue() instanceof Socio) {
					cmbSocio.addItem(hm.getKey());
				}
			}
		}
		cmbSocio.setBounds(182, 329, 228, 24);
		getContentPane().add(cmbSocio);
		
		JComboBox cmbNombre = new JComboBox();
		cmbNombre.addItem(" ");
		cmbNombre.setBounds(179, 111, 231, 19);
		getContentPane().add(cmbNombre);
		
		JComboBox cmbInstituto = new JComboBox();
		cmbInstituto.addItem(" ");
		if(control.getIns()!=null) {
			for(Map.Entry<String, Institucion> hm:control.getIns().entrySet()) {
				cmbInstituto.addItem(hm.getKey());	
			}
		}
		cmbInstituto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbInstituto.getSelectedItem()!=" ") {
					Institucion i=control.getIns().get(cmbInstituto.getSelectedItem().toString());
					if(cmbActividad.getItemCount()>1) {
						cmbActividad.removeAllItems();
						cmbActividad.addItem(" ");
					}
					Iterator<Actividad> ita=i.getActividades().iterator();
					while(ita.hasNext()) {
						cmbActividad.addItem(ita.next().getNombre());
					}
				}
			}
		});
		cmbInstituto.setBounds(179, 39, 231, 24);
		getContentPane().add(cmbInstituto);
		
		cmbActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbActividad.getSelectedItem()!=" ") {
					if(cmbNombre.getItemCount()>1) {
						cmbNombre.removeAllItems();
						cmbNombre.addItem(" ");
					}
					Actividad a=control.getAct().get(cmbActividad.getSelectedItem().toString());
					for(Map.Entry<String, Clase> hm:a.getClases().entrySet()) {
						cmbNombre.addItem(hm.getKey());	
					}
				}
			}
		});
		
		cmbNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbNombre.getSelectedItem()!=" ") {
					Actividad a=control.getAct().get(cmbActividad.getSelectedItem().toString());
					txtFecha.setValue(a.getClases().get(cmbNombre.getSelectedItem().toString()).getFecha_dict());
					txtHora.setValue(a.getClases().get(cmbNombre.getSelectedItem().toString()).getHora_dict());
					txtProfesor.setText(a.getClases().get(cmbNombre.getSelectedItem().toString()).getProf().getNick());
					txtMin.setText(Integer.toString(a.getClases().get(cmbNombre.getSelectedItem().toString()).getRmin()));
					txtMax.setText(Integer.toString(a.getClases().get(cmbNombre.getSelectedItem().toString()).getRmax()));
					txtUrl.setText(a.getClases().get(cmbNombre.getSelectedItem().toString()).getUrl());	
				}else {
					txtFecha.setText(" ");
					txtHora.setText(" ");
					txtProfesor.setText(" ");
					txtMin.setText(" ");
					txtMax.setText(" ");
					txtUrl.setText(" ");
				}
			}
		});
		//
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control.getUsr()!=null) {
					if(cmbSocio.getItemCount()>0) {
						if((cmbInstituto.getSelectedItem()!=" ")&&(cmbActividad.getSelectedItem()!=" ")&&(cmbNombre.getSelectedItem()!=" ")) {
							Clase c=control.getAct().get(cmbActividad.getSelectedItem().toString()).getClases().get(cmbNombre.getSelectedItem().toString());
							if(c.getRegis()==c.getRmax()) {
								JFrame f=new JFrame();
								JOptionPane.showMessageDialog(f, "Los cupos de esa Clase ya se llenaron, por favor seleccione otra.", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								Socio s=(Socio) control.getUsr().get(cmbSocio.getSelectedItem().toString());
								if(s.getClases()!=null) {
									Iterator<Fecha_Registro> itfr=s.getClases().iterator();
									boolean registrado=false;
									while((itfr.hasNext())&&(!registrado)) {
										if(itfr.next().getClase().getNombre()==c.getNombre()) {
											registrado=true;
										}
									}
									if(registrado) {
										JFrame f=new JFrame();
										JOptionPane.showMessageDialog(f, "Ese Socio ya esta registrado a esta Clase, por favor seleccione otro.", "Error", JOptionPane.ERROR_MESSAGE);
									}else {
										s.registrarse(c);
										c.agregarRegistrado();
									}
								}else {
									s.registrarse(c);
									c.agregarRegistrado();
								}
							}
						}
					}
				}
			}
		});
		btnAceptar.setBounds(97, 383, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
			}
		});
		btnCancelar.setBounds(240, 383, 117, 25);
		getContentPane().add(btnCancelar);

	}
}