package Tema1.src.Ejercicio3;

import java.util.Scanner;

//Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
// Se debe comprobar que el divisor no puede ser cero

public class Ejercicio3_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dividendo: ");
        double num1 = sc.nextInt();

        System.out.println("Introduce el divisor: ");
        double num2 = sc.nextInt();

        System.out.println("Resultado de la division: " + (num1 / num2));
        System.out.println(Boolean.parseBoolean("Puede ser divisor el 0: " + (num1 / 0)) ? "si puede ser divisor el 0 " : "no puede ser divisor el 0");

        sc.close();

    }
}
