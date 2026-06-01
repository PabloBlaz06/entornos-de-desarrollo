package ejerciciosRepaso.ut2.ej26;

import java.util.Scanner;

public class Ejercicio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Introduce nota (0-10): ");
            nota = sc.nextDouble();
            if (nota > 10 || nota < 0 ) { // HUECO 1
                System.out.println("Nota no válida.");
            }
        } while (nota >= 0|| nota <= 10 ); // HUECO 2
        System.out.println("Nota válida: " + nota);
    }
}
