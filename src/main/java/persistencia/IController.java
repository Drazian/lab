package persistencia;

import java.time.LocalDate;
import java.util.*;

public interface IController {
	public abstract Map<String, Usuario> getUsr();
	public abstract Map<String, Cuponera> getCpn();
	public abstract Map<String, Actividad> getAct();
	public abstract Map<String, Institucion> getIns();
	public abstract void altaInstitucion(String nombre, String desc, String url);
	public abstract void altaSocio(String nick, String nom, String ap, String mail, LocalDate fnac, String foto);
	public abstract void altaProf(String nick, String nom, String ap, String mail, String desc, String bio, String web, LocalDate fnac, Institucion i, String foto);
	public abstract void altaActividad(String nom, String desc,  int duracion, int costo, LocalDate fecha, Institucion i);
	public abstract void inicializar() throws SQLException;

}
