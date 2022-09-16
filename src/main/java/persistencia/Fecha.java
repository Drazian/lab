package Logica;

import java.time.LocalDate;  // Importa la clase para la fecha

public class Fecha {
	private LocalDate fechita;
	
	public Fecha(LocalDate ld) {
		this.fechita = ld;
	}
	public LocalDate getFecha() {
		return fechita;
	}
	public void setFecha(LocalDate f) {
		fechita = f;
	}
	
	//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

}
