package Tema5.ejercicios.ejerciciosSet;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        System.out.println(colores);

        Set<String> colorines = new HashSet<>(colores);

        System.out.println(colorines);
    }
}
