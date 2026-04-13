package Tema5.ejercicios.lambdasYStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    public static void main(String[] args) {

        List<String> alumnos = Arrays.asList("ana", "luis", "guzmán", "marta");

        List<String> nomMayus = alumnos.stream()
                .map(nombre -> nombre.toUpperCase())
                .collect(Collectors.toList());
        nomMayus.forEach(System.out::println);
     }
}
