package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
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
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.Rectangle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class RegistroUsuario extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNickname;
	private JTextField txtCorreo;
	private JTextField txtSitioWeb;
	private JTextField txtDescripcion;
	private JTextField txtBiografia;

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
	public RegistroUsuario() {
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
		lblNombre.setBounds(30, 77, 70, 15);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 75, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 106, 70, 15);
		getContentPane().add(lblApellido);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setBounds(30, 137, 84, 15);
		getContentPane().add(lblNickname);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(179, 104, 231, 19);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNickname = new JTextField();
		txtNickname.setText("Nickname");
		txtNickname.setBounds(179, 135, 231, 19);
		getContentPane().add(txtNickname);
		txtNickname.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo electrónico: ");
		lblCorreo.setBounds(30, 166, 145, 15);
		getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setBounds(179, 164, 231, 19);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento: ");
		lblFechaDeNacimiento.setBounds(30, 193, 155, 15);
		getContentPane().add(lblFechaDeNacimiento);
		
		JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
		btnSeleccionarImagen.setBounds(12, 330, 188, 25);
		getContentPane().add(btnSeleccionarImagen);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(97, 377, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(237, 377, 117, 25);
		getContentPane().add(btnCancelar);
		
		JSpinner spDia = new JSpinner();
		spDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spDia.setBounds(203, 191, 52, 20);
		getContentPane().add(spDia);
		
		JSpinner spMes = new JSpinner();
		spMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spMes.setBounds(275, 191, 52, 20);
		getContentPane().add(spMes);
		
		JSpinner spAnio = new JSpinner();
		spAnio.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spAnio.setBounds(339, 191, 71, 20);
		getContentPane().add(spAnio);
		
		JLabel lblInstituto = new JLabel("Instituto: ");
		lblInstituto.setBounds(30, 220, 70, 15);
		getContentPane().add(lblInstituto);
		
		JLabel lblDescripcin = new JLabel("Descripción: ");
		lblDescripcin.setBounds(30, 247, 101, 15);
		getContentPane().add(lblDescripcin);
		
		JLabel lblBiografa = new JLabel("Biografía: ");
		lblBiografa.setBounds(30, 274, 84, 15);
		getContentPane().add(lblBiografa);
		
		JLabel lblSitioWeb = new JLabel("Sitio web: ");
		lblSitioWeb.setBounds(30, 301, 84, 15);
		getContentPane().add(lblSitioWeb);
		
		txtSitioWeb = new JTextField();
		txtSitioWeb.setText("Sitio web");
		txtSitioWeb.setBounds(179, 299, 231, 19);
		getContentPane().add(txtSitioWeb);
		txtSitioWeb.setColumns(10);
		
		JComboBox cbInstituto = new JComboBox();
		cbInstituto.setModel(new DefaultComboBoxModel(new String[] {"Instituto1", "Instituto2", "Instituto3"}));
		cbInstituto.setBounds(179, 220, 231, 24);
		getContentPane().add(cbInstituto);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setText("Descripcion");
		txtDescripcion.setBounds(179, 247, 231, 19);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtBiografia = new JTextField();
		txtBiografia.setText("Biografia");
		txtBiografia.setBounds(179, 272, 231, 19);
		getContentPane().add(txtBiografia);
		txtBiografia.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Profesor"}));
		cbTipo.setBounds(179, 27, 231, 24);
		getContentPane().add(cbTipo);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario.setBounds(26, 32, 130, 15);
		getContentPane().add(lblTipoDeUsuario);

	}
}
