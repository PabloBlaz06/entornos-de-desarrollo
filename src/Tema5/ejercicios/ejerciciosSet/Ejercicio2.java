package Tema5.ejercicios.ejerciciosSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.
Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.
Acción: Pide al usuario por teclado un número usando Scanner.
Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no. */

public class Ejercicio2 {
    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();
        ids.add(6);
        ids.add(9);
        ids.add(2);
        ids.add(5);
        ids.add(4);


        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero entero: ");
        int numero = sc.nextInt();

        boolean contenido = false;

        if (ids.contains(numero)) {
            contenido = true;
        }



    }
}
