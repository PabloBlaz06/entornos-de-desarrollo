package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_7 {
   public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la velocidad en Km/h, por favor ");

        double numero = Integer.parseInt(scanner.nextLine());

        System.out.println("La velocidad en m/s es: " + (numero *1000 / 3600 )+" m/s");

    }
}

