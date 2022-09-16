package Logica;

import java.time.LocalTime;  // Importa la clase para la hora

public class Hora {
	private LocalTime horita;
	
	public Hora(LocalTime lt) {
		this.horita = lt;
	}
	public LocalTime getHora() {
		return horita;
	}
	public void setHora(LocalTime h) {
		horita = h;
	}

}
