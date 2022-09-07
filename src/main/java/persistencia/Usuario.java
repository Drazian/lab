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
import java.time.*;

@Entity
public class Usuario implements Serializable{
        @Id
	private String nickname;
        private String nombre,apellido,mail,foto;
	private LocalDate fechanac;
        private LocalDate fechaCreado;
	
        public Usuario(){}
        
	public Usuario(String ni, String n, String ap, String ma, LocalDate f, LocalDate fechaC, String fot) {
        this.nickname = ni;
	this.nombre = n;
        this.apellido = ap;
        this.mail = ma;
        this.fechanac = f;
        this.fechaCreado=fechaC;
	this.foto=fot;
    }
        
        public Usuario(String ni, String n, String ap, String ma, LocalDate f) {
        this.nickname = ni;
		this.nombre = n;
        this.apellido = ap;
        this.mail = ma;
        this.fechanac = f;
        //this.fechaCreado=fechaC;
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

    public LocalDate getFechanac() {
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

    public void setFechanac(LocalDate ap) {
        fechanac = ap;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(LocalDate fechaCreado) {
        this.fechaCreado = fechaCreado;
    }
    
    public String getFoto() {
    	return foto;
    }

    public void setFoto(String ap) {
        foto = ap;
    }
    
}
