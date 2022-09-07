package laboratorio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import persistencia.Fabrica;
import persistencia.IController;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarInstitucion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtDesc;
	private JTextField txtUrl;
    private JButton btnAceptar;
    private JButton btnCancelar;
    
    private static Fabrica fab= Fabrica.getInstance();
	private static IController IC=fab.getIController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarInstitucion frame = new AgregarInstitucion(IC);
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
	public AgregarInstitucion(IController ICnt) {
		IController control = ICnt;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				if(ICnt.getIns().containsKey(txtNom.getText())) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "Ese Nombre ya esta usado, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					crearInst(e,ICnt);	
				}
			}
		});
		btnAceptar.setBounds(54, 186, 117, 25);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
                setVisible(false);
			}
		});
		btnCancelar.setBounds(278, 186, 117, 25);
		contentPane.add(btnCancelar);
		
	}
	
	private void crearInst(ActionEvent e,IController ic) {
		String nom=this.txtNom.getText();
		String desc=this.txtDesc.getText();
		String url=this.txtUrl.getText();
		ic.altaInstitucion(nom, desc, url);
	}
	
	private void limpiar() {
		txtNom.setText("Nombre");
		txtDesc.setText("Descripcion");
		txtUrl.setText("Url");
	}
	
}




















