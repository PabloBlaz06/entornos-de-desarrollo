package Tema2.src.Teoria;

import java.util.Scanner;

public class StringLongitudYPosicion {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("la longitud es: " + palabra.length());
        System.out.println("primer caracter: " + palabra.charAt(0));
        System.out.println("Último: " + palabra.charAt(palabra.length() - 1));
        System.out.println("Contiene 'a': " + palabra.contains("a"));


    }
}
