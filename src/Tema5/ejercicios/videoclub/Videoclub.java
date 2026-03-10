package Tema5.ejercicios.videoclub;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {
    List<String> clientes = new ArrayList<>();
    List<String> peliculas = new ArrayList<>();
    List<String> prestamo = new ArrayList<>();

    public Videoclub() {

    }

    public void anadirCliente(Cliente cliente){

    }

    public void anadirPelicula(Pelicula pelicula){

    }

    public void anadirPrestamo(Prestamo prestamo){

    }

    public Pelicula buscarPelicula(int codigo){
        return null;
    }

    public Cliente buscarCliente(int numeroCarnet){
        return null;
    }

    public List<String> getPrestamo() {
        return prestamo;
    }

    public boolean devolucion(int codigoPelicula, int numeroCarnet){

        return false;
    }


}
