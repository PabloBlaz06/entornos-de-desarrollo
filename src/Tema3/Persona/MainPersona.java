package Tema3.Persona;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();

        System.out.println("Introduce el sexo: ");
        String sexo = sc.next();

        System.out.println("Introduce el peso: ");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();

        persona p1 = new persona("Lara", 25, 'M', 60.5, 1.65);

        persona p2 = new persona("Carlos", 17, 'H');

        persona p3 = new persona("Ruben");

        p1.calcularIMC();
        p2.calcularIMC();
        p3.calcularIMC();

        p1.esMayorDeEdad();
        p2.esMayorDeEdad();
        p3.esMayorDeEdad();

        System.out.println("Persona 1: " + p1.toString());
        System.out.println("Persona 2: " + p2.toString());
        System.out.println("Persona 3: " + p3.toString());

        sc.close();

    }
}
