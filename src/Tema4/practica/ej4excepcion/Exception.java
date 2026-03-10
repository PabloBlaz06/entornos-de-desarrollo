package Tema4.practica.ej4excepcion;

public class Exception {

    public static void main(String[] args) throws ValorInvalidoException {

        Producto p1 = new Producto();
        p1.establecerPrecio(-100);
        System.out.println("hola despues del precio");
    }
}
