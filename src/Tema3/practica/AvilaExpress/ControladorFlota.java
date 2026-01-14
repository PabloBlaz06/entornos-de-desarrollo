package Tema3.practica.AvilaExpress;

import java.util.Scanner;

public class ControladorFlota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NaveEspacial[] naveEspacials = new NaveEspacial[3];

        for (int i = 0; i < naveEspacials.length; i++) {
            System.out.println("Escribe nombre: ");
            String nombre = sc.next();
            System.out.println("Escribe una capacidad: ");
            double capacidad = sc.nextDouble();
            naveEspacials[i] = new NaveEspacial(capacidad, nombre);

        }

        naveEspacials[0].viajar(30);
        naveEspacials[1].viajar(60);

        for (int i = 0; i < naveEspacials.length; i++) {
            naveEspacials[i].mostrarEstado();
        }

        naveEspacials[0].repostar();
        naveEspacials[0].mostrarEstado();

        if (naveEspacials[0].getCombustible() < naveEspacials[1].getCombustible() || naveEspacials[0].getCombustible() < naveEspacials[2].getCombustible()) {
            if (naveEspacials[1].getCombustible() < naveEspacials[2].getCombustible()) {
                System.out.println("La nave con mayor combustible");
                naveEspacials[2].mostrarEstado();
            } else {
                System.out.println("la nave con mayor combustible es: ");
                naveEspacials[1].mostrarEstado();
            }
        } else if (naveEspacials[1].getCombustible() < naveEspacials[0].getCombustible() || naveEspacials[1].getCombustible() < naveEspacials[2].getCombustible()) {
            if (naveEspacials[0].getCombustible() < naveEspacials[2].getCombustible()) {
                System.out.println("La nave con mayor combustible");
                naveEspacials[2].mostrarEstado();
            } else {
                System.out.println("la nave con mayor combustible es: ");
                naveEspacials[0].mostrarEstado();
            }

        } else {
            if (naveEspacials[2].getCombustible() < naveEspacials[1].getCombustible()) {
                System.out.println("La nave con mayor combustible");
                naveEspacials[1].mostrarEstado();
            } else {
                System.out.println("la nave con mayor combustible es: ");
                naveEspacials[0].mostrarEstado();
            }
        }

        sc.close();
    }
}
