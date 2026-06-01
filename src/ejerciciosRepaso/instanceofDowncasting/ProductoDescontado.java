package ejerciciosRepaso.instanceofDowncasting;

public class ProductoDescontado extends Producto {
    private double descuento;

    public ProductoDescontado(String nombre, double precio, double descuento) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}
