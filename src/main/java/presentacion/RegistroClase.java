package presentacion;

import java.awt.EventQueue;   

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import persistencia.IController;
import persistencia.Institucion;
import persistencia.Actividad;
import persistencia.Profesor;
import persistencia.Clase;
import persistencia.Fecha;
import persistencia.Hora;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Map;
import java.util.Calendar;
import java.util.Iterator;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroClase extends JInternalFrame {
	private IController ICnt;
	private JTextField txtNombre;
	private JTextField txtUrl;
	private JTextField txtFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroClase frame = new RegistroClase();
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
	public RegistroClase() {
		IController control = ICnt;
		setResizable(true);
		setClosable(true);
		setTitle("Registro de Clase");
		setBounds(100, 100, 450, 384);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 46, 92, 15);
		getContentPane().add(lblInstitucin);
		
		JComboBox cbInstituto = new JComboBox();
		if(control.getIns()!=null) {
			for(Map.Entry<String, Institucion> hm:control.getIns().entrySet()) {
				cbInstituto.addItem(hm.getKey());	
			}
		}
		cbInstituto.setBounds(179, 39, 231, 24);
		getContentPane().add(cbInstituto);
		
		JComboBox cbActividadDeportiva = new JComboBox();
		if(control.getIns()!=null) {
			Institucion i=control.getIns().get(cbInstituto.getSelectedItem().toString());
			if(i.getActividades()!=null) {
				Iterator <Actividad> ita= i.getActividades().iterator();
				while(ita.hasNext()) {
					cbActividadDeportiva.addItem(ita.next().getNombre());
				}				
			}			
		}
		cbActividadDeportiva.setBounds(179, 75, 231, 24);
		getContentPane().add(cbActividadDeportiva);
		
		JLabel lblActividadDeportiva = new JLabel("Actividad Deportiva:");
		lblActividadDeportiva.setBounds(30, 80, 149, 15);
		getContentPane().add(lblActividadDeportiva);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 107, 70, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(30, 134, 92, 15);
		getContentPane().add(lblFechaInicio);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setBounds(30, 200, 70, 15);
		getContentPane().add(lblProfesor);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 111, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
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
		
		JComboBox cbProfesor = new JComboBox();
		if(control.getIns()!=null) {
			Institucion i=control.getIns().get(cbInstituto.getSelectedItem().toString());
			if(i.getProfesores()!=null) {
				Iterator<Profesor> itp= i.getProfesores().iterator();
				while(itp.hasNext()) {
					cbProfesor.addItem(itp.next().getNombre());	
				}
			}	
		}
		cbProfesor.setBounds(179, 195, 231, 24);
		getContentPane().add(cbProfesor);
		
		JTextField txtMin = new JTextField();
		txtMin.setBounds(145, 241, 52, 20);
		getContentPane().add(txtMin);
		
		JTextField txtMax = new JTextField();
		txtMax.setBounds(358, 241, 52, 20);
		getContentPane().add(txtMax);
		
		txtUrl = new JTextField();
		txtUrl.setText("URL");
		txtUrl.setBounds(179, 279, 231, 19);
		getContentPane().add(txtUrl);
		txtUrl.setColumns(10);
		
		txtFecha = new JFormattedTextField(LocalDate.now());
		txtFecha.setBounds(179, 134, 231, 19);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		JFormattedTextField txtHora = new JFormattedTextField(LocalTime.now());
		txtHora.setBounds(179, 166, 231, 19);
		getContentPane().add(txtHora);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control.getIns()!=null) {
					if(control.getIns().get(cbInstituto.getSelectedItem().toString()).getActividades()!=null) {	
						if(control.getIns().get(cbInstituto.getSelectedItem().toString()).getProfesores()!=null) {
							if(control.getAct().get(cbActividadDeportiva.getSelectedItem().toString()).getClases().containsKey(txtNombre.getText())) {
								JFrame f=new JFrame();
								JOptionPane.showMessageDialog(f, "Ese Nombre ya esta usado, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								Fecha f1=new Fecha(LocalDate.now());
								Fecha f2=new Fecha((LocalDate) ((JFormattedTextField) txtFecha).getValue());
								Actividad a=control.getAct().get(cbActividadDeportiva.getSelectedItem().toString());
								Profesor p=(Profesor) control.getUsr().get(cbProfesor.getSelectedItem().toString());
								Hora h= new Hora((LocalTime) ((JFormattedTextField) txtHora).getValue());
								Clase c=new Clase(txtNombre.getText(),txtUrl.getText(),Integer.parseInt(txtMin.getText()),Integer.parseInt(txtMax.getText()),f1,f2,a,p,h);
							}
						}
					}
				}
			}
		});
		btnAceptar.setBounds(97, 310, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
			}
		});
		btnCancelar.setBounds(240, 310, 117, 25);
		getContentPane().add(btnCancelar);

	}
}
