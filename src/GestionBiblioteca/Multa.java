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

	public void setMonto(float aMonto) {
		this._monto = aMonto;
	}

	public Date getFechaGeneracion() {
		return this._fechaGeneracion;
	}

	public void setFechaGeneracion(Date aFechaGeneracion) {
		this._fechaGeneracion = aFechaGeneracion;
	}

	public EstadoMulta getEstado() {
		return this._estado;
	}

	public void setEstado(EstadoMulta aEstado) {
		this._estado = aEstado;
	}

	public void pagar() {
		throw new UnsupportedOperationException();
	}

	public void eliminar() {
		throw new UnsupportedOperationException();
	}
}
