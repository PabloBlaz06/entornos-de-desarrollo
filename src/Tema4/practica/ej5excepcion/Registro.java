package Tema4.practica.ej5excepcion;

public class Registro {

    private int edad;

    public void registrarEdad(int edad) throws EdadInvalida {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalida("error");
        }
        System.out.println(edad);
    }
}
