package persistencia;
import java.io.Serializable;
import javax.persistence.*;

import java.time.LocalDate;

@Entity
public class Fecha_Registro implements Serializable {
        @Id @ManyToOne
	private Socio sc;
        @Id
        @ManyToOne
	private Clase cls;
	private LocalDate fch;
	
	public Fecha_Registro(){}
        public Fecha_Registro(Socio s, Clase c, LocalDate f) {
		this.sc=s;
		this.cls=c;
		this.fch=f;
	}
	
	public Socio getSocio() {
		return sc;
	}
	
	public Clase getClase() {
		return cls;
	}
	
	public LocalDate getFecha() {
		return fch;
	}
	
	public void setSocio(Socio s) {
		sc=s;
	}
	
	public void setClase(Clase c) {
		cls=c;
	}
	
	public void setFecha(LocalDate f) {
		fch=f;
	}
}