package Tema5.ejercicios.ejerciciosMap;

/* Observar la diferencia de comportamiento entre HashMap y TreeMap.
Tarea: Crea un TreeMap<String, String> para guardar extensiones de archivo y su descripción
(ej: ".java" - "Archivo de código fuente Java").
Acción: Inserta 4 extensiones en orden desordenado.
Salida: Imprime el mapa completo y comprueba cómo Java las ha ordenado alfabéticamente por la extensión (la clave).*/

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio4 {
    public static void main(String[] args) {

        Map<String,String> extensiones = new TreeMap<>();
        extensiones.put("java","Archivo de código fuente Java");
        extensiones.put("phyton","Archivo de código fuente phyton");
        extensiones.put("jpg","Foto de codigo c++");
        extensiones.put("c++","Archivo de código fuente c++");

        for(Map.Entry<String,String> extension : extensiones.entrySet()){
            System.out.println(extension);
        }

    }
}
