package persistencia;

import persistencia.Actividad;
import persistencia.Actividad;

import java.io.Serializable;
import java.time.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Clase implements Serializable{
        @Id
	private String nombre;
        private String url;
	private int regitrados_min,regitrados_max,cantRegistrados;
	private LocalDate fecha_reg, fecha_dict;
	private LocalTime hora_dict;
        
        @OneToOne
	private Actividad act;
        
	@OneToOne
        private Profesor prof;
	
        public Clase(){}
	
	public Clase(String n, String u, int rmin, int rmax, LocalDate fr, LocalDate fd, Actividad a, Profesor p, LocalTime h) {
		this.nombre = n;
		this.url = u;
		this.regitrados_min = rmin;
		this.regitrados_max = rmax;
		this.fecha_reg = fr;
		this.fecha_dict = fd;
		this.act = a;
		this.prof = p;
		this.hora_dict = h;
		this.cantRegistrados=0;
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
    
    public LocalDate getFecha_reg() {
    	return fecha_reg;
    }
    
    public LocalDate getFecha_dict() {
    	return fecha_dict;
    }
    
    public LocalTime getHora_dict() {
    	return hora_dict;
    }
    
    public int getRegis() {
    	return cantRegistrados;
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
    
    public void setFecha_reg(LocalDate f) {
    	fecha_reg = f;
    }
    
    public void setFecha_dict(LocalDate f) {
    	fecha_dict = f;
    }
    
    public void setProf(Profesor f) {
    	prof = f;
    }
    
    public void setHora_dict(LocalTime h) {
    	hora_dict = h;
    }
    
    public void agregarRegistrado() {
    	cantRegistrados=(cantRegistrados+1);
    }
}
