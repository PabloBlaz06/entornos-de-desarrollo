package tema6.ejerciicios.ejercicios1;

import java.io.*;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("archivo_origen.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("archivo_destino.txt"))){

            String linea;
            while((linea = br.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("La copia se ha realizado");
        }catch (FileNotFoundException e){
            System.out.println("Error: El archivo de origen no se ha encontrado");
        } catch (IOException e) {
            System.out.println("Error: Fallo en el proceso de lectura/escritura");
        }
    }
}
