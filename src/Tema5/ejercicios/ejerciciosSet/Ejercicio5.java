package Tema5.ejercicios.ejerciciosSet;


/* El metodo add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.
Tarea: Crea un Set<String> para matrículas de coches.
Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el metodo add() devuelve false, muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema" */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {

        Set<String> coches = new HashSet<>();

        coches.add("A1");
        coches.add("B3");
        coches.add("D8");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una matricula: ");

        String matricula = sc.nextLine();

       if(coches.contains(matricula)){
           System.out.println("ERROR: La matrícula ya existe en el sistema");
       } else {
           coches.add(matricula);
       }


    }
}
