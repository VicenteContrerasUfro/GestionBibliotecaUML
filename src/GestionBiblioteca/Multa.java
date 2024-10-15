package Gestion_Biblioteca.src.GestionBiblioteca;

import java.util.Date; // Importar la clase Date

public class Multa {
	private float _monto;                 // Monto de la multa
	private Date _fechaGeneracion;        // Fecha de generación de la multa
	private EstadoMulta _estado;           // Estado de la multa
	public Usuario _unnamed_Usuario_;     // Usuario asociado a la multa
	public Prestamo _unnamed_Prestamo_;   // Préstamo asociado a la multa


	public float getMonto() {
		return this._monto;
	}

	// Setter para el monto
	public void setMonto(float aMonto) {
		this._monto = aMonto;
	}

	// Getter para la fecha de generación
	public Date getFechaGeneracion() {
		return this._fechaGeneracion;
	}

	// Setter para la fecha de generación
	public void setFechaGeneracion(Date aFechaGeneracion) {
		this._fechaGeneracion = aFechaGeneracion;
	}

	// Getter para el estado
	public EstadoMulta getEstado() {
		return this._estado;
	}

	// Setter para el estado
	public void setEstado(EstadoMulta aEstado) {
		this._estado = aEstado;
	}

	// Método para pagar la multa (a implementar)
	public void pagar() {
		throw new UnsupportedOperationException();
	}

	// Método para eliminar la multa (a implementar)
	public void eliminar() {
		throw new UnsupportedOperationException();
	}
}
