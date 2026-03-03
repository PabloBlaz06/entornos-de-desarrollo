package Tema5.practicaClase.ejBasico;

// Lista para guardar nombre de los alumnos de clase


import java.util.ArrayList;
import java.util.List;

public class BasicoListas {
    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        nombre.add("Pablo");
        nombre.add("Angel");
        nombre.add(2, "Rafa");
        nombre.add("Esteban");
        nombre.add("Pepe");


        System.out.println(nombre);
    }
}
