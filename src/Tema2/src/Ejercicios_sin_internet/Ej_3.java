package Tema2.src.Ejercicios_sin_internet;

/*Implementa un metodo que reciba un nombre y edad y muestre un mensaje personalizado*/

import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EScribe tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Escribe tu edad:");
        String edad = sc.nextLine();

        sc.close();

        mensaje(nombre, edad);
    }

    static void mensaje(String nombre, String edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
    }

}
