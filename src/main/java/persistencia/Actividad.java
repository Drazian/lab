package Logica;

import java.util.HashSet;
import java.util.HashMap; 

public class Actividad{
	private String nombre,descripcion;
	private int costo, duracion;
	private Fecha fecha_reg;
	private Institucion ins;
	private HashSet<Clases_contenidas> asociadas;
	private HashMap<String, Clase> cls;
	
	
	public Actividad(String n, String d, int c, int dur, Fecha f, Institucion i) {
		this.costo = c;
		this.duracion = dur;
		this.descripcion = d;
		this.nombre = n;
		this.fecha_reg = f;
		this.ins = i;
		this.asociadas = new HashSet<Clases_contenidas>();
		this.cls = new HashMap<String, Clase>();
	}

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public Fecha getFecha_reg() {
    	return fecha_reg;
    }
    
    public Institucion getInstitucion() {
    	return ins;
    }
    
    public HashMap<String, Clase> getClases(){
    	return cls;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setDescripcion(String n) {
        descripcion = n;
    }

    public void setCosto(int ap) {
    	costo = ap;
    }
    
    public void setFecha_reg(Fecha f) {
    	fecha_reg = f;
    }
    
    public void setDuracion(int d) {
    	duracion = d;
    }
    
    public void setInstitucion(Institucion i) {
    	ins = i;
    }
    
    public void altaClase(String n, String u, int rmin, int rmax, Fecha fr, Fecha fd, Profesor p, Hora h) {
    	Clase c=new Clase(n,u,rmin,rmax,fr,fd,this,p,h);
    	cls.put(n, c);
    	p.addClases(c);
    }
}
