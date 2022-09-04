package persistencia;

import java.time.LocalTime;  // Importa la clase para la hora

public class Hora {
	private LocalTime horita;
	
	public Hora() {
		this.horita = LocalTime.now();
	}
	public LocalTime getHora() {
		return horita;
	}
	public void setHora(LocalTime h) {
		horita = h;
	}

}
