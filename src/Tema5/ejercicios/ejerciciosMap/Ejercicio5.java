package Tema5.ejercicios.ejerciciosMap;

/*Este ejercicio integra lógica de control de flujo con mapas.
Tarea: Crea un programa que reciba un array de Strings: {"Java", "Python", "Java", "C++", "Java", "Python"}.
Acción: Utiliza un Map<String, Integer> para contar cuántas veces aparece cada lenguaje.
Pista: Si el lenguaje ya está en el mapa, suma 1 a su valor actual; si no, inícialo en 1.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> programas = new ArrayList<>();
        programas.add("Java");
        programas.add("Python");
        programas.add("Java");
        programas.add("C++");
        programas.add("Java");
        programas.add("Python");

        Map<String, Integer> nota = new HashMap<>();

        for(String nota1 : programas){
            nota.put(nota1, nota.getOrDefault(nota1, 0) + 1);
            System.out.println(nota);
        }

    }
}
