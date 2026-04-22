package tema6.ejerciicios.ejercicios1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {

        String nombreArchivo = "poema.txt";
        int totalLineas = 0;
        int contadorA = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader(nombreArchivo))) {

            String linea;

            System.out.println("=== Contenido del poema ===");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                totalLineas++;

                for (char c : linea.toCharArray()) {
                    if (c == 'a' || c == 'A') {
                        contadorA++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Estadísticas:");
        System.out.println("Total de líneas: " + totalLineas);

        System.out.println("Veces que aparece 'a'/'A': " + contadorA);
    }
}