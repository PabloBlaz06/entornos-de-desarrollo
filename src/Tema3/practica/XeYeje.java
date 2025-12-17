package Tema3.practica;

public class XeYeje {
    public static void main(String[] args) {

        XeY coordenadas1 = new XeY(100, 200);
        XeY coordenadas2 = new XeY(400, 800);
        double distancia = coordenadas1.mitad(coordenadas2);

        System.out.println("el resultado es: " + distancia);

    }
}
