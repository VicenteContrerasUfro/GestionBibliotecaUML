package Gestion_Biblioteca.test.GestionBiblioteca;

import Gestion_Biblioteca.src.GestionBiblioteca.Libro;
import Gestion_Biblioteca.src.GestionBiblioteca.Multa;
import Gestion_Biblioteca.src.GestionBiblioteca.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void testAgregarPrestamo() {
        Usuario usuario = new Usuario();
        Libro libro = new Libro("El Principito");
        usuario.addPrestamo(libro);
        assertEquals(1, usuario.getPrestamos().size());
        assertTrue(usuario.getPrestamos().contains(libro));
    }

    @Test
    public void testEliminarPrestamo() {
        Usuario usuario = new Usuario();
        Libro libro = new Libro("El Principito");
        usuario.addPrestamo(libro);
        usuario.removePrestamo(libro);
        assertEquals(0, usuario.getPrestamos().size());
    }

    @Test
    public void testAgregarMulta() {
        Usuario usuario = new Usuario();
        Multa multa = new Multa();
        usuario.addMulta(multa);
        assertEquals(1, usuario.getMultas().size());
        assertTrue(usuario.getMultas().contains(multa));
    }

    @Test
    public void testEliminarMulta() {
        Usuario usuario = new Usuario();
        Multa multa = new Multa();
        usuario.addMulta(multa);
        usuario.removeMulta(multa);
        assertEquals(0, usuario.getMultas().size());
    }

    @Test
    public void testTieneRetrasos() {
        Usuario usuario = new Usuario();
        Libro libro = new Libro("El Principito");
        usuario.addPrestamo(libro);
        libro.setFechaPrestamo(LocalDate.now().minusDays(10));
        assertTrue(usuario.tieneRetrasos());
    }

    @Test
    public void testNoTieneRetrasos() {
        Usuario usuario = new Usuario();
        Libro libro = new Libro("El Principito");
        usuario.addPrestamo(libro);
        libro.setFechaPrestamo(LocalDate.now().minusDays(5));

        assertFalse(usuario.tieneRetrasos());
    }
}
