package Tema2.src.Ejercicios5;

/*  Desarrolla un programa que rote una cadena tantas veces como se le indique.
Introduciendo: “Lunes”
Rotaciones: 2
Da como salida: “nesLu” */

public class ejercicio4 {
    public static void main(String[] args) {

        String cadena = "Lunes";
        int rotaciones= 2;

        for (int i = 0; i < rotaciones; i++) {
            cadena = cadena.substring(1) + cadena.charAt(0);
        }
        System.out.println(cadena);

    }
}
