package Tema5.ejercicios.ejerciciosSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {

        Set<Integer> rifa = new TreeSet<>();

        rifa.add(45);
        rifa.add(12);
        rifa.add(89);
        rifa.add(3);
        rifa.add(22);

        for(Integer premios : rifa){
            System.out.println(premios);
        }

    }
}
