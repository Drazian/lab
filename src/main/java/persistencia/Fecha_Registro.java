package persistencia;

public class Fecha_Registro {
	private Socio sc;
	private Clase cls;
	private Fecha fch;
	
	public Fecha_Registro(Socio s, Clase c, Fecha f) {
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
	
	public Fecha getFecha() {
		return fch;
	}
	
	public void setSocio(Socio s) {
		sc=s;
	}
	
	public void setClase(Clase c) {
		cls=c;
	}
	
	public void setFecha(Fecha f) {
		fch=f;
	}
}
