package Tema2.src.Ejercicios1;

/* Escribir un programa en Java que lea un número entero por el teclado e imprima
 todos los números impares menores que él.*/

import java.util.Scanner;

public class Basicos_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        System.out.println("Numeros impares menores que " + numero);

        for (int i = 1; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
