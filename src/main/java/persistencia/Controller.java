package persistencia;

import java.util.HashMap;

import java.time.*;


public class Controller implements IController {
	private HashMap<String, Usuario> usr;
	private HashMap<String, Cuponera> cpn;
	private HashMap<String, Actividad> act;
	private HashMap<String, Institucion> ins;
	
	public Controller() {
		ins=new HashMap<String, Institucion>();
		act=new HashMap<String, Actividad>();
		cpn=new HashMap<String, Cuponera>();
		usr=new HashMap<String, Usuario>();
		
	}
	
	public HashMap<String, Usuario> getUsr(){
		return usr;
	}
	
	public HashMap<String, Cuponera> getCpn(){
		return cpn;
	}
	
	public HashMap<String, Actividad> getAct(){
		return act;
	}
	
	public HashMap<String, Institucion> getIns(){
		return ins;
	}
	
	public void altaInstitucion(String nombre, String desc, String url) {
		if(!ins.containsKey(nombre)) {
			Institucion d=new Institucion(nombre,desc,url);
			ins.put(nombre,d);
                }
	}
	
	public void altaSocio(String nick, String nom, String ap, String mail, LocalDate fnac, String foto) {
		if(!usr.containsKey(nick)) {
			Usuario u=new Socio(nick,nom,ap,mail,fnac,foto);
			usr.put(nick,u);
                }
	}
	
	public void altaProf(String nick, String nom, String ap, String mail, String desc, String bio, String web, LocalDate fnac, Institucion i, String foto) {
		if(!usr.containsKey(nick)) {
			Usuario u=new Profesor(nick,nom,ap,mail,desc,bio,web,fnac,i,foto);
			usr.put(nick,u);
                        i.getProfesores().add((Profesor) u);
                }
	}
	
	public void altaActividad(String nom, String desc,  int duracion, int costo, LocalDate fecha,Institucion i) {
		if(!act.containsKey(nom)) {
			Actividad a=new Actividad(nom,desc,duracion,costo,fecha,i);
			act.put(nom, a);
			i.getActividades().add(a);
	}

    }
}





























