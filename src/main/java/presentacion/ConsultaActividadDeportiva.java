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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class ConsultaActividadDeportiva extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField textField;
	private JTextField txtCosto;
	private JTable tbActividades;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaActividadDeportiva frame = new ConsultaActividadDeportiva();
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
	public ConsultaActividadDeportiva() {
		setResizable(true);
		setClosable(true);
		setTitle("Consulta Actividad Deportiva");
		setBounds(100, 100, 450, 733);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 247, 92, 15);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 245, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(94, 640, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(237, 640, 117, 25);
		getContentPane().add(btnCancelar);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(30, 274, 92, 15);
		getContentPane().add(lblDescripcion);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 46, 92, 15);
		getContentPane().add(lblInstitucin);
		
		JLabel lblDuracion = new JLabel("Duración (min): ");
		lblDuracion.setBounds(30, 301, 124, 15);
		getContentPane().add(lblDuracion);
		
		JLabel lblCosto = new JLabel("Costo: ");
		lblCosto.setBounds(30, 328, 70, 15);
		getContentPane().add(lblCosto);
		
		textField = new JTextField();
		textField.setText("Descripcion");
		textField.setColumns(10);
		textField.setBounds(179, 276, 231, 19);
		getContentPane().add(textField);
		
		JComboBox cbInstituto = new JComboBox();
		cbInstituto.setModel(new DefaultComboBoxModel(new String[] {"Instituto1", "Instituto2", "Instituto3"}));
		cbInstituto.setBounds(179, 39, 231, 24);
		getContentPane().add(cbInstituto);
		
		txtCosto = new JTextField();
		txtCosto.setText("Costo");
		txtCosto.setBounds(179, 326, 231, 19);
		getContentPane().add(txtCosto);
		txtCosto.setColumns(10);
		
		JSpinner spDuracion = new JSpinner();
		spDuracion.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spDuracion.setBounds(179, 299, 64, 20);
		getContentPane().add(spDuracion);
		
		tbActividades = new JTable();
		tbActividades.setBounds(12, 76, 416, 157);
		getContentPane().add(tbActividades);
		
		table = new JTable();
		table.setBounds(12, 394, 416, 104);
		getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(12, 536, 416, 92);
		getContentPane().add(table_1);
		
		JLabel lblCuponeras = new JLabel("Cuponeras:");
		lblCuponeras.setBounds(12, 377, 117, 15);
		getContentPane().add(lblCuponeras);
		
		JLabel lblClasesDictadas = new JLabel("Clases dictadas:");
		lblClasesDictadas.setBounds(12, 510, 142, 15);
		getContentPane().add(lblClasesDictadas);

	}
}
