package persistencia;

import java.time.LocalDate;

public class Fecha_Compra  {
	private Socio sc;
	private Cuponera cpn;
	private LocalDate fch;
	
	public Fecha_Compra(Socio s, Cuponera c, LocalDate f) {
		this.sc=s;
		this.cpn=c;
		this.fch=f;
	}
	
	public Socio getSocio() {
		return sc;
	}
	
	public Cuponera getCuponera() {
		return cpn;
	}
	
	public LocalDate getFecha() {
		return fch;
	}
	
	public void setSocio(Socio s) {
		sc=s;
	}
	
	public void setCuponera(Cuponera c) {
		cpn=c;
	}
	
	public void setFecha(LocalDate f) {
		fch=f;
	}
}
