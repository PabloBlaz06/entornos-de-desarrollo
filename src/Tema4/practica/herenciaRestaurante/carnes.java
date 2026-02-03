package Tema4.practica.herenciaRestaurante;

public class carnes extends plato {

    private String gradoCocion;

    public carnes(String nombre, double precio, String gradoCocion) {
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
