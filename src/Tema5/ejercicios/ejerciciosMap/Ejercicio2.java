package Tema5.ejercicios.ejerciciosMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Map<Integer,String> inventario = new HashMap<>();

        inventario.put(111,"Zapatos");
        inventario.put(112,"Calcetines");
        inventario.put(113,"Pantalones");
        inventario.put(114,"Camisetas");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un codigo que empiece por 11:");
        Integer codigo= sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce un nombre de ese producto:");
        String nombre= sc.nextLine();

        if(inventario.containsKey(codigo)){
            System.out.println("¡Error! El código " + codigo + " ya está ocupado por: " + inventario.get(codigo));
        } else{
            inventario.put(codigo, nombre);
            System.out.println("Producto añadido con éxito.");
        }
    }
}
