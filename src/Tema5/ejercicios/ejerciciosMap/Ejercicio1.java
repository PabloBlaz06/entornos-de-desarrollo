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
        String palabra = sc.nextLine();

        String traduccion = diccionario.get(palabra);

        if( traduccion != null){
            System.out.println(traduccion);
        }else {
            System.out.println("No hay esa fruta");
        }

        System.out.println("Escribe una fruta en español:");
        String espanol = sc.nextLine();

        if (diccionario.containsValue(espanol)){
            System.out.println("Si que existe esta palabra");
        } else {
            System.out.println("No existe la palabra");
        }
        sc.close();
    }
}
