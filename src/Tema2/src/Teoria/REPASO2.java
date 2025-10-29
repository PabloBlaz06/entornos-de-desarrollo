package Tema2.src.Teoria;

import java.util.Scanner;

public class REPASO2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("¿Has tenido un accidente alguna vez? true/false ");
        boolean accidentes = sc.nextBoolean();

        double precioInicial = 500d;

        sc.close();

        System.out.println("Tu precio del seguro es: " + calcularSeguro(precioInicial, edad, accidentes));

    }

    static double calcularSeguro(double precioInicial, int edad, boolean accidentes) {

        if (edad > 18 && edad < 25) {
            return precioInicial * 0.2 + precioInicial;
        } else if (edad > 35 && edad < 55) {
            if (accidentes == false) {
                return precioInicial - precioInicial * 0.1;
            } else {
                return precioInicial;
            }
        } else if (edad > 65) {
            if (accidentes == true) {
                return precioInicial * 1.3;
            } else {
                return precioInicial * 1.1;
            }
        }
        return precioInicial;
    }
}
