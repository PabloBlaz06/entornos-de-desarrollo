package Tema2.src.Ejercicios_sin_internet;

/*Crea un metodo para determinar si un número es par o impar*/

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es par o impar");
        int numero = sc.nextInt();

        sc.close();

        ParImpar(numero);
    }

    static void ParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
