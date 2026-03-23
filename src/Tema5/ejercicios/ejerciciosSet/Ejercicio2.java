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

        Set <Integer> IDs = new HashSet<>();
        IDs.add(7);
        IDs.add(4);
        IDs.add(9);
        IDs.add(1);
        IDs.add(6);

        Scanner sc = new Scanner(System.in);

        System.out.println("introcude un entero: ");
        Integer num = sc.nextInt();
        sc.nextLine();

        boolean tieneAcceso = IDs.contains(num);

        System.out.println(tieneAcceso);




    }
}
