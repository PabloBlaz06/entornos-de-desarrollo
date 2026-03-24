package Tema5.ejercicios.ejerciciosMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Practicar el metodo containsKey para evitar sobrescribir datos sin querer.
Tarea: Crea un Map<Integer, String> donde la clave sea el código del producto y el valor su nombre.
Lógica: Al añadir un producto, comprueba si el código ya existe.
Salida: Si el código existe, avisa al usuario; si no, añádelo al mapa.*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Map<Integer,String> inventario = new HashMap<>();

        inventario.put(111,"Zapatos");
        inventario.put(112,"Calcetines");
        inventario.put(113,"Pantalones");
        inventario.put(114,"Camisetas");

    }
}
