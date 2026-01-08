package Tema2.src.Ejercicios5;

/*Realiza un programa que lea un String y elimine las palabras de menos de tres letras.
Una vez eliminadas esas palabras, no deben existir espacios duplicados.
Ejemplo: “El bar de la calle”
Dará como resultado: “bar calle” */

public class ejercicio12 {
    public static void main(String[] args) {

        String cadena = "El bar de la calle";

        String[] palabras = cadena.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() >= 3){
                resultado.append(palabras[i]).append(" ");
            }
        }

        System.out.println(resultado);
    }

}
