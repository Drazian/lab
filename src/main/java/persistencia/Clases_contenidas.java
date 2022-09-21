package persistencia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Clases_contenidas implements Serializable {
        @Id
        @ManyToOne
	private Cuponera cupon;
        @Id
        @OneToOne
	private Actividad act;
	private int cantidad;
	
        public Clases_contenidas(){
            
        }
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