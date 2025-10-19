package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de 3 cifras: ");
        int numero = sc.nextInt();
        if (numero >= 100 && numero <= 999) {
            int centenas = numero / 100;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;

            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);

        }
    }
}

