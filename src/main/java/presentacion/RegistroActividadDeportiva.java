package laboratorio;

import java.awt.EventQueue; 

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import persistencia.IController;
import persistencia.Institucion;
import persistencia.Fecha;

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
import java.util.Map;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroActividadDeportiva extends JInternalFrame {
	private IController ICnt;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField txtCosto;
	private JTextField txtDuracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroActividadDeportiva frame = new RegistroActividadDeportiva();
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
	public RegistroActividadDeportiva() {
		IController control = ICnt;
		setResizable(true);
		setClosable(true);
		setTitle("Registro Actividad Deportiva");
		setBounds(100, 100, 450, 253);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 75, 92, 15);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 73, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(30, 102, 92, 15);
		getContentPane().add(lblDescripcion);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 46, 92, 15);
		getContentPane().add(lblInstitucin);
		
		JLabel lblDuracion = new JLabel("Duración (min): ");
		lblDuracion.setBounds(30, 129, 124, 15);
		getContentPane().add(lblDuracion);
		
		JLabel lblCosto = new JLabel("Costo: ");
		lblCosto.setBounds(30, 156, 70, 15);
		getContentPane().add(lblCosto);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setText("Descripcion");
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(179, 104, 231, 19);
		getContentPane().add(txtDescripcion);
		
		JComboBox cbInstituto = new JComboBox();
		if(control.getIns()!=null) {
			for(Map.Entry<String, Institucion> hm:control.getIns().entrySet()) {
				cbInstituto.addItem(hm.getKey());	
			}			
		}
		cbInstituto.setBounds(179, 39, 231, 24);
		getContentPane().add(cbInstituto);
		
		txtCosto = new JTextField();
		txtCosto.setText("Costo");
		txtCosto.setBounds(179, 154, 231, 19);
		getContentPane().add(txtCosto);
		txtCosto.setColumns(10);
		
		txtDuracion = new JTextField();
		txtDuracion.setText("Duracion");
		txtDuracion.setBounds(179, 127, 231, 19);
		getContentPane().add(txtDuracion);
		txtDuracion.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control.getIns()!=null) {
					if(control.getAct().containsKey(txtNombre.getText())) {
						JFrame f=new JFrame();
						JOptionPane.showMessageDialog(f, "Ese Nombre ya esta usado, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
					}else {
						Institucion i=control.getIns().get(cbInstituto.getSelectedItem().toString());
						Fecha f= new Fecha(LocalDate.now());
						control.altaActividad(txtNombre.getText(),txtDescripcion.getText(),Integer.parseInt(txtDuracion.getText()),Integer.parseInt(txtCosto.getText()),f,i);
					}
				}
			}
		});
		btnAceptar.setBounds(97, 183, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
			}
		});
		btnCancelar.setBounds(240, 183, 117, 25);
		getContentPane().add(btnCancelar);

	}
}
