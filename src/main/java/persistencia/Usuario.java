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
class Usuario implements Serializable{
        @Id
	private String nickname;
        private String nombre,apellido,mail;
	private Fecha fechanac;
	
	public Usuario(String ni, String n, String ap, String ma, Fecha f) {
        this.nickname = ni;
		this.nombre = n;
        this.apellido = ap;
        this.mail = ma;
        this.fechanac = f;
    }

    public String getNick() {
        return nickname;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public Fecha getFechanac() {
        return fechanac;
    }
    
    public void setNick(String n) {
        nickname = n;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }

    public void setApellido(String ap) {
        apellido = ap;
    }

    public void setMail(String ap) {
        mail = ap;
    }

    public void setFechanac(Fecha ap) {
        fechanac = ap;
    }
	
}
