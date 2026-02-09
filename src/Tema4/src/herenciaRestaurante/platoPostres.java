package Tema4.src.herenciaRestaurante;

public class platoPostres extends plato {

    static boolean conAzucar;

    public platoPostres(String nombre, double precio, boolean conAzucar) {
        super(nombre, precio);
        this.conAzucar = conAzucar;
    }

    public static boolean isConAzucar() {
        return conAzucar;
    }

}
