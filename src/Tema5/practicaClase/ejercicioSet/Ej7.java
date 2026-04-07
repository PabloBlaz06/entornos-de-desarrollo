package Tema5.practicaClase.ejercicioSet;

import java.util.HashSet;
import java.util.Set;

public class Ej7 {
    public static void main(String[] args) {

        String frase = "el gato come el pescado y el perro come el hueso";

        Set<String> nombres = new HashSet<String>();

        for(String nombre : frase.split(" ")) {
            nombres.add(nombre);
        }

        System.out.println(nombres);
    }
}
