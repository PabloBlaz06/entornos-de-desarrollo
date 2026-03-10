package Tema5.ejercicios.ejerciciosSet;

import java.util.HashSet;
import java.util.Set;


public class Ejercicio1 {
    public static void main(String[] args) {

        Set<String> invitados = new HashSet<>();

        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());
        System.out.println(invitados);
    }
}
