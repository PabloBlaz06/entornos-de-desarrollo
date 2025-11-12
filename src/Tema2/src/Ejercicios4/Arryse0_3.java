package Tema2.src.Ejercicios4;

import java.util.Scanner;

/*Agenda para almacenar nombres y telefonos de personas.
los nombres en un array y los telefonos en otro.
la correlacion es en base al indice.*/
public class Arryse0_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos datos vas a meter");
        int cantidadDatos = sc.nextInt();

        String[] nombres = new String[cantidadDatos];

        int[] telefonos = new int[cantidadDatos];

        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("escribe el nombre");
            String nombre = sc.next();
            nombres[i] = nombre;

            System.out.println("ahora escribe el numero");
            telefonos[i] = sc.nextInt();

            System.out.println("Nombre: " + nombres[i] + " Telefono: " + telefonos[i]);
        }

        sc.close();

        
    }
}
