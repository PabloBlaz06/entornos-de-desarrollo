package tema6.ejerciicios.ejercicios1;

import java.io.File;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        File archiv = new File("poema.txt");

        try(Scanner sc = new Scanner("poema.txt")){
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
    }
}
