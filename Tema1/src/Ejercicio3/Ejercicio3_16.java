package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber la tabla: ");
        int numero = sc.nextInt();

        System.out.println("1*"+numero+"="+ numero*1);
        System.out.println("2*"+numero+"="+ numero*2);
        System.out.println("3*"+numero+"="+ numero*3);
        System.out.println("4*"+numero+"="+ numero*4);
        System.out.println("5*"+numero+"="+ numero*5);
        System.out.println("6*"+numero+"="+ numero*6);
        System.out.println("7*"+numero+"="+ numero*8);
        System.out.println("8*"+numero+"="+ numero*8);
        System.out.println("9*"+numero+"="+ numero*9);
        System.out.println("10*"+numero+"="+ numero*10);

        sc.close();
    }
}
