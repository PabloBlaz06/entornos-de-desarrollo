package Tema5.ejercicios.lambdasYStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ej3 {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Java", "Programación", "Stream", "Código", "DAM");

        Optional<String> resultado = lista.stream().max(Comparator.comparing(String::length));
        resultado.ifPresent(System.out::println);
    }
}
