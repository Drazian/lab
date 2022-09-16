package laboratorio;

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

public class RegistroCuponera extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtDescripcin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroCuponera frame = new RegistroCuponera();
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
	public RegistroCuponera() {
		setResizable(true);
		setClosable(true);
		setTitle("Registro Cuponera");
		setBounds(100, 100, 450, 262);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(95, 193, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(238, 193, 117, 25);
		getContentPane().add(btnCancelar);
		
		JSpinner spDia = new JSpinner();
		spDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spDia.setBounds(179, 97, 52, 20);
		getContentPane().add(spDia);
		
		JSpinner spMes = new JSpinner();
		spMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spMes.setBounds(251, 97, 52, 20);
		getContentPane().add(spMes);
		
		JSpinner spAnio = new JSpinner();
		spAnio.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spAnio.setBounds(315, 97, 71, 20);
		getContentPane().add(spAnio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 41, 70, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(30, 97, 92, 15);
		getContentPane().add(lblFechaInicio);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 39, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescuento = new JLabel("Descuento (%):");
		lblDescuento.setBounds(30, 163, 117, 15);
		getContentPane().add(lblDescuento);
		
		JSpinner spSocioMinimo = new JSpinner();
		spSocioMinimo.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spSocioMinimo.setBounds(179, 161, 52, 20);
		getContentPane().add(spSocioMinimo);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner.setBounds(179, 129, 52, 20);
		getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setBounds(251, 129, 52, 20);
		getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spinner_2.setBounds(315, 129, 71, 20);
		getContentPane().add(spinner_2);
		
		JLabel lblFechaFin = new JLabel("Fecha fin:");
		lblFechaFin.setBounds(30, 129, 92, 15);
		getContentPane().add(lblFechaFin);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setBounds(30, 70, 117, 15);
		getContentPane().add(lblDescripcin);
		
		txtDescripcin = new JTextField();
		txtDescripcin.setText("Descripción");
		txtDescripcin.setBounds(179, 68, 231, 19);
		getContentPane().add(txtDescripcin);
		txtDescripcin.setColumns(10);

	}
}
