package Tema1.src.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = sc.nextInt();

        System.out.println("El numero es:" + (numero % 2 == 0 ? "par" : "impar"));
    }
}
