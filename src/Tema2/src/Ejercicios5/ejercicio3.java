package Tema2.src.Ejercicios5;

/*  Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.
Introduciendo: “Lunes”
Da como salida: “Mvoft” */

public class ejercicio3 {
    public static void main(String[] args) {

        String cadena = "Lunes";
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++){

            char c = cadena.charAt(i);
            resultado += (char)(c + 1);
        }

        System.out.println(resultado);
    }
}
