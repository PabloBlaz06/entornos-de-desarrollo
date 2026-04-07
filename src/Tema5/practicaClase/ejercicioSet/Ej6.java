package Tema5.practicaClase.ejercicioSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ej6 {
    public static void main(String[] args) {

        Set<String> equipoA = new HashSet<>(Arrays.asList("Ana", "Luis", "Marta", "Pedro"));
        Set<String> equipoB = new HashSet<>(Arrays.asList("Luis", "Marta", "Sara", "Juan"));

        Set<String> equipo = new HashSet<>(equipoA);
        equipo.addAll(equipoB);

        System.out.println(equipo);
    }
}
