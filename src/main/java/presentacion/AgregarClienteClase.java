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

public class AgregarClienteClase extends JInternalFrame {
	private JTable tbClase;
	private JTable tbCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarClienteClase frame = new AgregarClienteClase();
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
	public AgregarClienteClase() {
		setResizable(true);
		setClosable(true);
		setTitle("Agregar cliente a clase");
		setBounds(100, 100, 450, 446);
		getContentPane().setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(106, 375, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(249, 375, 117, 25);
		getContentPane().add(btnCancelar);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 17, 106, 15);
		getContentPane().add(lblInstitucin);
		
		JComboBox cbInstitucion = new JComboBox();
		cbInstitucion.setBounds(179, 12, 249, 24);
		getContentPane().add(cbInstitucion);
		
		JLabel lblActividadDeportiva = new JLabel("Actividad deportiva:");
		lblActividadDeportiva.setBounds(30, 63, 147, 15);
		getContentPane().add(lblActividadDeportiva);
		
		JComboBox cbActividadDeportiva = new JComboBox();
		cbActividadDeportiva.setBounds(179, 58, 249, 24);
		getContentPane().add(cbActividadDeportiva);
		
		JLabel lblClase = new JLabel("Clase:");
		lblClase.setBounds(30, 109, 70, 15);
		getContentPane().add(lblClase);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(30, 237, 70, 15);
		getContentPane().add(lblCliente);
		
		tbClase = new JTable();
		tbClase.setBounds(12, 136, 416, 98);
		getContentPane().add(tbClase);
		
		tbCliente = new JTable();
		tbCliente.setBounds(12, 273, 416, 90);
		getContentPane().add(tbCliente);

	}
}
