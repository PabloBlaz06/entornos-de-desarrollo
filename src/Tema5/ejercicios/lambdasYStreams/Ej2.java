package Tema5.ejercicios.lambdasYStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>(List.of("ana", "luis", "guzmán", "marta"));

        List<String> nomMayus = alumnos.stream()
                .map(String::toUpperCase) // Otra forma de ponerlo: .map(nombre -> nombre.toUpperCase())
                .toList(); // Otra forma de ponerlo: .collect(Collectors.toList());
        nomMayus.forEach(System.out::println);
     }
}
