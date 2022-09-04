package persistencia;

import persistencia.Actividad;
import persistencia.Actividad;

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
public class Clase implements Serializable{
        @Id
	private String nombre;
        private String url;
	private int regitrados_min,regitrados_max;
	private Fecha fecha_reg, fecha_dict;
	private Hora hora_dict;
	private Actividad act;
	private Profesor prof;
	
	
	public Clase(String n, String u, int rmin, int rmax, Fecha fr, Fecha fd, Actividad a, Profesor p, Hora h) {
		this.nombre = n;
		this.url = u;
		this.regitrados_min = rmin;
		this.regitrados_max = rmax;
		this.fecha_reg = fr;
		this.fecha_dict = fd;
		this.act = a;
		this.prof = p;
		this.hora_dict = h;
	}

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public Actividad getAct() {
        return act;
    }

    public Profesor getProf() {
        return prof;
    }

    public int getRmin() {
        return regitrados_min;
    }

    public int getRax() {
        return regitrados_max;
    }
    
    public Fecha getFecha_reg() {
    	return fecha_reg;
    }
    
    public Fecha getFecha_dict() {
    	return fecha_dict;
    }
    
    public Hora getHora_dict() {
    	return hora_dict;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setAct(Actividad n) {
        act = n;
    }
    
    public void setUrl(String n) {
        url = n;
    }

    public void setRmin(int ap) {
    	regitrados_min = ap;
    }

    public void setRmax(int ap) {
    	regitrados_max = ap;
    }
    
    public void setFecha_reg(Fecha f) {
    	fecha_reg = f;
    }
    
    public void setFecha_dict(Fecha f) {
    	fecha_dict = f;
    }
    
    public void setProf(Profesor f) {
    	prof = f;
    }
    
    public void setHora_dict(Hora h) {
    	hora_dict = h;
    }
}
