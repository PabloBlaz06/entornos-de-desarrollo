package Tema4.practica.ej5excepcion;

public class MainRegistro {
    public static void main(String[] args) {

        Registro r1 = new Registro();

        try {
            r1.registrarEdad(-30);
        } catch (Exception e) {
            System.out.println("Error con tu edad");
        }
    }
}
