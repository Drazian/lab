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

public class AgregarActividadCuponera extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarActividadCuponera frame = new AgregarActividadCuponera();
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
	public AgregarActividadCuponera() {
		setResizable(true);
		setClosable(true);
		setTitle("Agregar actividad deportiva a cuponera");
		setBounds(100, 100, 450, 262);
		getContentPane().setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(95, 193, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(238, 193, 117, 25);
		getContentPane().add(btnCancelar);
		
		JLabel lblClases = new JLabel("Cantidad de clases:");
		lblClases.setBounds(30, 163, 147, 15);
		getContentPane().add(lblClases);
		
		JSpinner spClases = new JSpinner();
		spClases.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spClases.setBounds(179, 161, 52, 20);
		getContentPane().add(spClases);
		
		JComboBox cbCuponera = new JComboBox();
		cbCuponera.setBounds(179, 12, 249, 24);
		getContentPane().add(cbCuponera);
		
		JLabel lblCuponera = new JLabel("Cuponera:");
		lblCuponera.setBounds(30, 17, 106, 15);
		getContentPane().add(lblCuponera);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 63, 106, 15);
		getContentPane().add(lblInstitucin);
		
		JComboBox cbInstitucion = new JComboBox();
		cbInstitucion.setBounds(179, 58, 249, 24);
		getContentPane().add(cbInstitucion);
		
		JLabel lblActividadDeportiva = new JLabel("Actividad deportiva:");
		lblActividadDeportiva.setBounds(30, 109, 147, 15);
		getContentPane().add(lblActividadDeportiva);
		
		JComboBox cbActividadDeportiva = new JComboBox();
		cbActividadDeportiva.setBounds(179, 104, 249, 24);
		getContentPane().add(cbActividadDeportiva);

	}
}
