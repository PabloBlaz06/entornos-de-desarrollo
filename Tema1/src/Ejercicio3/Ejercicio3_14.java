package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea cntidad de euros: ");
        int euros = sc.nextInt();

        int billete1 = euros / 500;
        euros = euros % 500;

        int billete2 = euros / 200;
        euros = euros % 200;

        int billete3 = euros / 100;
        euros = euros % 100;

        int billete4 = euros / 50;
        euros = euros % 50;

        int billete5 = euros / 20;
        euros = euros % 20;

        int billete6 = euros / 10;
        euros = euros % 10;

        int billete7 = euros / 5;
        euros = euros % 5;

        System.out.println("La cantidad de billetes que tengo que dar es: ");
        System.out.println(billete1 + "billetes de 500");
        System.out.println(billete2 + " billetes de 200€");
        System.out.println(billete3 + " billetes de 100€");
        System.out.println(billete4 + " billetes de 50€");
        System.out.println(billete5 + " billetes de 20€");
        System.out.println(billete6 + " billetes de 10€");
        System.out.println(billete7 + " billetes de 5€");

        sc.close();

    }
}
