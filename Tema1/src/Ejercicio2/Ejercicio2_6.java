package Ejercicio2;

import java.util.Scanner;
public class Ejercicio2_6 {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número, por favor");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce otro número, por favor");
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.println("El primer numero es:" + numero1);
        System.out.println("El segundo numero es:" + numero2);

        scanner.close();

    }
}