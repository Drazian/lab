package persistencia;

import java.util.HashSet;
import java.time.*;

public class Socio extends Usuario{
	private HashSet<Fecha_Compra> cupon;
	private HashSet<Fecha_Registro> anotado;
	
	public Socio(String ni, String n, String ap, String ma, LocalDate f,String foto) {
		super(ni, n, ap, ma, f, foto);
		this.cupon = new HashSet<Fecha_Compra>();
		this.anotado = new HashSet<Fecha_Registro>();
	}
	
	public HashSet<Fecha_Registro> getClases(){
		return anotado;
	}
	
	public void registrarse(Clase c) {
		Fecha_Registro fr=new Fecha_Registro(this,c,LocalDate.now());
		anotado.add(fr);
	}
	
}