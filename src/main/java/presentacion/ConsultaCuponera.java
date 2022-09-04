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

public class ConsultaCuponera extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtDescripcin;
	private JTable tbCuponera;
	private JTable tbActividades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaCuponera frame = new ConsultaCuponera();
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
	public ConsultaCuponera() {
		setResizable(true);
		setClosable(true);
		setTitle("Consulta Cuponera");
		setBounds(100, 100, 450, 599);
		getContentPane().setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(100, 530, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(243, 530, 117, 25);
		getContentPane().add(btnCancelar);
		
		JSpinner spDia = new JSpinner();
		spDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spDia.setBounds(183, 269, 52, 20);
		getContentPane().add(spDia);
		
		JSpinner spMes = new JSpinner();
		spMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spMes.setBounds(255, 269, 52, 20);
		getContentPane().add(spMes);
		
		JSpinner spAnio = new JSpinner();
		spAnio.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spAnio.setBounds(319, 269, 71, 20);
		getContentPane().add(spAnio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 213, 70, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(34, 269, 92, 15);
		getContentPane().add(lblFechaInicio);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(183, 211, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescuento = new JLabel("Descuento (%):");
		lblDescuento.setBounds(34, 335, 117, 15);
		getContentPane().add(lblDescuento);
		
		JSpinner spSocioMinimo = new JSpinner();
		spSocioMinimo.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spSocioMinimo.setBounds(183, 333, 52, 20);
		getContentPane().add(spSocioMinimo);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner.setBounds(183, 301, 52, 20);
		getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setBounds(255, 301, 52, 20);
		getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spinner_2.setBounds(319, 301, 71, 20);
		getContentPane().add(spinner_2);
		
		JLabel lblFechaFin = new JLabel("Fecha fin:");
		lblFechaFin.setBounds(34, 301, 92, 15);
		getContentPane().add(lblFechaFin);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setBounds(34, 242, 117, 15);
		getContentPane().add(lblDescripcin);
		
		txtDescripcin = new JTextField();
		txtDescripcin.setText("Descripción");
		txtDescripcin.setBounds(183, 240, 231, 19);
		getContentPane().add(txtDescripcin);
		txtDescripcin.setColumns(10);
		
		tbCuponera = new JTable();
		tbCuponera.setBounds(12, 12, 416, 187);
		getContentPane().add(tbCuponera);
		
		tbActividades = new JTable();
		tbActividades.setBounds(12, 398, 416, 112);
		getContentPane().add(tbActividades);
		
		JLabel lblActividadesDeportivas = new JLabel("Actividades deportivas:");
		lblActividadesDeportivas.setBounds(12, 371, 192, 15);
		getContentPane().add(lblActividadesDeportivas);

	}
}
