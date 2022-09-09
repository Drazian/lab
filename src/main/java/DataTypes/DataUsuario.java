package DataTypes;
import java.time.*;

public class DataUsuario{
	private String nickname;
        private String nombre,apellido,mail,foto;
	private LocalDate fechanac;
        private LocalDate fechaCreado;
	
        public DataUsuario(){}
        
	public DataUsuario(String ni, String n, String ap, String ma, LocalDate f, LocalDate fechaC, String fot) {
        this.nickname = ni;
	this.nombre = n;
        this.apellido = ap;
        this.mail = ma;
        this.fechanac = f;
        this.fechaCreado=fechaC;
	this.foto=fot;
    }
        
        public DataUsuario(String ni, String n, String ap, String ma, LocalDate f) {
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
    
    public String getNickname() {
        return nickname;
    }
    public LocalDate getFechaCreado() {
        return fechaCreado;
    }
    
    public String getFoto() {
    	return foto;
    }

};

