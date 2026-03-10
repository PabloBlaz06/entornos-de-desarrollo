package Tema4.herenciaRestaurante;

public class platoCarnes extends plato {

    private String gradoCocion;

    public platoCarnes(String nombre, double precio, String gradoCocion) {
        super(nombre, precio);
        if (gradoCocion.equals("Poco hecho")) {
            this.gradoCocion = gradoCocion;
        } else if (gradoCocion.equals("Al punto")) {
            this.gradoCocion = gradoCocion;
        } else if (gradoCocion.equals("Muy hecho")) {
            this.gradoCocion = gradoCocion;
        } else if (gradoCocion.equals("Carbonizado")) {
            this.gradoCocion = gradoCocion;
        } else {
            System.out.println("Esa no es una opcion correcta");
        }

    }
}
