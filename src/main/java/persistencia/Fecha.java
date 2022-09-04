package persistencia;

import java.time.LocalDate;  // Importa la clase para la fecha

public class Fecha {
	private LocalDate fechita;
	
	public Fecha() {
		this.fechita = LocalDate.now();
	}
	public LocalDate getFecha() {
		return fechita;
	}
	public void setFecha(LocalDate f) {
		fechita = f;
	}
	
	//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

}
