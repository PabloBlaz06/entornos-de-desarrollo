package tema6.ejerciicios.ejercicios1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("productos.csv"))){
            List<Ej4Producto> listado = new ArrayList<>();
            String linha;

            while ((linha = br.readLine()) != null){
                String[] paco = linha.split(";");
                int id = Integer.parseInt(paco[0]);
                String nombre = paco[1];
                Double precio = Double.parseDouble(paco[2]);
                listado.add(new Ej4Producto(id,nombre,precio));
            }
            for(Ej4Producto lista:  listado){
                System.out.println(lista.toString());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


}
