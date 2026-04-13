package Tema5.ejercicios.lambdasYStreams;

import java.util.Arrays;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {

        List<Integer> notas = Arrays.asList(3,8,5,2,10,7,4);

        notas.stream()
                .filter(nota -> nota >= 5)
                .forEach(nota -> System.out.println(nota));

    }
}
