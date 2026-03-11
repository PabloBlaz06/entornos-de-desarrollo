package Tema5.ejercicios.ejerciciosMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Map<String,String> diccionario = new HashMap<>();

        diccionario.put("Apple","Manzana");
        diccionario.put("Banana","Platano");
        diccionario.put("Orange","Naranja");
        diccionario.put("Grapes","Uvas");
        diccionario.put("Pear","Pera");

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una fruta en ingles para ver su traduccion: ");
        String palabra = sc.toString();



    }
}
