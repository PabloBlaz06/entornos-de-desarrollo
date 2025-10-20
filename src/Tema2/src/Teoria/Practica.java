package Tema2.src.Teoria;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuanto dinero tiene: ");
        double dinero = sc.nextInt();

        if (dinero >= 7) {
            System.out.println("cocacola y bocata");
        } else if (dinero >= 5) {
            System.out.println("agua y bocata");
        } else if (dinero >= 2) {
            System.out.println("coca cola");
        } else {
            System.out.println("agua");
        }

        sc.close();
    }
}
