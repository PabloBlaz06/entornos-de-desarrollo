package tema6.ejerciicios.ejercicios1;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Ej1 {
    public static void main(String[] args) {

        // Crear carpeta
        File carpe = new File("MiDirectorioDAM");

        if(!carpe.exists()){
            if(carpe.mkdir()){
                System.out.println("Carpeta creada: " + carpe.getName());
            }
        }else{
            System.out.println("La carpeta ya existe");
        }

        // Crear archivos
        File datos = new File(carpe,"datos.txt");
        File config = new File(carpe, "config.ini");

       try{
           if(!datos.createNewFile()){

               System.out.println("datos.txt creado ");

           }
           if(!config.createNewFile()){

               System.out.println("config.ini creado: " + config.getName());

           }
       } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
       }
        // Listar el contenido de la carpeta

        System.out.println("Contenido de MiDirectorioDAM");

        File[] archivos = carpe.listFiles();
       for(File archivo : archivos){
           System.out.println(archivo.getName() + " - " + archivo.length());
       }
    }
}
