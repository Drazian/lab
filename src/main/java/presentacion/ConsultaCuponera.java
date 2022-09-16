package laboratorio;

import java.awt.EventQueue; 

import Logica.IController;
import Logica.Cuponera;
import Logica.Institucion;
import Logica.Actividad;
import Logica.Clases_contenidas;

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
import java.time.*;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaCuponera extends JInternalFrame {
	private IController control;
	private JComboBox cmbNombre;
	private JTextField txtCpnDesc;
	private JTextField txtActDesc;
	private JTextField txtIns;
	private JTextField txtCosto;
	private JTextField txtCant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaCuponera frame = new ConsultaCuponera(control);
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
	public ConsultaCuponera(IController ICnt) {
		control = ICnt;
		setResizable(true);
		setClosable(true);
		setTitle("Consultar Cuponera");
		setBounds(100, 100, 509, 426);
		getContentPane().setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAceptar.setBounds(164, 354, 117, 25);
		getContentPane().add(btnAceptar);
		
		JTextField txtInicio = new JTextField();
		txtInicio.setEditable(false);
		txtInicio.setBounds(207, 66, 264, 20);
		getContentPane().add(txtInicio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 14, 70, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(34, 68, 92, 15);
		getContentPane().add(lblFechaInicio);
		
		JLabel lblDescuento = new JLabel("Descuento (%):");
		lblDescuento.setBounds(34, 139, 117, 15);
		getContentPane().add(lblDescuento);
		
		JTextField txtDesc = new JTextField();
		txtDesc.setEditable(false);
		txtDesc.setBounds(207, 137, 52, 20);
		getContentPane().add(txtDesc);
		
		JTextField txtFin = new JTextField();
		txtFin.setEditable(false);
		txtFin.setBounds(207, 102, 264, 20);
		getContentPane().add(txtFin);
		
		JLabel lblFechaFin = new JLabel("Fecha fin:");
		lblFechaFin.setBounds(34, 104, 92, 15);
		getContentPane().add(lblFechaFin);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setBounds(34, 41, 117, 15);
		getContentPane().add(lblDescripcin);
		
		txtCpnDesc = new JTextField("Descripcion");
		txtCpnDesc.setEditable(false);
		txtCpnDesc.setText("Descripción");
		txtCpnDesc.setBounds(207, 35, 264, 19);
		getContentPane().add(txtCpnDesc);
		txtCpnDesc.setColumns(10);
		
		JLabel lblActividadesDeportivas = new JLabel("Actividades deportivas:");
		lblActividadesDeportivas.setBounds(12, 166, 192, 15);
		getContentPane().add(lblActividadesDeportivas);
		
		JComboBox cmbAct = new JComboBox();
		cmbAct.addItem(" ");
		cmbAct.setBounds(207, 161, 264, 24);
		getContentPane().add(cmbAct);
		
		JLabel lblDescripcionDe = new JLabel("Descripción de Actividad:");
		lblDescripcionDe.setBounds(12, 197, 177, 25);
		getContentPane().add(lblDescripcionDe);
		
		txtActDesc = new JTextField("Descripción de la Actividad");
		txtActDesc.setEditable(false);
		txtActDesc.setBounds(207, 200, 264, 19);
		getContentPane().add(txtActDesc);
		txtActDesc.setColumns(10);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(37, 237, 114, 20);
		getContentPane().add(lblInstitucin);
		
		txtIns = new JTextField("Intitución");
		txtIns.setEditable(false);
		txtIns.setBounds(207, 238, 264, 19);
		getContentPane().add(txtIns);
		txtIns.setColumns(10);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setBounds(34, 269, 70, 15);
		getContentPane().add(lblCosto);
		
		txtCosto = new JTextField();
		txtCosto.setEditable(false);
		txtCosto.setBounds(207, 267, 52, 19);
		getContentPane().add(txtCosto);
		txtCosto.setColumns(10);
		
		JLabel lblCantidadDeClases = new JLabel("Cantidad de Clases:");
		lblCantidadDeClases.setBounds(34, 296, 155, 15);
		getContentPane().add(lblCantidadDeClases);
		
		txtCant = new JTextField();
		txtCant.setEditable(false);
		txtCant.setBounds(207, 298, 52, 19);
		getContentPane().add(txtCant);
		txtCant.setColumns(10);
		
		cmbNombre = new JComboBox();
		cmbNombre.addItem(" ");
		if(control.getCpn()!=null) {
			for(Map.Entry<String, Cuponera> hm:control.getCpn().entrySet()) {
				cmbNombre.addItem(hm.getKey());
			}
		}
		cmbNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuponera cpn=control.getCpn().get(cmbNombre.getSelectedItem().toString());
				txtCpnDesc.setText(cpn.getDescripcion());
				txtInicio.setText(cpn.getFecha_ini().getFecha().toString());
				txtFin.setText(cpn.getFecha_fin().getFecha().toString());
				txtDesc.setText(Integer.toString(cpn.getDescuento()));
				if(cmbAct.getItemCount()>1) {
					cmbAct.removeAllItems();
					cmbAct.addItem(" ");
				}
				Iterator<Clases_contenidas> ita=cpn.getClsCont().iterator();
				while(ita.hasNext()) {
					cmbAct.addItem(ita.next().getAct().getNombre());
				}
			}
		});
		cmbNombre.setBounds(207, 12, 264, 19);
		getContentPane().add(cmbNombre);

		cmbAct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Actividad a=control.getAct().get(cmbAct.getSelectedItem().toString());
				txtActDesc.setText(a.getDescripcion());
				txtIns.setText(a.getInstitucion().getNombre());
				txtCosto.setText(Integer.toString(a.getCosto()));
				Cuponera cpn=control.getCpn().get(cmbNombre.getSelectedItem().toString());
				Iterator<Clases_contenidas> ita=cpn.getClsCont().iterator();
				while((ita.hasNext())&&(ita.next().getAct().getNombre()!=a.getNombre())){}
				txtCant.setText(Integer.toString(ita.next().getCant()));
			}
		});

	}
}


































