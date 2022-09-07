package persistencia;

import java.util.HashSet;
import java.util.HashMap; 

import java.io.Serializable;
import java.time.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Actividad implements Serializable{
        @Id
	private String nombre;
        private String descripcion;
       	private int costo, duracion;
	private LocalDate fecha_reg;
	private Institucion ins;
        
        @ManyToMany
	private HashSet<Clases_contenidas> asociadas;
	
        @ManyToOne
        private HashMap<String, Clase> cls;
	
	
	public Actividad(String n, String d, int c, int dur, LocalDate f, Institucion i) {
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
    
    public LocalDate getFecha_reg() {
    	return fecha_reg;
    }
    
    public Institucion getInstitucion() {
    	return ins;
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
    
    public void setFecha_reg(LocalDate f) {
    	fecha_reg = f;
    }
    
    public void setDuracion(int d) {
    	duracion = d;
    }
    
    public void setInstitucion(Institucion i) {
    	ins = i;
    }
}
