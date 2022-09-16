package Logica;

import java.util.HashSet;

public class Cuponera{
	private String nombre,descripcion;
	private int descuento;
	private Fecha fecha_ini, fecha_fin;
	private HashSet<Clases_contenidas> cont;
	
	public Cuponera(String n, String d, int desc, Fecha fi, Fecha ff) {
		this.nombre=n;
		this.descripcion=d;
		this.descuento=desc;
		this.fecha_ini=fi;
		this.fecha_fin=ff;
		cont = new HashSet<Clases_contenidas>();
	}

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDescuento() {
        return descuento;
    }
    
    public Fecha getFecha_ini() {
    	return fecha_ini;
    }
    
    public Fecha getFecha_fin() {
    	return fecha_fin;
    }
    
    public HashSet<Clases_contenidas> getClsCont(){
    	return cont;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setDescripcion(String n) {
        descripcion = n;
    }

    public void setDescuento(int ap) {
    	descuento = ap;
    }
    
    public void setFecha_ini(Fecha f) {
    	fecha_ini = f;
    }
    
    public void setFecha_fin(Fecha f) {
    	fecha_fin = f;
    }
    
}
