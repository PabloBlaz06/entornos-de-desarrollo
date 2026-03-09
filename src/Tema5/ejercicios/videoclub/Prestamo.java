package Tema5.ejercicios.videoclub;

public class Prestamo {

    private Cliente cliente;
    private Pelicula pelicula;
    private int dias;

    public Prestamo(Cliente cliente, Pelicula pelicula, int dias) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.dias = dias;
    }

    public Prestamo(Cliente cliente, Pelicula pelicula) {
        this(cliente, pelicula, 2);
    }


}
