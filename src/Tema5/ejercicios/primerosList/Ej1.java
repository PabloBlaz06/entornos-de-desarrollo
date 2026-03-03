package Tema5.ejercicios.primerosList;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {

    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        nombre.add("Pablo");
        nombre.add("Angel");
        nombre.add(2, "Rafa");
        nombre.add("Esteban");
        nombre.add("Pepe");

        System.out.println(nombre);
        System.out.println(nombre.size());

        nombre.remove(4);

        System.out.println(nombre);
    }
}
