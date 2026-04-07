package Tema5.ejercicios.ejerciciosMap;

import java.util.HashMap;
import java.util.Map;
/* Aprender a recorrer un mapa utilizando el conjunto de sus claves (keySet).
Tarea: Crea un HashMap<String, Double> con los nombres de 4 alumnos y sus notas.
Acción: Recorre el mapa utilizando un bucle for-each sobre notas.keySet().
Salida: Imprime por cada vuelta: "El alumno [clave] tiene una nota de [valor]".*/
public class Ejercicio3 {
    public static void main(String[] args) {

        Map<String, Double> notas = new HashMap<>();
        notas.put("Ruben" , 8.6);
        notas.put("Carlos" , 9.1);
        notas.put("Marcos" , 8.0);
        notas.put("Alejandro" , 7.2);

        for (String nota : notas.keySet()) {
            System.out.println("El alumno " + nota + " es: " + notas.get(nota));
        }

    }
}
