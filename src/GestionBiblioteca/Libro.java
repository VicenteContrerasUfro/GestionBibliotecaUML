package Gestion_Biblioteca.src.GestionBiblioteca;

import java.time.LocalDate;

public class Libro {
	private String titulo;
	private boolean prestado;
	private LocalDate fechaPrestamo;
	private final int DIAS_PERMITIDOS = 7;

	public Libro(String titulo) {
		this.titulo = titulo;
		this.prestado = false;
		this.fechaPrestamo = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
		if (prestado) {
			this.fechaPrestamo = LocalDate.now(); // Guarda la fecha al prestar
		} else {
			this.fechaPrestamo = null; // Limpia la fecha al devolver
		}
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public boolean estaRetrasado() {
		return fechaPrestamo != null && LocalDate.now().isAfter(fechaPrestamo.plusDays(DIAS_PERMITIDOS));
	}
}

