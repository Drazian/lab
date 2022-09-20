package persistencia;

import java.io.Serializable;
import java.util.*; 
import java.time.*;
import javax.persistence.*;


@Entity
public class Actividad implements Serializable{
        @Id
	private String nombre;
        private String descripcion;
	private int costo, duracion;
	private LocalDate fecha_reg;
        @ManyToOne
	private Institucion ins;
        @OneToMany
	private Set<Clases_contenidas> asociadas;
        @OneToMany
	private Map<String, Clase> cls;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
        EntityManager em = emf.createEntityManager();
	
	
	public Actividad(){}
        public Actividad(String n, String d, int c, int dur, LocalDate f, Institucion i) {
		this.costo = c;
		this.duracion = dur;
		this.descripcion = d;
		this.nombre = n;
		this.fecha_reg = f;
		this.ins = i;
		this.asociadas = new HashSet<Clases_contenidas>();
		this.cls = new HashMap<String, Clase>();
	}

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public LocalDate getFecha_reg() {
    	return fecha_reg;
    }
    
    public Institucion getInstitucion() {
    	return ins;
    }
    
    public Map<String, Clase> getClases(){
    	return cls;
    }
    
    public Set<Clases_contenidas> getCpn(){
    	return asociadas;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setDescripcion(String n) {
        descripcion = n;
    }

    public void setCosto(int ap) {
    	costo = ap;
    }
    
    public void setFecha_reg(LocalDate f) {
    	fecha_reg = f;
    }
    
    public void setDuracion(int d) {
    	duracion = d;
    }
    
    public void setInstitucion(Institucion i) {
    	ins = i;
    }
    
    public void altaClase(String n, String u, int rmin, int rmax, LocalDate fr, LocalDate fd, Profesor p, LocalTime h) {
    	Clase c=new Clase(n,u,rmin,rmax,fr,fd,this,p,h);
    	cls.put(n, c);
    	p.addClases(c);
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
}
