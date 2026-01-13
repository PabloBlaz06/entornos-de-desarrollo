package Tema3.practica.SISnotas;

import java.util.Arrays;
import java.util.Scanner;

public class mainAlumno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Alumno[] clase = new Alumno[3];
        for (int i = 0; i < clase.length; i++) {
            System.out.println("introduce un nombre");
            String n = sc.next();
            System.out.println("Introduce una nota");
            double nota = sc.nextDouble();
            clase[i] = new Alumno(n, nota);

            if (nota < 5) {
                System.out.println("le quieres aprobar? s/n");
                String s1 = sc.nextLine();
                if ("s".equals(s1)) {
                    clase[i].aprobar();
                } else {
                    System.out.println("Pues se queda suspenso");
                }
            }
        }

        System.out.println("Imprimimos todo el array :::::::");
        System.out.println(Arrays.toString(clase));

        sc.close();
    }
}
