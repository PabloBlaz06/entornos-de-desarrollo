package Tema2.src.Ejercicios5;

/*Escribe un programa que pida al usuario que escriba varias palabras.
El programa debe contar cuantas vocales tiene cada palabra y dará como resultado la palabra que más vocales tenga.
Se deben ir pidiendo palabras al usuario hasta que este escriba la palabra “FIN”.
Ejemplo:
Escribe una palabra: JUEGO
Escribe una palabra: INVIERNO
Escribe una palabra: AJEDREZ
Escribe una palabra: FIN
La palabra con más vocales es: INVIERNO
Y tiene 4 vocales */

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese palabra: ");
        String palabra = sc.nextLine();

        String palabraMax = " ";
        int maxVocales = 0;

        while (!palabra.equals("FIN")){

            int vocales = 0;

            for (int i = 0; i < palabra.length(); i++) {

                char c = palabra.charAt(i);

                if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
                        || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
                    vocales++;
                }
            }

            if (vocales > maxVocales) {
                maxVocales = vocales;
                palabraMax = palabra;
            }

            System.out.print("Ingrese palabra: ");
            palabra = sc.nextLine();
        }

        System.out.println("La palabra con más vocales es: " + palabraMax);
        System.out.println("Y tiene " + maxVocales + " vocales");

        sc.close();
    }
}
