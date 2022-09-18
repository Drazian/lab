package presentacion;

import java.awt.EventQueue; 

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import persistencia.*;

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
import java.util.Iterator;
import java.util.Map;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaActividadDeportiva extends JInternalFrame {
	private IController control;
	private JTextField txtDesc;
	private JTextField txtCosto;
	private JTextField txtCuDesc;
	private JTextField txtDescu;
	private JTextField txtFIni;
	private JTextField txtFFin;
	private JTextField txtCMax;
	private JTextField txtUrl;
	private JTextField txtCMin;
	private JTextField txtCDisp;
	private JTextField txtF;
	private JTextField txtHDict;
	private JTextField txtProf;

	/**
	 * Launch the application.
	 *
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
	public ConsultaActividadDeportiva(IController ICnt) {
		control=ICnt;
		setResizable(true);
		setClosable(true);
		setTitle("Consulta Actividad Deportiva");
		setBounds(100, 100, 804, 477);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAceptar.setBounds(368, 404, 117, 25);
		getContentPane().add(btnAceptar);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(30, 124, 92, 15);
		getContentPane().add(lblDescripcion);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 46, 92, 15);
		getContentPane().add(lblInstitucin);
		
		JLabel lblDuracion = new JLabel("Duración (min): ");
		lblDuracion.setBounds(428, 124, 124, 15);
		getContentPane().add(lblDuracion);
		
		JLabel lblCosto = new JLabel("Costo: ");
		lblCosto.setBounds(40, 151, 70, 15);
		getContentPane().add(lblCosto);
		
		txtDesc = new JTextField();
		txtDesc.setEditable(false);
		txtDesc.setText("Descripcion");
		txtDesc.setColumns(10);
		txtDesc.setBounds(179, 122, 231, 19);
		getContentPane().add(txtDesc);
		
		JComboBox cmbInstituto = new JComboBox();
		cmbInstituto.addItem(" ");
		if(control.getIns()!=null) {
			for(Map.Entry<String, Institucion> hm:control.getIns().entrySet()) {
				cmbInstituto.addItem(hm.getKey());	
			}
		}
		cmbInstituto.setBounds(179, 39, 231, 24);
		getContentPane().add(cmbInstituto);
		
		txtCosto = new JTextField();
		txtCosto.setEditable(false);
		txtCosto.setText("Costo");
		txtCosto.setBounds(179, 149, 231, 19);
		getContentPane().add(txtCosto);
		txtCosto.setColumns(10);
		
		JTextField txtDur = new JTextField();
		txtDur.setEditable(false);
		txtDur.setBounds(556, 122, 64, 20);
		getContentPane().add(txtDur);
		
		JLabel lblCuponeras = new JLabel("Cuponeras:");
		lblCuponeras.setBounds(428, 189, 117, 15);
		getContentPane().add(lblCuponeras);
		
		JLabel lblClasesDictadas = new JLabel("Clases dictadas:");
		lblClasesDictadas.setBounds(30, 189, 142, 15);
		getContentPane().add(lblClasesDictadas);
		
		JLabel lblActividad = new JLabel("Actividad:");
		lblActividad.setBounds(30, 73, 70, 15);
		getContentPane().add(lblActividad);
		
		JComboBox cmbActividad = new JComboBox();
		cmbActividad.addItem(" ");
		cmbActividad.setBounds(179, 75, 231, 24);
		getContentPane().add(cmbActividad);
		
		JComboBox cmbClases = new JComboBox();
		cmbClases.addItem(" ");
		cmbClases.setBounds(164, 185, 246, 24);
		getContentPane().add(cmbClases);
		
		JComboBox cmbCupon = new JComboBox();
		cmbCupon.addItem(" ");
		cmbCupon.setBounds(531, 189, 231, 24);
		getContentPane().add(cmbCupon);
		
		JLabel lblDesc = new JLabel("Descripcion:");
		lblDesc.setBounds(428, 237, 92, 15);
		getContentPane().add(lblDesc);
		
		JLabel lblDescu = new JLabel("Descuento:");
		lblDescu.setBounds(435, 279, 85, 15);
		getContentPane().add(lblDescu);
		
		JLabel lblFIni = new JLabel("FechaInicio:");
		lblFIni.setBounds(435, 317, 85, 15);
		getContentPane().add(lblFIni);
		
		JLabel lblFFIn = new JLabel("FechaFin:");
		lblFFIn.setBounds(450, 358, 70, 15);
		getContentPane().add(lblFFIn);
		
		txtCuDesc = new JTextField();
		txtCuDesc.setEditable(false);
		txtCuDesc.setBounds(520, 235, 242, 19);
		getContentPane().add(txtCuDesc);
		txtCuDesc.setColumns(10);
		
		txtDescu = new JTextField();
		txtDescu.setEditable(false);
		txtDescu.setBounds(530, 277, 90, 19);
		getContentPane().add(txtDescu);
		txtDescu.setColumns(10);
		
		txtFIni = new JTextField();
		txtFIni.setEditable(false);
		txtFIni.setBounds(531, 315, 231, 19);
		getContentPane().add(txtFIni);
		txtFIni.setColumns(10);
		
		txtFFin = new JTextField();
		txtFFin.setEditable(false);
		txtFFin.setColumns(10);
		txtFFin.setBounds(531, 356, 231, 19);
		getContentPane().add(txtFFin);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(50, 226, 37, 15);
		getContentPane().add(lblUrl);
		
		JLabel lblCMin = new JLabel("CuposMin:");
		lblCMin.setBounds(12, 253, 74, 15);
		getContentPane().add(lblCMin);
		
		JLabel lblCMax = new JLabel("CuposMax:");
		lblCMax.setBounds(12, 279, 92, 15);
		getContentPane().add(lblCMax);
		
		txtCMax = new JTextField();
		txtCMax.setEditable(false);
		txtCMax.setBounds(105, 277, 70, 19);
		getContentPane().add(txtCMax);
		txtCMax.setColumns(10);
		
		txtUrl = new JTextField();
		txtUrl.setEditable(false);
		txtUrl.setColumns(10);
		txtUrl.setBounds(105, 224, 190, 19);
		getContentPane().add(txtUrl);
		
		txtCMin = new JTextField();
		txtCMin.setEditable(false);
		txtCMin.setColumns(10);
		txtCMin.setBounds(105, 251, 70, 19);
		getContentPane().add(txtCMin);
		
		JLabel lblCuposdisp = new JLabel("CuposDisp:");
		lblCuposdisp.setBounds(12, 306, 88, 15);
		getContentPane().add(lblCuposdisp);
		
		txtCDisp = new JTextField();
		txtCDisp.setEditable(false);
		txtCDisp.setColumns(10);
		txtCDisp.setBounds(105, 306, 70, 19);
		getContentPane().add(txtCDisp);
		
		JLabel lblFechadictada = new JLabel("FechaDictada:");
		lblFechadictada.setBounds(5, 337, 105, 15);
		getContentPane().add(lblFechadictada);
		
		txtF = new JTextField();
		txtF.setEditable(false);
		txtF.setBounds(118, 337, 148, 19);
		getContentPane().add(txtF);
		txtF.setColumns(10);
		
		JLabel lblHoradictada = new JLabel("HoraDictada:");
		lblHoradictada.setBounds(12, 366, 93, 15);
		getContentPane().add(lblHoradictada);
		
		txtHDict = new JTextField();
		txtHDict.setEditable(false);
		txtHDict.setColumns(10);
		txtHDict.setBounds(118, 364, 148, 19);
		getContentPane().add(txtHDict);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setBounds(12, 404, 70, 15);
		getContentPane().add(lblProfesor);
		
		txtProf = new JTextField();
		txtProf.setEditable(false);
		txtProf.setColumns(10);
		txtProf.setBounds(118, 402, 148, 19);
		getContentPane().add(txtProf);

		cmbInstituto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Institucion i=control.getIns().get(cmbInstituto.getSelectedItem().toString());
				Iterator<Actividad> iti=i.getActividades().iterator();
				if(cmbActividad.getItemCount()>1) {
					cmbActividad.removeAllItems();
					cmbActividad.addItem(" ");
				}
				while(iti.hasNext()) {
					cmbActividad.addItem(iti.next().getNombre());
				}
			}
		});
		

		cmbActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Institucion i=control.getIns().get(cmbInstituto.getSelectedItem().toString());
				Iterator<Actividad> iti=i.getActividades().iterator();
				while(iti.next().getNombre()!=cmbActividad.getSelectedItem().toString()) {}
				Actividad a=iti.next();
				txtDesc.setText(a.getDescripcion());
				txtCosto.setText(((Integer)a.getCosto()).toString());
				txtDur.setText(((Integer)a.getDuracion()).toString());
				if(cmbClases.getItemCount()>1) {
					cmbClases.removeAllItems();
					cmbClases.addItem(" ");
				}
				if(cmbCupon.getItemCount()>1) {
					cmbCupon.removeAllItems();
					cmbCupon.addItem(" ");
				}
				for(Map.Entry<String, Clase> hm:a.getClases().entrySet()) {
					cmbClases.addItem(hm.getKey());
				}
				Iterator<Clases_contenidas> ita=a.getCpn().iterator();
				while(ita.hasNext()) {
					cmbCupon.addItem(ita.next().getCupon().getNombre());	
				}
			}
		});

		cmbClases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Institucion i=control.getIns().get(cmbInstituto.getSelectedItem().toString());
				Iterator<Actividad> iti=i.getActividades().iterator();
				while(iti.next().getNombre()!=cmbActividad.getSelectedItem().toString()) {}
				Actividad a=iti.next();
				Clase c=a.getClases().get(cmbClases.getSelectedItem().toString());
				txtUrl.setText(c.getUrl());
				txtF.setText(c.getFecha_dict().toString());
				txtHDict.setText(c.getHora_dict().toString());
				txtProf.setText(c.getProf().getNick());
				txtCMin.setText(((Integer)c.getRmin()).toString());
				txtCMax.setText(((Integer)c.getRmax()).toString());
				txtCDisp.setText(((Integer)c.getRegis()).toString());
			}
		});

		cmbCupon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuponera c=control.getCpn().get(cmbCupon.getSelectedItem().toString());
				txtCuDesc.setText(c.getDescripcion());
				txtDescu.setText(((Integer)c.getDescuento()).toString());
				txtFIni.setText(c.getFecha_ini().toString());
				txtFFin.setText(c.getFecha_fin().toString());
			}
		});

	}
}
