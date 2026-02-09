package Tema4.src.herenciaRestaurante;

public class platoPostres extends plato {

    static boolean conAzucar;

    public platoPostres(String nombre, double precio, boolean conAzucar) {
        super(nombre, precio);
        this.conAzucar = true;
    }

    public boolean isConAzucar() {
        return conAzucar;
    }

    public void setConAzucar(boolean conAzucar) {
        this.conAzucar = conAzucar;
    }
}
