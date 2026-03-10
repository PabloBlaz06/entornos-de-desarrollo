package Tema5.ejercicios.ejerciciosSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {

        Set<Integer> codigo = new HashSet<>();

        codigo.add(11);
        codigo.add(12);
        codigo.add(13);
        codigo.add(14);
        codigo.add(15);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        Integer num = sc.nextInt();



    }
}
