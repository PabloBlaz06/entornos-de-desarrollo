package Tema4.practica.ej3excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce un entero: ");
            int numero1 = sc.nextInt();

            System.out.println("Introduce otro entero: ");
            int numero2 = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("No has puesto un entero");
        } finally {

            sc.close();
        }


    }
}
