package Tema2.src.Teoria;

import java.util.Scanner;

public class PruebasUsos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que edad tienes: ");
        int edad = sc.nextInt();

        System.out.println("Has tenido haccidentes(true si has tenido, false si no):");
        boolean accidentes = sc.nextBoolean();

        System.out.println("Que tipo de seguro quieres, a terceros o a todo riesgo: ");
        String tipoSeguro = sc.nextLine();

        System.out.println("Cuantos años llevas con el seguro: ");
        int tiempo = sc.nextInt();

        System.out.println("Cuantos años tiene el coche: ");
        int edadCoche = sc.nextInt();

        System.out.println("De que color es el coche: ");
        String color = sc.nextLine();
    }

    void precioSeguro(int edad, boolean accidentes, String tipoSeguro, int tiempo, int edadCoche, String color) {

        double precioBase = 100d;

        if (edad <= 18) {

        } else if(edad >=)
    }
}
