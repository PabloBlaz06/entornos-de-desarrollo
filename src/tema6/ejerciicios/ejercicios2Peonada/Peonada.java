package tema6.ejerciicios.ejercicios2Peonada;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Peonada {
    public static void main(String[] args) {

        List<String> lineas = new ArrayList<String>();

        // LECTURA DE LA SLINEAS DEL FICHERO

        try {
            BufferedReader br = new BufferedReader(new FileReader("peonadas.txt"));
            String linea;
            while((linea = br.readLine()) !=null){
                lineas.add(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // PROCESADO DE LAS LINEAS DEL FICHERO
        Map<Integer, Map<String, int[]>> datos = new HashMap<>();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for(String linea : lineas){
            String[] partes = linea.split(";");
            LocalDate fecha  = LocalDate.parse(partes[0],formato);
            int año = fecha.getYear();
            int mes = fecha.getMonthValue()-1;

            datos.putIfAbsent(año, new HashMap<>());
            for(int i = 1; i < partes.length; i++){
                String trabajador = partes[i].trim().replace(" ", "_");
                datos.get(año).putIfAbsent(trabajador, new int[12]);
                datos.get(año).get(trabajador)[mes]++;
            }
        }

        // CREAR LAS CARPETAS Y LOS ARCHIVOS

        for(int año : datos.keySet()){
            File carpeta = new File(String.valueOf(año));
            if(!carpeta.exists()){
                carpeta.mkdir();
            }
            for(String trabajador : datos.get(año).keySet()){
                String ruta = año + "/" + trabajador + "_peonadas.txt";
                int [] meses = datos.get(año).get(trabajador);
                String lineaArchivo =
                        "Enero " + meses[0] + "\n" +
                                "Febrero " + meses[1] + "\n" +
                                "Marzo " + meses[2] + "\n" +
                                "Abril " + meses[3] + "\n" +
                                "Mayo " + meses[4] + "\n" +
                                "Junio " + meses[5] + "\n" +
                                "Julio " + meses[6] + "\n" +
                                "Agosto " + meses[7] + "\n" +
                                "Septiembre " + meses[8] + "\n" +
                                "Octubre " + meses[9] + "\n" +
                                "Noviembre " + meses[10] + "\n" +
                                "Diciembre " + meses[11] + "\n";
                System.out.println(lineaArchivo);
                try{
                    BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
                    bw.write(lineaArchivo);
                    bw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Archivos y carpetas creadas");
    }
}
