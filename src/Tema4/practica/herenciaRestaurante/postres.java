package Tema4.practica.herenciaRestaurante;

public class postres extends plato {

    boolean conAzucar;

    public postres(String nombre, double precio, boolean conAzucar) {
        super(nombre, precio);
        this.conAzucar = true;
    }
}
