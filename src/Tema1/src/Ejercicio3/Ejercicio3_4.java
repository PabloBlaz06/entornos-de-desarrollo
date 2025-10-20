package Tema1.src.Ejercicio3;//Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        System.out.println("El numero: " + num + (num == 7 ? "Multiplo de 7" : " No es multiplo de 7"));

        sc.close();
    }
}
