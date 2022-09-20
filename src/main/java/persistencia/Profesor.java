package persistencia;

import java.io.Serializable;
import java.time.*;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

@Entity
public class Profesor extends Usuario implements Serializable{
	private String descripcion,biografia,sitio_web;
        @ManyToOne
	private Institucion ins;
        @OneToMany
	private Set<Clase> cls;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
        EntityManager em = emf.createEntityManager();
	
	public Profesor(){}
        public Profesor(String ni, String n, String ap, String ma, String desc, String bio, String web, LocalDate f, Institucion i, String foto) {
		super(ni, n, ap, ma, f, foto);
		this.descripcion = desc;
		this.biografia = bio;
		this.sitio_web = web;
		this.ins = i;
		this.cls = new HashSet<Clase>();
	}
    
    public String getDesc() {
        return descripcion;
    }
    
    public String getWeb(){
        return sitio_web;
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
    
    public Set<Clase> getClases(){
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
                em.getTransaction().begin();
                em.persist(c);
                em.getTransaction().commit();
    }
}
