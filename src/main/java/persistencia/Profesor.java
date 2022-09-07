package persistencia;

import java.util.HashSet;

import java.io.Serializable;
import java.time.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Profesor extends Usuario implements Serializable{
	private String descripcion,biografia,sitio_web;
        @ManyToOne
	private Institucion ins;
        
        @ManyToOne
        private HashSet<Clase> cls;
	
        public Profesor(){}
        
	public Profesor(String ni, String n, String ap, String ma, String desc, String bio, String web, LocalDate f, Institucion i, LocalDate fc) {
		super(ni, n, ap, ma, f, fc);
		this.descripcion = desc;
		this.biografia = bio;
		this.sitio_web = web;
		this.ins = i;
		cls = new HashSet<Clase>();
	}
    
    public String getDesc() {
        return descripcion;
    }

    public String getBio() {
        return biografia;
    }

    public String getMail() {
        return sitio_web;
    }
    
    public Institucion getIns() {
    	return ins;
    }
    
    public void setDesc(String n) {
        descripcion = n;
    }
    
    public void setBio(String n) {
        biografia = n;
    }

    public void setWeb(String ap) {
        sitio_web = ap;
    }
    
    public void setIns(Institucion i) {
    	ins = i;
    }
}
