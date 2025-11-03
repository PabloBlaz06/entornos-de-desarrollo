package Tema1.src.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println(edad >= 18? "eres mayor de edad" : "no eres mayor de edad");
    }
}
