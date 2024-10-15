package Gestion_Biblioteca.src.GestionBiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Libro> prestamos = new ArrayList<>();
	private List<Multa> multas = new ArrayList<>();

	// Método para agregar un préstamo
	public void addPrestamo(Libro libro) {
		prestamos.add(libro);
	}

	// Método para eliminar un préstamo (en caso de devolución)
	public void removePrestamo(Libro libro) {
		prestamos.remove(libro);
	}

	// Método para agregar una multa
	public void addMulta(Multa multa) {
		multas.add(multa);
	}

	// Método para eliminar una multa
	public void removeMulta(Multa multa) {
		multas.remove(multa);
	}

	// Método para verificar si un usuario tiene libros retrasados
	public boolean tieneRetrasos() {
		return prestamos.stream().anyMatch(Libro::estaRetrasado);
	}

	// Métodos para obtener los préstamos y multas
	public List<Libro> getPrestamos() {
		return prestamos;
	}

	public List<Multa> getMultas() {
		return multas;
	}
}
