package tema6.ejerciicios.ejercicios1;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int countDeA = 0;
        int countLineas = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("poema.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                countLineas++;
                System.out.println(linea);

                for(char a : linea.toCharArray()){
                    if(a == 'a' || a == 'A'){
                        countDeA++;
                    }
                }
            }

            System.out.println("Total de lineas: " + countLineas);
            System.out.println("Total de A: " + countDeA);

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}