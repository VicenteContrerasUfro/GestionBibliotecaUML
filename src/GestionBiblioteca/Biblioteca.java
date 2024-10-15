package Gestion_Biblioteca.src.GestionBiblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {
	private String _nombre;
	private String _direccion;
	private List<Libro> _libros = new ArrayList<>();  // Colección de libros
	private List<Empleado> _empleados = new ArrayList<>();  // Colección de empleados
	private List<Categoria> _categorias = new ArrayList<>(); // Colección de categorías

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}

	// Método para agregar un libro
	public void agregarLibro(Libro aLibro) {
		if (aLibro != null) {
			this._libros.add(aLibro); // Asegúrate de que el libro se esté agregando al vector
		} else {
			throw new IllegalArgumentException("El libro no puede ser nulo.");
		}
	}

	// Método para modificar un libro
	public void modificarLibro(Libro aLibro) {
		if (aLibro != null && _libros.contains(aLibro)) {
		} else {
			throw new IllegalArgumentException("El libro no se encuentra en la biblioteca o es nulo.");
		}
	}

	// Método para eliminar un libro
	public void eliminarLibro(Libro aLibro) {
		if (aLibro != null && _libros.contains(aLibro)) {
			_libros.remove(aLibro);
		} else {
			throw new IllegalArgumentException("El libro no se encuentra en la biblioteca o es nulo.");
		}
	}

	// Método para realizar un préstamo
	public void realizarPrestamo(Usuario aUsuario, Libro aLibro) {
		if (aUsuario != null && aLibro != null && _libros.contains(aLibro) && !aLibro.isPrestado()) {
			aLibro.setPrestado(true);
			aUsuario.addPrestamo(aLibro);
		} else {
			throw new IllegalArgumentException("Usuario o libro inválido o libro no disponible.");
		}
	}

	// Método para registrar la devolución de un préstamo
	public void registrarDevolucion(Libro aPrestamo) {
		if (aPrestamo != null) {
			aPrestamo.setPrestado(false);
		} else {
			throw new IllegalArgumentException("El préstamo no puede ser nulo.");
		}
	}

	// Método para generar multa
	public void generarMulta(Usuario aUsuario) {
		if (aUsuario != null) {
			if (aUsuario.tieneRetrasos()) {
				Multa multa = new Multa();
				aUsuario.addMulta(multa);
			}
		} else {
			throw new IllegalArgumentException("El usuario no puede ser nulo.");
		}
	}

	// Método para pagar una multa
	public void pagarMulta(Usuario aUsuario, Multa aMulta) {
		if (aUsuario != null && aMulta != null) {
			aUsuario.removeMulta(aMulta);
		} else {
			throw new IllegalArgumentException("El usuario o la multa no pueden ser nulos.");
		}
	}

	// Método para obtener la cantidad de libros
	public int getLibros() {
		return this._libros.size();
	}

	// Método para obtener los empleados
	public Collection<Empleado> getEmpleados() {
		return this._empleados;
	}

	// Método para agregar un empleado
	public void agregarEmpleado(Empleado aEmpleado) {
		if (aEmpleado != null) {
			_empleados.add(aEmpleado);
		} else {
			throw new IllegalArgumentException("El empleado no puede ser nulo.");
		}
	}

	// Método para eliminar un empleado
	public void eliminarEmpleado(Empleado aEmpleado) {
		if (aEmpleado != null && _empleados.contains(aEmpleado)) {
			_empleados.remove(aEmpleado);
		} else {
			throw new IllegalArgumentException("El empleado no se encuentra en la biblioteca o es nulo.");
		}
	}

	// Método para crear una categoría
	public void crearCategoria(Categoria aCategoria) {
		if (aCategoria != null) {
			_categorias.add(aCategoria);
		} else {
			throw new IllegalArgumentException("La categoría no puede ser nula.");
		}
	}

	// Método para eliminar una categoría
	public void eliminarCategoria(Categoria aCategoria) {
		if (aCategoria != null && _categorias.contains(aCategoria)) {
			_categorias.remove(aCategoria);
		} else {
			throw new IllegalArgumentException("La categoría no se encuentra en la biblioteca o es nula.");
		}
	}
}
