package tema6.ejerciicios.ejercicios1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ej1_nuevo {
    public static void main(String[] args) {

        // Crear carpeta
        Path carpeta = Paths.get("MiDirectorioDAM2");

        try {
            if (!Files.exists(carpeta)) {
                Files.createDirectory(carpeta);
                System.out.println("Carpeta creada.");
            } else {
                System.out.println("La carpeta ya existe");
            }

            // Crear archivos
            Path datos = carpeta.resolve("datos.txt");
            Path config = carpeta.resolve("config.ini");
            if (!Files.exists(datos)) {
                Files.createFile(datos);
                System.out.println("Archivo datos.txt creado");
            }
            if (!Files.exists(config)) {
                Files.createFile(config);
                System.out.println("Archivo config.ini creado");
            }

            // Listar el contenido de la carpeta
            System.out.println("Contenido de MiDirectorioDAM2");
            for (Path archivo : Files.newDirectoryStream(carpeta)) {
                System.out.println(archivo.getFileName() + " - " + Files.size(archivo) + " bytes");
            }
        } catch (IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }

}
