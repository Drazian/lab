package persistencia;

import java.util.HashSet;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Cuponera implements Serializable{
        @Id
	private String nombre;
        private String descripcion;
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
