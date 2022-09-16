package laboratorio;

import java.awt.EventQueue;      

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import Logica.IController;
import Logica.Fabrica;
import Logica.Fecha;
import Logica.Institucion;
import Logica.Usuario;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.Rectangle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.io.File;

public class RegistroUsuario extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNickname;
	private JTextField txtCorreo;
    
	private static IController control;
    private JTextField txtDesc;
    private JTextField txtBio;
    private JFormattedTextField txtFecha;
    private JTextField txtUrl;
    private JTextField txtFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuario frame = new RegistroUsuario();
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
	public RegistroUsuario(IController ICnt) {
		IController control = ICnt;
		setResizable(true);
		setNormalBounds(new Rectangle(100, 100, 450, 500));
		setClosable(true);
		setTitle("Registro usuario");
		setBounds(100, 100, 450, 446);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(120, 0, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 61, 70, 15);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 59, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 90, 70, 15);
		getContentPane().add(lblApellido);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setBounds(30, 121, 84, 15);
		getContentPane().add(lblNickname);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(179, 88, 231, 19);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNickname = new JTextField();
		txtNickname.setText("Nickname");
		txtNickname.setBounds(179, 119, 231, 19);
		getContentPane().add(txtNickname);
		txtNickname.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo electrónico: ");
		lblCorreo.setBounds(30, 150, 145, 15);
		getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setBounds(179, 148, 231, 19);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento: ");
		lblFechaDeNacimiento.setBounds(30, 177, 155, 15);
		getContentPane().add(lblFechaDeNacimiento);
		
		txtFile = new JTextField();
		txtFile.setEditable(false);
		txtFile.setBounds(220, 199, 190, 19);
		getContentPane().add(txtFile);
		txtFile.setColumns(10);
		
		JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
		btnSeleccionarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int result = fc.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
				 txtFile.setText(fc.getSelectedFile().getAbsolutePath());
				 }
			}
		});
		btnSeleccionarImagen.setBounds(30, 199, 178, 25);
		getContentPane().add(btnSeleccionarImagen);
			
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario.setBounds(26, 32, 130, 15);
		getContentPane().add(lblTipoDeUsuario);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Cliente"}));
		if(control.getIns()!=null) {
			cbTipo.addItem("Profesor");
		}
		cbTipo.setBounds(179, 27, 231, 24);
		getContentPane().add(cbTipo);
		
		JComboBox cmbInst = new JComboBox();
		if(control.getIns()!=null) {
			for(Map.Entry<String, Institucion> hm:control.getIns().entrySet()) {
				cmbInst.addItem(hm.getKey());	
			}
		}
		cmbInst.setBounds(144, 257, 284, 24);
		getContentPane().add(cmbInst);
		
		JLabel lblInstitucion = new JLabel("Institucion");
		lblInstitucion.setBounds(30, 262, 96, 15);
		getContentPane().add(lblInstitucion);
		
		JLabel lblBiografia = new JLabel("Biografia");
		lblBiografia.setBounds(30, 311, 70, 15);
		getContentPane().add(lblBiografia);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(30, 350, 84, 15);
		getContentPane().add(lblDescripcion);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(144, 346, 284, 19);
		getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
		
		txtBio = new JTextField();
		txtBio.setBounds(144, 309, 284, 19);
		getContentPane().add(txtBio);
		txtBio.setColumns(10);
		
		txtFecha = new JFormattedTextField(LocalDate.now());
		txtFecha.setBounds(179, 179, 231, 15);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblPaginaweb = new JLabel("PaginaWeb");
		lblPaginaweb.setBounds(30, 230, 84, 15);
		getContentPane().add(lblPaginaweb);
		
		txtUrl = new JTextField();
		txtUrl.setBounds(137, 228, 291, 19);
		getContentPane().add(txtUrl);
		txtUrl.setColumns(10);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
                setVisible(false);
			}
		});
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control.getUsr().containsKey(txtNickname.getText())) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "Ese Nickname ya esta usado, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
				}else{
					boolean OK=false;
					for(Map.Entry<String, Usuario> hm:control.getUsr().entrySet()) {
						if(hm.getValue().getMail()==txtCorreo.getText()) {
							OK=true;
						}
					}
					if(OK) {
						JFrame f=new JFrame();
						JOptionPane.showMessageDialog(f, "Ese Mail ya esta usado, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
					}else {
						Fecha f=new Fecha((LocalDate) txtFecha.getValue());
						if(cbTipo.getSelectedItem()=="Cliente") {
							control.altaSocio(txtNickname.getText(),txtNombre.getText(),txtApellido.getText(),txtCorreo.getText(),f,txtFile.getText());
						}else {
							Institucion i=control.getIns().get(cmbInst.getSelectedItem().toString());
							control.altaProf(txtNickname.getText(),txtNombre.getText(),txtApellido.getText(),txtCorreo.getText(),txtDesc.getText(),txtBio.getText(),txtUrl.getText(),f,i,txtFile.getText());
						}
					}	
				}
			}
		});
		btnAceptar_1.setBounds(58, 377, 117, 25);
		getContentPane().add(btnAceptar_1);
		btnCancelar_1.setBounds(244, 377, 117, 25);
		getContentPane().add(btnCancelar_1);

	}
	private void limpiar() {
		txtNombre.setText("Nombre");
		txtApellido.setText("Apellido");
		txtNickname.setText("Nickname");
		txtCorreo.setText("Mail");
		txtFecha.setValue(LocalDate.now());
	}
}


























