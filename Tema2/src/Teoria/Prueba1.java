package Teoria;

import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce posicion: ");
        int posicion = sc.nextInt();

        switch (posicion) {
            case 1:
                System.out.println("david");
                break;
            case 2:
                System.out.println("antonio");
                break;
            case 3:
                System.out.println("juan carlos");
                break;
            default:
                System.out.println("gabriel");
                break;
        }

        sc.close();
    }
}
