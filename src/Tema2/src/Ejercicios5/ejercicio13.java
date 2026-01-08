package Tema2.src.Ejercicios5;

/* Crea un programa que averigüe cuál es la palabra que más letras tiene de un String.
El String solo contendrá letras y espacios de separación, nada más.
En el ejemplo: “Este Mp3 lo conecto al puerto usb”
El metodo debe retornar la palabra “conecto” que es la que más letras tiene. */

public class ejercicio13 {
    public static void main(String[] args) {

        String cadena = "Este Mp3 lo conecto al puerto usb";
        String[] palabras = cadena.split(" ");
        String palabraLarga = "";

        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() > palabraLarga.length()){
                palabraLarga = palabras[i];
            }

        }
        System.out.println(palabraLarga);
    }
}
