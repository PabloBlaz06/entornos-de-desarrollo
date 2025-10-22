package Tema2.src.Ejercicios2;

import java.util.Scanner;

/*Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado.
 El juego deberá indicarte si el número introducido es mayor o menor*/

public class Avanzados_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int numero = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        while (numero != numeroSecreto) {
            numero = sc.nextInt();

            if (numero < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (numero > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("Has acertado, el número era " + numeroSecreto);
            }
        }

        sc.close();
    }
}