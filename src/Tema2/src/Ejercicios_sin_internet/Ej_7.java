package Tema2.src.Ejercicios_sin_internet;

/*Escribe un metodo que convierta grados Celsius a Fahrenheit*/

import java.util.Scanner;

public class Ej_7 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los grados en Celsius: ");
        int grados = sc.nextInt();

        sc.close();

        Fahrenheit(grados);

    }

    static void Fahrenheit(int grados){
        System.out.println("Los grados en Fahrenheit son: " + ((grados *9 /5)+32) + "ºF");
    }
}
