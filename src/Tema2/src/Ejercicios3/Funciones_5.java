package Tema2.src.Ejercicios3;

/* Metodo factorial(), que calculará el factorial del número que se le pasa como parámetro.
Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo,
 y un -2 en caso de que el parámetro pasado sea cero */

import java.util.Scanner;

public class Funciones_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero para calcular el factorial: ");
        int numero = sc.nextInt();

        sc.close();

        int resultado = factorial(numero);

        if (resultado == -1) {
            System.out.println("Error: el número es negativo.");
        } else if (resultado == -2) {
            System.out.println("El número es cero. Retorna -2 según la especificación.");
        } else {
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
    }

    static int factorial(int numero){
        if(numero < 0){
            return -1;
        } else if(numero == 0){
            return -2;
        } else if(numero == 1){
            return 1;
        } else{
            return numero * factorial(numero - 1);
        }
    }
}
