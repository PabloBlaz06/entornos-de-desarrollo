package Tema4.practica.herenciaRestaurante;

public class primero extends plato {

    boolean compartir;

    public primero(String nombre, double precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = false;
    }

}
