package Tema5.practicaClase.ejercicioSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ej9 {
    public static void main(String[] args) {

        Set<String> lista = new TreeSet<>();
        lista.add("banana");
        lista.add("kiwi");
        lista.add("fresa");
        lista.add("mango");
        lista.add("piña");

        // Pista: así se pasa un Comparator al constructor
        TreeSet<String> porLongitud = new TreeSet<>(
                Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())
        );
        porLongitud.addAll(lista);

        System.out.println(porLongitud);
        System.out.println(lista);
    }
}
