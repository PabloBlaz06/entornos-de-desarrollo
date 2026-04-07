package Tema5.ejercicios.videoclub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Videoclub {
    List<Cliente> clientes = new ArrayList<>();
    List<Pelicula> peliculas = new ArrayList<>();
    List<Prestamo> prestamos = new ArrayList<>();

    public Videoclub() {
        this.clientes = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void anadirCliente(Cliente cliente) {
            clientes.add(cliente);
    }

    public void anadirPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void anadirPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public Pelicula buscarPelicula (int codigo){
        for (Pelicula peli : peliculas) {
            if (peli.getCodigo() == codigo) {
                return peli;
            }
        }
        return null;
    }

    public Cliente buscarCliente (int numeroCarnet){
        for (Cliente cli : clientes) {
            if(cli.getNumeroCarnet() == numeroCarnet) {
                return cli;
            }
        }
        return null;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public List<Prestamo> getPrestamos(int numeroCarnet) {
        List<Prestamo> filtrados = new ArrayList<>();
        for (Prestamo prest : prestamos){
            if(prest.getCliente().getNumeroCarnet() == numeroCarnet) {
                filtrados.add(prest);
            }
        }
        return filtrados;
    }

    public boolean devolucion (int codigoPelicula, int numeroCarnet) {
        for (Prestamo pres : prestamos) {
            if (pres.getPelicula().getCodigo() == codigoPelicula && pres.getCliente().getNumeroCarnet() == numeroCarnet) {
                prestamos.remove(pres);
                return true;
            }
        }
        return false;
    }

    public List <Prestamo> prestamosMorosos(){
        List<Prestamo> moroso = new ArrayList<>();
        for (Prestamo prest : prestamos){
            if (prest.getFechaDevolucion().isBefore(LocalDate.now())){
                moroso.add(prest);
            }
        }
        return moroso;
    }
}
