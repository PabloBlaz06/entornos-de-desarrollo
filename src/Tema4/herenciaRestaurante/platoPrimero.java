package Tema4.herenciaRestaurante;

public class platoPrimero extends plato {

    boolean compartir;

    public platoPrimero(String nombre, double precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = false;
    }


}
