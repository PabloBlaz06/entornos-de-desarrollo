package tema6.ejerciicios.ejercicios1;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Ej1 {
    public static void main(String[] args) {

        // Crear carpeta
        File carpeta = new File("MiDirectorioDAM");

        if(!carpeta.exists()){
            if(carpeta.mkdir()){
                System.out.println("Carpeta creada: " + carpeta.getName());
            }
        }else{
            System.out.println("La carpeta ya existe");
        }

        // Crear archivos
        File datos = new File(carpeta,"datos.txt");
        File config = new File(carpeta, "config.ini");

        try{
            if(datos.createNewFile()){
                System.out.println("Archivo datos.txt creado");
            }
            if(config.createNewFile()){
                System.out.println("Archivo config.ini creado");
            }
        }catch(IOException e){
            System.out.println("ERROR:" + e.getMessage());
        }

        // Listar el contenido de la carpeta
        System.out.println("Contenido de MiDirectorioDAM");
        File[] archivos = carpeta.listFiles();
        for(File archivo : archivos){
            System.out.println(archivo.getName() + " - " +  archivo.length() + " bytes");
        }


    }
}
