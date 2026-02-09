package Tema4.src.herenciaRestaurante;

public class plato {
    String nombre;
    double precio;

    public plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Primero: " + nombre + " - " + precio + "€" ;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
