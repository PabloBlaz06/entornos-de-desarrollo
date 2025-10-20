package Tema1.src.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");


        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        scanner.close();

    }
}
