package persistencia;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;

@Entity
public class Institucion implements Serializable {
        @Id
	private String nombre;
        private String descripcion,url;
        @OneToMany
	private Set<Actividad> act;
        
        @OneToMany
	private Set<Profesor> prof;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
        EntityManager em = emf.createEntityManager();
	
	public Institucion(){}
        public Institucion(String n, String d, String u) {
		this.nombre=n;
		this.descripcion=d;
		this.url=u;
		this.prof=new HashSet<Profesor>();
		this.act=new HashSet<Actividad>();
	}

    public String getNombre() {
        return nombre;
    }

    public String getDesc() {
        return descripcion;
    }

    public String getUrl() {
        return url;
    }
    
    public Set<Actividad> getActividades(){
    	return act;
    }
    
    public Set<Profesor> getProfesores(){
    	return prof;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setDesc(String n) {
        descripcion = n;
    }
    
    public void setUrl(String n) {
        url = n;
    }
    
    public void addAct(Actividad a) {
    	act.add(a);
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
    }
    
    public void addProf(Profesor p) {
    	prof.add(p);
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
}
