package presentacion;

import java.awt.EventQueue; 

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
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
import java.util.Map.Entry;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.Rectangle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;

public class ConsultaUsuario extends JInternalFrame {
	private IController control;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtMail;
	private JTextField txtWeb;
	private JTextField txtDesc;
	private JTextField txtBio;
	private JTextField txtActividad;
	private JTextField txtDur;
	private JTextField txtProf;
	private JTextField txtUrl;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaUsuario frame = new ConsultaUsuario();
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
	public ConsultaUsuario(IController ICnt) {
		control=ICnt;
		setResizable(true);
		setNormalBounds(new Rectangle(100, 100, 450, 500));
		setClosable(true);
		setTitle("Modificar usuario");
		setBounds(100, 100, 775, 520);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 102, 70, 15);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 100, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 129, 70, 15);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setText("Apellido");
		txtApellido.setBounds(179, 131, 231, 19);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo electrónico: ");
		lblCorreo.setBounds(12, 167, 145, 15);
		getContentPane().add(lblCorreo);
		
		txtMail = new JTextField();
		txtMail.setEditable(false);
		txtMail.setText("Correo");
		txtMail.setBounds(179, 165, 231, 19);
		getContentPane().add(txtMail);
		txtMail.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento: ");
		lblFechaDeNacimiento.setBounds(12, 194, 155, 15);
		getContentPane().add(lblFechaDeNacimiento);
		
		JFormattedTextField txtFnac = new JFormattedTextField(LocalDate.now());
		txtFnac.setEditable(false);
		txtFnac.setBounds(179, 196, 231, 20);
		getContentPane().add(txtFnac);
		
		JLabel lblInstituto = new JLabel("Instituto: ");
		lblInstituto.setBounds(427, 252, 70, 15);
		getContentPane().add(lblInstituto);
		
		JLabel lblDescripcin = new JLabel("Descripción: ");
		lblDescripcin.setBounds(427, 279, 101, 15);
		getContentPane().add(lblDescripcin);
		
		JLabel lblBiografa = new JLabel("Biografía: ");
		lblBiografa.setBounds(427, 306, 84, 15);
		getContentPane().add(lblBiografa);
		
		JLabel lblSitioWeb = new JLabel("Sitio web: ");
		lblSitioWeb.setBounds(427, 350, 84, 15);
		getContentPane().add(lblSitioWeb);
		
		txtWeb = new JTextField();
		txtWeb.setEditable(false);
		txtWeb.setText("Sitio web");
		txtWeb.setBounds(515, 348, 231, 19);
		getContentPane().add(txtWeb);
		txtWeb.setColumns(10);
		
		JTextField txtInstituto = new JTextField();
		txtInstituto.setEditable(false);
		txtInstituto.setText("Instituto");
		txtInstituto.setBounds(515, 250, 231, 19);
		getContentPane().add(txtInstituto);
		
		txtDesc = new JTextField();
		txtDesc.setEditable(false);
		txtDesc.setText("Descripcion");
		txtDesc.setBounds(515, 277, 231, 19);
		getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
		
		txtBio = new JTextField();
		txtBio.setEditable(false);
		txtBio.setText("Biografia");
		txtBio.setBounds(515, 304, 231, 19);
		getContentPane().add(txtBio);
		txtBio.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {" ", "Cliente", "Profesor"}));
		cbTipo.setBounds(179, 27, 231, 24);
		getContentPane().add(cbTipo);
		
		JLabel lbTipoDeUsr = new JLabel("Tipo de Usuario:");
		lbTipoDeUsr.setBounds(26, 32, 130, 15);
		getContentPane().add(lbTipoDeUsr);
		
		JLabel lblClases = new JLabel("Clases:");
		lblClases.setBounds(30, 233, 70, 15);
		getContentPane().add(lblClases);
		
		JLabel lblNickname_1 = new JLabel("Nickname:");
		lblNickname_1.setBounds(30, 70, 101, 15);
		getContentPane().add(lblNickname_1);
		
		JComboBox cbNick = new JComboBox();
		cbNick.addItem(" ");
		cbNick.setBounds(179, 65, 231, 24);
		getContentPane().add(cbNick);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(374, 447, 117, 25);
		getContentPane().add(btnSalir);
		
		JComboBox cbClases = new JComboBox();
		cbClases.addItem(" ");
		cbClases.setBounds(179, 228, 221, 24);
		getContentPane().add(cbClases);
		
		JLabel lblActividad = new JLabel("Actividad:");
		lblActividad.setBounds(30, 260, 70, 15);
		getContentPane().add(lblActividad);
		
		txtActividad = new JTextField();
		txtActividad.setText("Actividad");
		txtActividad.setEditable(false);
		txtActividad.setBounds(176, 258, 224, 19);
		getContentPane().add(txtActividad);
		txtActividad.setColumns(10);
		
		JLabel lblFechaDictado = new JLabel("Fecha Dictado:");
		lblFechaDictado.setBounds(30, 287, 126, 15);
		getContentPane().add(lblFechaDictado);
		
		JFormattedTextField txtFDict = new JFormattedTextField(LocalDate.now());
		txtFDict.setEditable(false);
		txtFDict.setBounds(179, 289, 221, 19);
		getContentPane().add(txtFDict);
		
		JLabel lblDuracin = new JLabel("Duración:");
		lblDuracin.setBounds(40, 350, 70, 15);
		getContentPane().add(lblDuracin);
		
		txtDur = new JTextField();
		txtDur.setText("0 min");
		txtDur.setEditable(false);
		txtDur.setBounds(179, 348, 70, 19);
		getContentPane().add(txtDur);
		txtDur.setColumns(10);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		JFormattedTextField txtHDict = new JFormattedTextField(LocalTime.now().format(dtf));
		txtHDict.setEditable(false);
		txtHDict.setBounds(179, 320, 221, 19);
		getContentPane().add(txtHDict);
		
		JLabel lblHoradictada = new JLabel("HoraDictada:");
		lblHoradictada.setBounds(30, 322, 117, 15);
		getContentPane().add(lblHoradictada);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(444, 32, 245, 184);
		getContentPane().add(lblImg);
		
		JLabel lblProf = new JLabel("Profesor:");
		lblProf.setBounds(30, 427, 70, 15);
		lblProf.setVisible(false);
		getContentPane().add(lblProf);
		
		txtProf = new JTextField();
		txtProf.setEnabled(true);
		txtProf.setEditable(false);
		txtProf.setText("Profesor");
		txtProf.setVisible(false);
		txtProf.setBounds(183, 425, 114, 19);
		getContentPane().add(txtProf);
		txtProf.setColumns(10);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(30, 377, 70, 15);
		getContentPane().add(lblUrl);
		
		txtUrl = new JTextField();
		txtUrl.setText("URL");
		txtUrl.setEditable(false);
		txtUrl.setBounds(160, 379, 114, 19);
		getContentPane().add(txtUrl);
		txtUrl.setColumns(10);

		cbTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbTipo.getSelectedItem().toString()==" ") {
					cbNick.removeAllItems();
					cbNick.addItem(" ");
				}else {
					if(cbTipo.getSelectedItem().toString()=="Cliente"){
						for(Entry<String, Usuario> hm:control.getUsr().entrySet()) {
							if(hm.getValue() instanceof Socio) {
								cbNick.addItem(hm.getKey());
							}
						}
					}else {
						for(Entry<String, Usuario> hm:control.getUsr().entrySet()) {
							if(hm.getValue() instanceof Profesor) {
								cbNick.addItem(hm.getKey());
							}
						}
					}
				}
			}
		});

		cbNick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbNick.getSelectedItem()==" ") {
					txtNombre.setText("Nombre");
					txtApellido.setText("Apellido");
					txtMail.setText("Correo");
					txtFnac.setValue(LocalDate.now());
				}else {
					txtNombre.setText(control.getUsr().get(cbNick.getSelectedItem().toString()).getNombre());
					txtApellido.setText(control.getUsr().get(cbNick.getSelectedItem().toString()).getApellido());
					txtMail.setText(control.getUsr().get(cbNick.getSelectedItem().toString()).getMail());
					txtFnac.setValue(control.getUsr().get(cbNick.getSelectedItem().toString()).getFechanac());
					lblImg.setIcon(new ImageIcon(control.getUsr().get(cbNick.getSelectedItem().toString()).getFoto()));
					if(cbTipo.getSelectedItem().toString()=="Cliente") {
						Socio s=(Socio) control.getUsr().get(cbNick.getSelectedItem().toString());
						txtDesc.setText(" ");
						txtBio.setText(" ");
						txtWeb.setText(" ");
						if(cbClases.getItemCount()>1) {
							cbClases.removeAll();
							cbClases.addItem(" ");
						}
						Iterator<Fecha_Registro> its=s.getClases().iterator();
						while(its.hasNext()) {
							cbClases.addItem(its.next().getClase().getNombre());
						}
					}else {
						Profesor p=(Profesor) control.getUsr().get(cbNick.getSelectedItem().toString());
						txtDesc.setText(p.getDesc());
						txtBio.setText(p.getBio());
						txtWeb.setText(p.getWeb());
						txtInstituto.setText(p.getIns().getNombre());
						if(cbClases.getItemCount()>1) {
							cbClases.removeAll();
							cbClases.addItem(" ");
						}
						Iterator<Clase> itp=p.getClases().iterator();
						while(itp.hasNext()) {
							cbClases.addItem(itp.next().getNombre());
						}
						
					}
				}
			}
		});
		
		cbClases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbTipo.getSelectedItem()!=" ") {
					Clase c;
					if(cbTipo.getSelectedItem()=="Cliente") {
						Socio u=(Socio)control.getUsr().get(cbNick.getSelectedItem().toString());
						Iterator<Fecha_Registro> its=u.getClases().iterator();
						while(its.next().getClase().getNombre()!=cbClases.getSelectedItem().toString()) {}
						c=its.next().getClase();
						txtProf.setText(c.getProf().getNick());
					}else {
						Profesor u=(Profesor)control.getUsr().get(cbNick.getSelectedItem().toString());
						Iterator<Clase> itp=u.getClases().iterator();
						while(itp.next().getNombre()!=cbClases.getSelectedItem().toString()) {}
						c=itp.next();
					}
					txtActividad.setText(c.getAct().getNombre());
					txtFDict.setText(c.getFecha_dict().toString());
					txtHDict.setText(c.getHora_dict().toString());
					txtDur.setText(((Integer)c.getAct().getDuracion()).toString());
					txtUrl.setText(c.getUrl());
				}
			}
		});

	}
}



































