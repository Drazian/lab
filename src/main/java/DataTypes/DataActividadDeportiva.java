package DataTypes;

import java.time.LocalDate;

public class DataActividadDeportiva {
	private String nombre;
        private String descripcion;
       	private int costo, duracion;
	private LocalDate fecha_reg;
    public DataActividadDeportiva(String n, String d, int c, int dur, LocalDate f) {
		this.costo = c;
		this.duracion = dur;
		this.descripcion = d;
		this.nombre = n;
		this.fecha_reg = f;
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
    };
    
}
