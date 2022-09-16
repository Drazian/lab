package Logica;

import java.io.Serializable; 

public class Usuario implements Serializable {
	protected String nickname,nombre,apellido,mail,foto;
	protected Fecha fechanac;
	
	public Usuario(String ni, String n, String ap, String ma, Fecha f,String fot) {
        this.nickname = ni;
        this.nombre = n;
        this.apellido = ap;
        this.mail = ma;
        this.fechanac = f;
        this.foto=fot;
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
    
    public String getFoto() {
    	return foto;
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

    public void setFoto(String ap) {
        foto = ap;
    }
	
}
