package Gestion_Biblioteca.test.GestionBiblioteca;

import Gestion_Biblioteca.src.GestionBiblioteca.Libro;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class LibroTest {

    @Test
    public void testInicializacionLibro() {
        Libro libro = new Libro("Don Quijote");
        assertEquals("Don Quijote", libro.getTitulo());
        assertFalse(libro.isPrestado());
        assertNull(libro.getFechaPrestamo());
    }

    @Test
    public void testSetPrestado() {
        Libro libro = new Libro("Don Quijote");
        libro.setPrestado(true);
        assertTrue(libro.isPrestado());
        assertNotNull(libro.getFechaPrestamo());

        libro.setPrestado(false);
        assertFalse(libro.isPrestado());
        assertNull(libro.getFechaPrestamo());
    }

    @Test
    public void testSetFechaPrestamo() {
        Libro libro = new Libro("Don Quijote");
        LocalDate fecha = LocalDate.of(2024, 4, 27);
        libro.setFechaPrestamo(fecha);
        assertEquals(fecha, libro.getFechaPrestamo());
    }
}
