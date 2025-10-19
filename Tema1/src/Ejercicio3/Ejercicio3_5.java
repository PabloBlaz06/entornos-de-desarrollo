package Ejercicio3;

import java.util.Scanner;

//Programa que lea dos caracteres por teclado y compruebe si son iguales

public class Ejercicio3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter: ");
        String caracter1 = sc.nextLine();

        System.out.println("Introduce otro caracter: ");
        String caracter2 = sc.nextLine();

        System.out.println("Los caracteres son: " + (caracter1 == caracter2 ? "Iguales" : "Distintos"));

        sc.close();
    }
}
