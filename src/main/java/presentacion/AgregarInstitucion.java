package laboratorio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import Logica.Fabrica;
import Logica.IController;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarInstitucion extends JInternalFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtDesc;
	private JTextField txtUrl;
    private JButton btnAceptar;
    private JButton btnCancelar;
    
	private static IController control;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarInstitucion frame = new AgregarInstitucion(control);
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
	public AgregarInstitucion(IController ICU) {
		control = ICU;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Agregar Institución");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 40, 70, 15);
		contentPane.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 88, 102, 15);
		contentPane.add(lblDescripcion);
		
		JLabel lblSitioWeb = new JLabel("Sitio Web");
		lblSitioWeb.setBounds(12, 133, 70, 15);
		contentPane.add(lblSitioWeb);
		
		txtNom = new JTextField();
		txtNom.setText("Nombre");
		txtNom.setBounds(113, 38, 325, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtDesc = new JTextField();
		txtDesc.setText("Descripcion");
		txtDesc.setColumns(10);
		txtDesc.setBounds(113, 86, 325, 19);
		contentPane.add(txtDesc);
		
		txtUrl = new JTextField();
		txtUrl.setText("URL");
		txtUrl.setColumns(10);
		txtUrl.setBounds(113, 129, 319, 19);
		contentPane.add(txtUrl);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control.getIns().containsKey(txtNom.getText())) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "Ese Nombre ya esta usado, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					control.altaInstitucion(txtNom.getText(),txtDesc.getText(),txtUrl.getText());
					setVisible(false);
				}
			}
		});
		btnAceptar.setBounds(54, 186, 117, 25);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
			}
		});
		btnCancelar.setBounds(278, 186, 117, 25);
		contentPane.add(btnCancelar);
		
	}
	
}
