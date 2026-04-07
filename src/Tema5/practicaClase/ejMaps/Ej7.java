package Tema5.practicaClase.ejMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej7 {
    public static void main(String[] args) {

        String[][] datos = {
                {"Ana", "Informática"}, {"Luis", "Matemáticas"},
                {"Marta", "Informática"}, {"Pedro", "Física"},
                {"Sara", "Matemáticas"}, {"Juan", "Informática"}
        };

        Map<String, List<String>> alumnos = new HashMap<>();
        // Pista: esto reemplaza 5 líneas de if/containsKey/new ArrayList
        alumnos.computeIfAbsent("Informática", k -> new ArrayList<>()).add("Ana");
        alumnos.computeIfAbsent("Informática", k -> new ArrayList<>()).add("Marta");
        alumnos.computeIfAbsent("Matemáticas", k -> new ArrayList<>()).add("Sara");
        alumnos.computeIfAbsent("Matemáticas", k -> new ArrayList<>()).add("Luis");
        alumnos.computeIfAbsent("Física", k -> new ArrayList<>()).add("Pedro");
        alumnos.computeIfAbsent("Informática", k -> new ArrayList<>()).add("Juan");

        System.out.println(alumnos);
    }
}
