package Logica;

public class Fecha_Compra  {
	private Socio sc;
	private Cuponera cpn;
	private Fecha fch;
	
	public Fecha_Compra(Socio s, Cuponera c, Fecha f) {
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
	
	public Fecha getFecha() {
		return fch;
	}
	
	public void setSocio(Socio s) {
		sc=s;
	}
	
	public void setCuponera(Cuponera c) {
		cpn=c;
	}
	
	public void setFecha(Fecha f) {
		fch=f;
	}
}
