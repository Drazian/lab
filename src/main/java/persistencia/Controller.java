package persistencia;

import java.util.HashMap;

import java.time.*;
import java.util.Iterator;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Controller implements IController {
	private Map<String, Usuario> usr;
	private Map<String, Cuponera> cpn;
	private Map<String, Actividad> act;
	private Map<String, Institucion> ins;
	       
	public Controller() {
		this.ins=new HashMap<>();
		this.usr=new HashMap<>(); 
		this.cpn=new HashMap<>();
		this.act=new HashMap<>();
            try {
                inicializar();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
	}    
        
	public Map<String, Usuario> getUsr(){
		return usr;
	}
	
	public Map<String, Cuponera> getCpn(){
		return cpn;
	}
	
	public Map<String, Actividad> getAct(){
		return act;
	}
	
	public Map<String, Institucion> getIns(){
		return ins;
	}
	
	public void altaInstitucion(String nombre, String desc, String url) {
                        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
                        EntityManager em = emf.createEntityManager();
                        em.getTransaction().begin();
			Institucion d=new Institucion(nombre,desc,url);
			//ins.put(nombre, d);
                        em.persist(d);
                        em.getTransaction().commit();
	}
	
	public void altaSocio(String nick, String nom, String ap, String mail, LocalDate fnac, String foto) {
		if(!usr.containsKey(nick)) {
                        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
                        EntityManager em = emf.createEntityManager();
			Usuario u=new Socio(nick,nom,ap,mail,fnac,foto);
			usr.put(nick,u);
                        em.getTransaction().begin();
                        em.persist(u);
                        em.getTransaction().commit();
                }
	}
	
	public void altaProf(String nick, String nom, String ap, String mail, String desc, String bio, String web, LocalDate fnac, Institucion i, String foto) {
		if(!usr.containsKey(nick)) {
                        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
                        EntityManager em = emf.createEntityManager();                    
			Usuario u=new Profesor(nick,nom,ap,mail,desc,bio,web,fnac,i,foto);
			usr.put(nick,u);
                        i.getProfesores().add((Profesor) u);
                        em.getTransaction().begin();
                        em.persist(u);
                        em.getTransaction().commit();
                }
	}
	
	public void altaActividad(String nom, String desc,  int duracion, int costo, LocalDate fecha,Institucion i) {
		if(!act.containsKey(nom)) {
                        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
                        EntityManager em = emf.createEntityManager();                    
			Actividad a=new Actividad(nom,desc,duracion,costo,fecha,i);
			act.put(nom, a);
			i.getActividades().add(a);
                    em.getTransaction().begin();
                    em.persist(a);
                    em.getTransaction().commit();
	}

    }
	
	public void crearCuponeraActividadDeportiva(String nombre, String desc, LocalDate fechaInicio, LocalDate fechaFin, int descuento, HashMap<String,Cuponera> cpn) {
		if(cpn.containsKey(nombre)) {
			//Tira excepcion
		}
		else {
                                            EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
                        EntityManager em = emf.createEntityManager();
                        em.getTransaction().begin();
                        Cuponera aux = new Cuponera(nombre, desc, descuento, fechaInicio, fechaFin);
			cpn.put(nombre, aux);
                        em.persist(aux);
                        em.getTransaction().commit();
		}
	}
	
	/*public String listarCuponeras() {
		String clave;
		Iterator<String> lista = cpn.keySet().iterator();
		while(lista.hasNext()) {
			clave=lista.next();
			return clave;
		}
                
	}*/
	
	public void escogerCuponera(Map<String,Cuponera> nombreCupo) {
		this.cpn = nombreCupo;
	}
	
	public final void inicializar() throws SQLException{
            String c="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(c, "tecnologo", "tecnologo");
            //Institucion
            String sql="SELECT * FROM Institucion";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            String nom,desc,url;
            while(rs.next()){    
                nom=rs.getString("NOMBRE");
                desc=rs.getString("DESCRIPCION");
                url=rs.getString("URL");
                Institucion i=new Institucion(nom,desc,url);
                this.ins.put(i.getNombre(), i);
                
            }
            /*
            //Institucion
            String sql="SELECT * FROM INSTITUCION";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            String nom,desc,url;
            while(rs.next()){    
                nom=rs.getString("NOMBRE");
                desc=rs.getString("DESCRIPCION");
                url=rs.getString("URL");
                Institucion i=new Institucion(nom,desc,url);
            }*/
            
        }
	
	
	
	
			
}
