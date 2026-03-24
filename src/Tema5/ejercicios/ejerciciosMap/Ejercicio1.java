package Tema5.ejercicios.ejerciciosMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* El objetivo es comprender la relación Clave-Valor y el uso de put y get.
Tarea: Crea un HashMap<String, String> llamado diccionario.
Acción: Añade 5 parejas de palabras Inglés-Español (ej: "Apple" - "Manzana").
Consulta: Pide una palabra en inglés por teclado y muestra su traducción. Si no existe, muestra un mensaje de error.
Consulta2: Busca si existe una palabra en Español.
*/

public class Ejercicio1 {
    public static void main(String[] args) {

        Map<String,String> diccionario = new HashMap<>();

        diccionario.put("Apple","Manzana");
        diccionario.put("Banana","Platano");
        diccionario.put("Orange","Naranja");
        diccionario.put("Grapes","Uvas");
        diccionario.put("Pear","Pera");


    }
}
