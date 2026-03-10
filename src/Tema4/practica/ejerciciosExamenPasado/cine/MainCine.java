package Tema4.practica.ejerciciosExamenPasado.cine;

public class MainCine {
    public static void main(String[] args) {

        Pelicula peli = new Pelicula("Shrek",800,"si");

        Sesion sesion = new Sesion(peli,"33",200);

        System.out.println(sesion);

        try {
            sesion.reservar(50);
            System.out.println("Reserva realizada con exito");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
