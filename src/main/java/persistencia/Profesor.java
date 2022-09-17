package persistencia;

import java.time.*;
import java.util.HashSet;

public class Profesor extends Usuario{
	private String descripcion,biografia,sitio_web;
	private Institucion ins;
	private HashSet<Clase> cls;
	
	public Profesor(String ni, String n, String ap, String ma, String desc, String bio, String web, LocalDate f, Institucion i, String foto) {
		super(ni, n, ap, ma, f, foto);
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
    
    public HashSet<Clase> getClases(){
    	return cls;
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
    
    public void addClases(Clase c) {
    	cls.add(c);
    }
}
