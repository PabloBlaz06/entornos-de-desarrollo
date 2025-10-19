package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio de un producto: ");
        float precio =  Integer.parseInt(scanner.nextLine());
        final double Iva = 1+0.21;


        System.out.println("El precio con IVA es: " +precio*Iva);

        scanner.close();

    }
}
