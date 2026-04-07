package Tema5.ejercicios.ListVideojuego;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private Clientes clientes;
    private List<VideoJuegos> videojuegos;
    private LocalDate fecha;

    public Venta(Clientes clientes, List<VideoJuegos> videojuegos, LocalDate fecha) {
        this.clientes = clientes;
        this.videojuegos = videojuegos;
        this.fecha = fecha;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public List<VideoJuegos> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<VideoJuegos> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
