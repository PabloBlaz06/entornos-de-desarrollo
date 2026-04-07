package Tema5.ejercicios.videoclub;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prestamo {

    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalDate fechaDevolucion;

    public Prestamo(Pelicula pelicula, Cliente cliente, LocalDate fecha) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fecha = fecha;
        this.fechaDevolucion = fecha.plusDays(2);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
