package Gestion_Biblioteca.src.GestionBiblioteca;

public class Empleado {
	private String _nombre;
	private long _identificacion;
	private String _cargo;
	public Biblioteca _unnamed_Biblioteca_;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public long getIdentificacion() {
		return this._identificacion;
	}

	public void setIdentificacion(long aIdentificacion) {
		this._identificacion = aIdentificacion;
	}

	public String getCargo() {
		return this._cargo;
	}

	public void setCargo(String aCargo) {
		this._cargo = aCargo;
	}
}