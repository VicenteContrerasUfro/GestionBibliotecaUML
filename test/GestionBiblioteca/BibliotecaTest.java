package Gestion_Biblioteca.test.GestionBiblioteca;

import static org.junit.Assert.*;
import org.junit.Test;
import Gestion_Biblioteca.src.GestionBiblioteca.*;

import java.time.LocalDate;

public class BibliotecaTest {

    @Test
    public void testAgregarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Cien Años de Soledad");
        biblioteca.agregarLibro(libro);

        assertEquals(1, biblioteca.getLibros()); // Verifica que el libro fue agregado
    }

    @Test
    public void testRealizarPrestamo() {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario();
        Libro libro = new Libro("Cien Años de Soledad");
        biblioteca.agregarLibro(libro);

        biblioteca.realizarPrestamo(usuario, libro);
        assertTrue(libro.isPrestado()); // Verifica que el libro fue prestado
        assertEquals(1, usuario.getPrestamos().size()); // Verifica que el préstamo fue agregado al usuario
    }

    @Test
    public void testGenerarMulta() {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario();
        Libro libro = new Libro("Cien Años de Soledad");

        biblioteca.agregarLibro(libro);
        biblioteca.realizarPrestamo(usuario, libro);

        // Simula que el libro se prestó hace 10 días
        libro.setFechaPrestamo(LocalDate.now().minusDays(10));

        biblioteca.generarMulta(usuario);
        assertTrue(usuario.getMultas().size() > 0); // Verifica que el usuario tiene multas
    }

    @Test
    public void testEliminarEmpleado() {
        Biblioteca biblioteca = new Biblioteca();
        Empleado empleado = new Empleado(); // Asegúrate de tener una clase Empleado
        biblioteca.agregarEmpleado(empleado); // Agregar empleado

        assertEquals(1, biblioteca.getEmpleados().size()); // Verifica que el empleado fue agregado

        biblioteca.eliminarEmpleado(empleado); // Eliminar empleado
        assertEquals(0, biblioteca.getEmpleados().size()); // Verifica que el empleado fue eliminado
    }

    @Test
    public void testPagarMulta() {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario();
        Multa multa = new Multa();
        usuario.addMulta(multa); // Agrega una multa al usuario

        assertEquals(1, usuario.getMultas().size()); // Verifica que el usuario tiene una multa

        usuario.removeMulta(multa); // Eliminar multa
        assertEquals(0, usuario.getMultas().size()); // Verifica que la multa fue eliminada
    }
}
