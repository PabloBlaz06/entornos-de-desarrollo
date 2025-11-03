package Tema1.src.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero para ver si es multiplo de 10: ");
        int numero = sc.nextInt();

        System.out.println("el numero es: " + (numero % 10 == 0? "multiplo de 10" : " no multiplo de 10"));

    }
}
