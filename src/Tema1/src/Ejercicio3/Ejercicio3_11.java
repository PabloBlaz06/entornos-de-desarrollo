package Tema1.src.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia: ");
        int radio = Integer.parseInt(scanner.nextLine());

        System.out.println("La longitud es: " + radio * 2 * 3.14);
        System.out.println("El area es: " + radio * radio * 3.14);

        scanner.close();

    }
}
