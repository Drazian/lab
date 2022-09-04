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
import javax.swing.JTable;

public class ConsultaUsuario extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNickname;
	private JTextField txtCorreo;
	private JTextField txtSitioWeb;
	private JTextField txtDescripcion;
	private JTextField txtBiografia;
	private JTable tbUsuario;
	private JTable tbClases;
	private JTable tbActividadDeportiva;

	/**
	 * Launch the application.
	 */
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
	public ConsultaUsuario() {
		setResizable(true);
		setNormalBounds(new Rectangle(100, 100, 450, 500));
		setClosable(true);
		setTitle("Modificar usuario");
		setBounds(100, 100, 450, 966);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 228, 70, 15);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 226, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 257, 70, 15);
		getContentPane().add(lblApellido);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setBounds(30, 288, 84, 15);
		getContentPane().add(lblNickname);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(179, 255, 231, 19);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNickname = new JTextField();
		txtNickname.setText("Nickname");
		txtNickname.setBounds(179, 286, 231, 19);
		getContentPane().add(txtNickname);
		txtNickname.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo electrónico: ");
		lblCorreo.setBounds(30, 317, 145, 15);
		getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setBounds(179, 315, 231, 19);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento: ");
		lblFechaDeNacimiento.setBounds(30, 344, 155, 15);
		getContentPane().add(lblFechaDeNacimiento);
		
		JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
		btnSeleccionarImagen.setBounds(12, 481, 188, 25);
		getContentPane().add(btnSeleccionarImagen);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(108, 774, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(248, 774, 117, 25);
		getContentPane().add(btnCancelar);
		
		JSpinner spDia = new JSpinner();
		spDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spDia.setBounds(203, 342, 52, 20);
		getContentPane().add(spDia);
		
		JSpinner spMes = new JSpinner();
		spMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spMes.setBounds(275, 342, 52, 20);
		getContentPane().add(spMes);
		
		JSpinner spAnio = new JSpinner();
		spAnio.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spAnio.setBounds(339, 342, 71, 20);
		getContentPane().add(spAnio);
		
		JLabel lblInstituto = new JLabel("Instituto: ");
		lblInstituto.setBounds(30, 371, 70, 15);
		getContentPane().add(lblInstituto);
		
		JLabel lblDescripcin = new JLabel("Descripción: ");
		lblDescripcin.setBounds(30, 398, 101, 15);
		getContentPane().add(lblDescripcin);
		
		JLabel lblBiografa = new JLabel("Biografía: ");
		lblBiografa.setBounds(30, 425, 84, 15);
		getContentPane().add(lblBiografa);
		
		JLabel lblSitioWeb = new JLabel("Sitio web: ");
		lblSitioWeb.setBounds(30, 452, 84, 15);
		getContentPane().add(lblSitioWeb);
		
		txtSitioWeb = new JTextField();
		txtSitioWeb.setText("Sitio web");
		txtSitioWeb.setBounds(179, 450, 231, 19);
		getContentPane().add(txtSitioWeb);
		txtSitioWeb.setColumns(10);
		
		JComboBox cbInstituto = new JComboBox();
		cbInstituto.setModel(new DefaultComboBoxModel(new String[] {"Instituto1", "Instituto2", "Instituto3"}));
		cbInstituto.setBounds(179, 371, 231, 24);
		getContentPane().add(cbInstituto);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setText("Descripcion");
		txtDescripcion.setBounds(179, 398, 231, 19);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtBiografia = new JTextField();
		txtBiografia.setText("Biografia");
		txtBiografia.setBounds(179, 423, 231, 19);
		getContentPane().add(txtBiografia);
		txtBiografia.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Profesor"}));
		cbTipo.setBounds(179, 27, 231, 24);
		getContentPane().add(cbTipo);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario.setBounds(26, 32, 130, 15);
		getContentPane().add(lblTipoDeUsuario);
		
		tbUsuario = new JTable();
		tbUsuario.setBounds(12, 63, 416, 153);
		getContentPane().add(tbUsuario);
		
		JLabel lblClases = new JLabel("Clases:");
		lblClases.setBounds(22, 519, 70, 15);
		getContentPane().add(lblClases);
		
		JLabel lblActividadesDeportivas = new JLabel("Actividades deportivas:");
		lblActividadesDeportivas.setBounds(12, 676, 173, 15);
		getContentPane().add(lblActividadesDeportivas);
		
		tbClases = new JTable();
		tbClases.setBounds(12, 548, 416, 116);
		getContentPane().add(tbClases);
		
		tbActividadDeportiva = new JTable();
		tbActividadDeportiva.setBounds(22, 703, 406, 57);
		getContentPane().add(tbActividadDeportiva);

	}
}
