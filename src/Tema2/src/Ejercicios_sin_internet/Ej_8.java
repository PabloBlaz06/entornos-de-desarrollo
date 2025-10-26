package Tema2.src.Ejercicios_sin_internet;

/*Define un metodo que retorne el valor absoluto de un número entero*/

import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        sc.close();

        ValorAbsoluto(numero);

    }

    static void ValorAbsoluto(int numero){
        if (numero < 0){
            System.out.println("El valor absoluto es: " +(-numero));
        } else {
            System.out.println("El valor absoluto es: " +numero);
        }
    }
}
