package Tema5.ejercicios.videoclub;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {
    List<Cliente> clientes;
    List<Pelicula> peliculas;
    List<Prestamo> prestamos;

    public Videoclub() {
        clientes = new ArrayList<>();
        peliculas = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void añadirPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void añadirPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public Pelicula buscarPelicula(int codigo) {
        // TODO
        return null;
    }

    public Cliente buscarCliente(int numeroCarnet) {
        // TODO
        return null;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public List<Prestamo> getPrestamos(int numeroCarnet) {
        // TODO
        return null;
    }

    public boolean devolucion(int codigoPelicula, int numeroCarnet) {
        // TODO
        // Cambia el préstamo para que la película esté devuelta
        return false;
    }

    public List<Cliente> prestamosMorosos() {
        List<Cliente> clientesMorosos = new ArrayList<>();
        // TODO
        // Recorre toda la lista y devuelve los clientes con préstamos no devueltos
        // y que haya pasado la fecha de devolución (2 días sobre fecha préstamo)
        return clientesMorosos;
    }

}
