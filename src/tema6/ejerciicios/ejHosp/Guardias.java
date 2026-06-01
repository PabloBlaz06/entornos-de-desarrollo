package tema6.ejerciicios.ejHosp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Guardias {
    public static void main(String[] args) throws IOException {

        Path rutaBase = Paths.get("guardias.txt");
        Path rutaAño = Paths.get(".");

        Files.exists(rutaBase);

        Map<String, Map<String, int[]>> guardia = new HashMap<>();

        try (Scanner sc = new Scanner(new File("guardias.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] linea = line.split(";");
                String[] lineas = linea[0].split("/");

                if (!guardia.containsKey(lineas[2])) {
                    guardia.put(lineas[2], new HashMap<>());
                }

                for (int i = 1; i < linea.length; i++){
                    Map<String, int[]> mapaAño = guardia.get(lineas[2]);
                    if (!mapaAño.containsKey(linea[i])) {
                        mapaAño.put(linea[i], new int[12]);
                    }
                    mapaAño.get(linea[i])[Integer.parseInt(lineas[1]) - 1]++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }

        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        for (String año : guardia.keySet()) {
            Path carpetaAño = Paths.get(año);
            Files.createDirectories(carpetaAño);

            for (String nombre : guardia.get(año).keySet()) {
                Path fichero = carpetaAño.resolve(nombre + "_" + año + "_turnos.txt");
                try (PrintWriter pw = new PrintWriter(fichero.toFile())) {
                    int[] turnos = guardia.get(año).get(nombre);
                    for (int i = 0; i < 12; i++) {
                        pw.println(meses[i] + " " + turnos[i]);
                    }
                }
            }
        }
    }
}
