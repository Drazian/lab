package persistencia;

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
public class Institucion implements Serializable{
        @Id
	private String nombre;
	
	public Institucion(String n) {
		this.nombre=n;
	}

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
}
