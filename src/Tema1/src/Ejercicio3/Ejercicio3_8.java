package Tema1.src.Ejercicio3;

import java.util.Scanner;

//Crea un programa que compruebe si un año es bisiesto
public class Ejercicio3_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un año para ver si es bisiesto: ");
        int año = sc.nextInt();

        System.out.println("El año es: " + año + " es " + ((año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) ? "bisiesto" : "no bisiesto"));
    }
}
