package Tema4.src.teoria.herencia1;

public class VideojuegoXbox extends Videojuego {

    boolean necesitaGamepass;

    public VideojuegoXbox(String nombre, double precio, boolean necesitaGamepass) {
        super(nombre, precio);
        this.necesitaGamepass = necesitaGamepass;
    }
}
