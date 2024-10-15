package Gestion_Biblioteca.src.GestionBiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Libro> prestamos = new ArrayList<>();
	private List<Multa> multas = new ArrayList<>();

	public void addPrestamo(Libro libro) {
		prestamos.add(libro);
	}

	public void removePrestamo(Libro libro) {
		prestamos.remove(libro);
	}

	public void addMulta(Multa multa) {
		multas.add(multa);
	}

	public void removeMulta(Multa multa) {
		multas.remove(multa);
	}

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
