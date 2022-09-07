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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Socio extends Usuario implements Serializable{
	private HashSet<LocalDate> cupon;
	private HashSet<LocalDate> anotado;
	
        public Socio(){}
        
	public Socio(String ni, String n, String ap, String ma, LocalDate f, LocalDate fc) {
		super(ni, n, ap, ma, f, fc);
		this.cupon = new HashSet<LocalDate>();
		this.anotado = new HashSet<LocalDate>();
	}
	
}