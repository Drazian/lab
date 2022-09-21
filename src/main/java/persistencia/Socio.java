package persistencia;

import java.io.Serializable;
import java.util.*;
import java.time.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

@Entity
public class Socio extends Usuario implements Serializable{   
        @OneToMany
	private Set<Fecha_Compra> cupon;
        @OneToMany
	private Set<Fecha_Registro> anotado;
	
	public Socio(){}
        
        public Socio(String ni, String n, String ap, String ma, LocalDate f,String foto) {
		super(ni, n, ap, ma, f, foto);
		this.anotado=new HashSet<Fecha_Registro>();
		this.cupon=new HashSet<Fecha_Compra>();
	}
	
	public Set<Fecha_Registro> getClases(){
		return anotado;
	}
	
	public void registrarse(Clase c) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
                EntityManager em = emf.createEntityManager();
		Fecha_Registro fr=new Fecha_Registro(this,c,LocalDate.now());
		anotado.add(fr);
                em.getTransaction().begin();
                em.persist(fr);
                em.getTransaction().commit();
	}
	
}
