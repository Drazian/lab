package Logica;

import java.util.HashSet;

public class Institucion {
	private String nombre,descripcion,url;
	private HashSet<Actividad> act;
	private HashSet<Profesor> prof;
	
	public Institucion(String n, String d, String u) {
		this.nombre=n;
		this.descripcion=d;
		this.url=u;
		this.act=new HashSet<Actividad>();
		this.prof=new HashSet<Profesor>();
	}

    public String getNombre() {
        return nombre;
    }

    public String getDesc() {
        return descripcion;
    }

    public String getUrl() {
        return url;
    }
    
    public HashSet<Actividad> getActividades(){
    	return act;
    }
    
    public HashSet<Profesor> getProfesores(){
    	return prof;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setDesc(String n) {
        descripcion = n;
    }
    
    public void setUrl(String n) {
        url = n;
    }
    
    public void addAct(Actividad a) {
    	act.add(a);
    }
    
    public void addProf(Profesor p) {
    	prof.add(p);
    }
}
