package persistencia;

import java.util.HashSet;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Socio extends Usuario implements Serializable{
	private HashSet<Fecha_Compra> cupon;
	private HashSet<Fecha_Registro> anotado;
	
	public Socio(String ni, String n, String ap, String ma, Fecha f) {
		super(ni, n, ap, ma, f);
		this.cupon = new HashSet<Fecha_Compra>();
		this.anotado = new HashSet<Fecha_Registro>();
	}
	
}