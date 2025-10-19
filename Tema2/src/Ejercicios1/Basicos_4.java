package Ejercicios1;

import java.util.Scanner;

/*Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
 Se debe comprobar que el divisor no puede ser cero.*/
public class Basicos_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdice el dividendo: ");
        double dividendo = sc.nextInt();

        System.out.println("Introdice el divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0){
            System.out.println("El divisor no puede ser 0");
        }else{
            System.out.println("El resultado es " + (dividendo/divisor));
        }

        sc.close();

    }
}
