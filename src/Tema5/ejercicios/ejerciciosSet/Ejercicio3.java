package Tema5.ejercicios.ejerciciosSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).
Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.
Acción: Añade los números: 45, 12, 89, 3, 22.
Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra. */

public class Ejercicio3 {
    public static void main(String[] args) {

        Set<Integer> rifa = new TreeSet<>();
        rifa.add(45);
        rifa.add(12);
        rifa.add(89);
        rifa.add(3);
        rifa.add(22);

        for(Integer numero : rifa){
            System.out.println(numero);
        }

    }
}
