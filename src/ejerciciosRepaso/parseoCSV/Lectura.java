package ejerciciosRepaso.parseoCSV;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Lectura {
    static void main(String[] args) {

        int contadorError = 0;
        int contadorCorrectas = 0;
        ArrayList<String> listaErrores = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("FicheroCSV.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Errores.txt"))
        ) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String linea;
            int contadorLineas = 1;
            boolean valida;

            while((linea = br.readLine())!=null){
                boolean valido = true;
                String[] campos = linea.split(";");

                if(campos.length!=4){
                    valido = false;
                    bw.write("Error en el numero de campos en la linea: " + contadorLineas + "\n");
                    listaErrores.add("Error en el numero de campos en la linea: " + contadorLineas);
                }else{
                    int num = Integer.parseInt(campos[3].trim());
                    if(num <= 0){
                        valido = false;
                        bw.write("Error porque las horas no es entero positivo en la linea: " + contadorLineas + "\n");
                        listaErrores.add("Error porque las horas no es entero positivo en la linea: " + contadorLineas);
                    }

                    try {
                        LocalDate.parse(campos[0].trim(), formato);
                    }catch (Exception e){
                        valido = false;
                        bw.write("Error en el formato de la fecha en la linea: " +  contadorLineas + "\n");
                        listaErrores.add("Error en el formato de la fecha en la linea: " +  contadorLineas);
                    }
                }

                if(valido == true){
                    contadorCorrectas++;
                }else{
                    contadorError++;
                }

                contadorLineas++;
            }



        } catch (FileNotFoundException e) {
            System.err.println("Error: Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Lineas correctas: " + contadorCorrectas + "\n" + "Lineas con error: " + contadorError + "\n");
        System.out.println("Detalle de errores: ");
        for(String error : listaErrores){
            System.out.println(error);
        }

    }


}
