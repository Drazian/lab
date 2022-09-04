package persistencia;

import persistencia.Actividad;
import persistencia.Actividad;

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
public class Clases_contenidas implements Serializable{
        @Id
	private Cuponera cupon;
	@Id
        private Actividad act;
	private int cantidad;
	
	public Clases_contenidas(Cuponera cpn, Actividad a, int cant) {
		this.cupon=cpn;
		this.act=a;
		this.cantidad=cant;		
	}
	
	public Cuponera getCupon() {
		return cupon;
	}
	
	public Actividad getAct() {
		return act;
	}
	
	public int getCant() {
		return cantidad;
	}
	
	public void setCpn(Cuponera c) {
		cupon=c;
	}
	
	public void setAct(Actividad a) {
		act=a;
	}
	
	public void setCant(int c) {
		cantidad=c;
	}

}
