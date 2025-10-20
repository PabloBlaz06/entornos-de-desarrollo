package Tema1.src.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número, por favor");

        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("El doble es: " + numero * 2);
        System.out.println("El doble es: " + numero * 3);

    }
}
