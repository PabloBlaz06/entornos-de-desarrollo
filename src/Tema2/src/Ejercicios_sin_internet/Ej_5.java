package Tema2.src.Ejercicios_sin_internet;

import java.util.Scanner;

/*Implementa un metodo que calcule el mayor entre tres numeros */
public class Ej_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();

        System.out.println("Introduce un ultimo numero: ");
        int num3 = sc.nextInt();

        sc.close();

        int numeroMayor = mayor(num1, num2, num3);

        System.out.println("El numero mayor es: " + numeroMayor);
    }

    static int mayor(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
