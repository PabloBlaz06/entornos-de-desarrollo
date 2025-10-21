package Tema2.src.Ejercicios2;

import java.util.Scanner;

/*Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable*/

public class Avanzados_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de terminos de la serie de Fibonacci quieres: ");
        int termino = sc.nextInt();

        int numero1 = 0;
        int numero2 = 1;

        for (int i = 1; i <= termino; i++) {
            System.out.println(numero1);
            int siguiente = numero1 + numero2;
            numero1 = numero2;
            numero2 = siguiente;
        }

        sc.close();

    }
}
