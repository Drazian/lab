package persistencia;

import java.util.HashSet;

import java.io.Serializable;
import java.time.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Cuponera implements Serializable{
        @Id
	private String nombre;
        private String descripcion;
	private int descuento;	
        private LocalDate fecha_ini, fecha_fin;
        
        @OneToMany
	private HashSet<Clases_contenidas> cont;
	
        public Cuponera(){}
        
	public Cuponera(String n, String d, int desc, LocalDate fi, LocalDate ff) {
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
    
    public LocalDate getFecha_ini() {
    	return fecha_ini;
    }
    
    public LocalDate getFecha_fin() {
    	return fecha_fin;
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
    
    public void setFecha_ini(LocalDate f) {
    	fecha_ini = f;
    }
    
    public void setFecha_fin(LocalDate f) {
    	fecha_fin = f;
    }
    
}
