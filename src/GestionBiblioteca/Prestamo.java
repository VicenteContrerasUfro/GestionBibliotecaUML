package Gestion_Biblioteca.src.GestionBiblioteca; // Asegúrate de incluir el paquete correcto

import Gestion_Biblioteca.src.GestionBiblioteca.Libro;
import Gestion_Biblioteca.src.GestionBiblioteca.Multa;
import Gestion_Biblioteca.src.GestionBiblioteca.Usuario;

import java.util.Date; // Importación correcta de Date

public class Prestamo {
	private Date _fechaPrestamo;      // Usar Date con mayúscula
	private Date _fechaDevolucion;    // Usar Date con mayúscula
	public Usuario _unnamed_Usuario_;  // Usuario asociado al préstamo
	public Libro _unnamed_Libro_;      // Libro asociado al préstamo
	public Multa _unnamed_Multa_;      // Multa asociada al préstamo

	public Date getFechaPrestamo() {
		return this._fechaPrestamo;
	}

	public void setFechaPrestamo(Date aFechaPrestamo) {
		this._fechaPrestamo = aFechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return this._fechaDevolucion;
	}

	public void setFechaDevolucion(Date aFechaDevolucion) {
		this._fechaDevolucion = aFechaDevolucion;
	}
}
