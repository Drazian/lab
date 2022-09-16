package laboratorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.SwingConstants;

import Logica.IController;
import Logica.Fabrica;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class VentanaPrincipal {

	private JFrame frmVentanaPrincipal;
    private IController cont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmVentanaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		Fabrica fabrica = Fabrica.getInstance();
        cont = fabrica.getIController();
		initialize(cont);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(IController cont) {
		IController ICU=cont;
		frmVentanaPrincipal = new JFrame();
		frmVentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaPrincipal.setAlwaysOnTop(true);
		frmVentanaPrincipal.setBounds(100, 100, 476, 372);
		
		JMenuBar menuBar = new JMenuBar();
		frmVentanaPrincipal.setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenuItem mntmRegistroCliente = new JMenuItem("Registro usuario");
		mntmRegistroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroUsuario aux= new RegistroUsuario(ICU);
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();
			}
		});

		mnRegistro.add(mntmRegistroCliente);
		
		JMenuItem mntmRegistroActividadDeportiva = new JMenuItem("Registro actividad deportiva");
		mntmRegistroActividadDeportiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroActividadDeportiva aux= new RegistroActividadDeportiva(ICU);
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();
			}
		});
		mnRegistro.add(mntmRegistroActividadDeportiva);
		
		JMenuItem mntmRegistroDictadoDe = new JMenuItem("Registro dictado de clase");
		mntmRegistroDictadoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroDictadoClase aux= new RegistroDictadoClase(ICU);
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();				
			}
		});
		mnRegistro.add(mntmRegistroDictadoDe);
		
		JMenuItem mntmAgregarADictado = new JMenuItem("Agregar a dictado de clase");
		mntmAgregarADictado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarClienteClase aux= new AgregarClienteClase();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();
			}
		});
		mnRegistro.add(mntmAgregarADictado);
		
		JMenuItem mntmRegistroCuponera = new JMenuItem("Registro cuponera");
		mntmRegistroCuponera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroCuponera aux= new RegistroCuponera();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();	
			}
		});
		mnRegistro.add(mntmRegistroCuponera);
		
		JMenuItem mntmAgregarACuponera = new JMenuItem("Agregar actividad a cuponera");
		mntmAgregarACuponera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarActividadCuponera aux= new AgregarActividadCuponera();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();	
			}
		});
		mnRegistro.add(mntmAgregarACuponera);
		
		JMenuItem mntmAgregarInstitucion = new JMenuItem("Agregar Institucion");
		mntmAgregarInstitucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarInstitucion aux= new AgregarInstitucion(ICU); 
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.setVisible(true);
			}
		});
		mnRegistro.add(mntmAgregarInstitucion);
		
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		JMenuItem mntmConsultaCliente = new JMenuItem("Consulta usuario");
		mntmConsultaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaUsuario aux= new ConsultaUsuario();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();					
			}
		});
		
		mnConsultas.add(mntmConsultaCliente);
		
		JMenuItem mntmConsultaActividadDeportiva = new JMenuItem("Consulta actividad deportiva");
		mntmConsultaActividadDeportiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaActividadDeportiva aux= new ConsultaActividadDeportiva();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();	
			}
		});
		mnConsultas.add(mntmConsultaActividadDeportiva);
		
		JMenuItem mntmConsultaDictadoDe = new JMenuItem("Consulta dictado de clase");
		mntmConsultaDictadoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaDictadoClase aux= new ConsultaDictadoClase();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();			
			}
		});
		mnConsultas.add(mntmConsultaDictadoDe);
		
		JMenuItem mntmConsultaCuponera = new JMenuItem("Consulta cuponera");
		mntmConsultaCuponera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaCuponera aux= new ConsultaCuponera(ICU);
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();	
			}
		});
		mnConsultas.add(mntmConsultaCuponera);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		JMenuItem mntmModificarDatosCliente = new JMenuItem("Modificar datos usuario");
		mntmModificarDatosCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModificarUsuario aux= new ModificarUsuario();
				frmVentanaPrincipal.getContentPane().add(aux);
				aux.show();	
			}
		});
		mnModificar.add(mntmModificarDatosCliente);
		frmVentanaPrincipal.getContentPane().setLayout(null);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
