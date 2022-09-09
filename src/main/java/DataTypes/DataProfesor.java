package DataTypes;

import java.time.LocalDate;

public class DataProfesor extends DataUsuario{
	private String descripcion,biografia,sitio_web;
        public DataProfesor(String ni, String n, String ap, String ma, String desc, String bio, String web, LocalDate f, LocalDate fc, String foto) {
		super(ni, n, ap, ma, f, fc, foto);
		this.descripcion = desc;
		this.biografia = bio;
		this.sitio_web = web;
	}
    
    public String getDesc() {
        return descripcion;
    }

    public String getBio() {
        return biografia;
    }

    public String getsitio_web() {
        return sitio_web;
    }
    
}
