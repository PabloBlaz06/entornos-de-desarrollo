package Tema5.ejercicios.primerosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        nombre.add("Pablo");
        nombre.add("Angel");
        nombre.add(2, "Rafa");
        nombre.add("Esteban");
        nombre.add("Pepe");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre para comprobar si esta en la lista: ");

        String nom1 = sc.nextLine();

        boolean existe = nombre.contains(nom1);
        System.out.println(existe);

        for (int i = 0; i < nombre.size(); i++) {
            if (nombre.get(i).equals(nom1)) {
                System.out.println((nombre.get(i)).toUpperCase());
            } else {
                System.out.println(nombre.get(i));
            }
        }

       /* for (String nombres : nombre) {
            System.out.println(nombres);
        }*/
    }
}
