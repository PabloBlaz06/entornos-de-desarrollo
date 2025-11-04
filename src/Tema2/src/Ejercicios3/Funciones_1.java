package Tema2.src.Ejercicios3;

/*Implementa un metodo recursivo que determine si un número es primo*/

import java.util.Scanner;

public class Funciones_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es primo: ");
        int numero = sc.nextInt();

        sc.close();

        if (primo(numero, 2)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }

    static boolean primo(int numero, int divisor) {

        if (numero < 2) {
            return false;
        } else if (divisor * divisor > numero) {
            return true;
        } else if (numero % divisor == 0) {
            return false;
        } else {
            return primo(numero, divisor + 1);
        }
    }

}
