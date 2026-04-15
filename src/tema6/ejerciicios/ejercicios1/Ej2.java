package tema6.ejerciicios.ejercicios1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw =null;
        String frase = "";
        System.out.println("Escribe frases para el diario(fin para terminar): ");

        try{
            bw = new BufferedWriter(new FileWriter("diario.txt",true));
            while(!frase.equalsIgnoreCase("fin")){
                frase = sc.nextLine();
                if (!frase.equalsIgnoreCase("fin")){
                    bw.write(frase);
                    bw.newLine();
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{

                try {
                    if(bw!=null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

        }
    }
}
