package Tema5.ejercicios.ListVideojuego;

import Tema5.ejercicios.tiendaVideojuegos.Cliente;

import java.time.LocalDate;
import java.util.List;

public class Venta {

    private Clientes clientes;
    private List<VideoJuegos> articulos;
    private LocalDate fechaVenta;

    public Venta(Clientes clientes, List<VideoJuegos> articulos) {
        this.clientes = clientes;
        this.articulos = articulos;
        this.fechaVenta = LocalDate.now();
    }

    // Getters y Setters
    public Clientes getClientes() { return clientes; }
    public void setClientes(Clientes clientes) { this.clientes = clientes; }
    public List<VideoJuegos> getArticulos() { return articulos; }
    public void setArticulos(List<VideoJuegos> articulos) { this.articulos = articulos; }
    public LocalDate getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(LocalDate fechaVenta) { this.fechaVenta = fechaVenta; }

    @Override
    public String toString() {
        return "Venta{cliente=" + clientes.getNombre() + " " + clientes.getApellidos()
                + ", articulos=" + articulos.size() + ", fecha=" + fechaVenta + "}";
    }
}
