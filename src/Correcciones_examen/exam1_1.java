package Correcciones_examen;

import java.util.Scanner;

public class exam1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println(" ");
        }
        for (int i = numero - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println(" ");
        }
        
        sc.close();
    }
}
