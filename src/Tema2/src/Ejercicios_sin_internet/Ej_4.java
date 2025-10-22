package Tema2.src.Ejercicios_sin_internet;

/*Escribe un metodo para calcular el area de un rectangulo dados base y altura*/

import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base de un rectangulo: ");
        int base = sc.nextInt();

        System.out.println("Introduce la altura de un rectangulo: ");
        int altura = sc.nextInt();

        sc.close();

        area(base, altura);
    }

    static void area(int base, int altura) {
        System.out.println("El area de tu rectangulo es: " + (base * altura));
    }
}
