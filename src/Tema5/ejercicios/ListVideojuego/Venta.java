package Tema5.ejercicios.ListVideojuego;

import Tema5.ejercicios.tiendaVideojuegos.Cliente;

import java.time.LocalDate;
import java.util.List;

public class Venta {

    private Cliente cliente;
    private List<VideoJuegos> articulos;
    private LocalDate fechaVenta;

    public Venta(Clientes cliente, List<VideoJuegos> articulos) {
        this.cliente = cliente;
        this.articulos = articulos;
        this.fechaVenta = LocalDate.now();
    }

    // Getters y Setters
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public List<VideoJuegos> getArticulos() { return articulos; }
    public void setArticulos(List<VideoJuegos> articulos) { this.articulos = articulos; }
    public LocalDate getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(LocalDate fechaVenta) { this.fechaVenta = fechaVenta; }

    @Override
    public String toString() {
        return "Venta{cliente=" + cliente.getNombre() + " " + cliente.getApellidos()
                + ", articulos=" + articulos.size() + ", fecha=" + fechaVenta + "}";
    }
}
