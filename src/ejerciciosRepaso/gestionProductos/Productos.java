package ejerciciosRepaso.gestionProductos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Productos {
    static Scanner sc = new Scanner(System.in);
    static File producto = new File("producto.txt");

    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("\n---MENU EMPLEADOS---");
            System.out.println("1. Crear productos");
            System.out.println("2. Leer productos");
            System.out.println("3. Buscar productos");
            System.out.println("4. Borrar productos");
            System.out.println("0. Salir");
            System.out.println("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1: crear();
                case 2: leer();
                case 3: buscar();
                case 4: borrar();

            }
        }while (opcion!=0);
    }

    private static void crear() {
        System.out.println("Introduce el id del producto: ");
        int id = sc.nextInt();
        System.out.println("Introduce el nombre del producto: ");
        String nombre = sc.next();
        System.out.println("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(producto,true))){

            bw.write(""+id+";"+nombre+";"+precio);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void leer() {
        try (BufferedReader br = new BufferedReader(new FileReader(producto))){
            String linea;
            while( (linea = br.readLine()) != null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void buscar() {
        System.out.println("Introduce el id del producto que quieres buscar: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean encontrado = false;
        try(BufferedReader br = new BufferedReader(new FileReader(producto))){
            String linea;
            while( (linea = br.readLine()) != null){
                String[] partes = linea.split(";");
                if(id==Integer.parseInt(partes[0])){
                    System.out.println("Producto encontrado: " + linea);
                    encontrado = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        if (!encontrado){
            System.out.println("Producto no encontrado");
        }
    }

    private static void borrar() {
        System.out.println("Introduce el id del producto que deseas borrar: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean encontrado = false;
        List<String> lineasMantenidas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(producto))) {
            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");
                if (id == Integer.parseInt(partes[0])) {
                    encontrado = true;
                }else {
                    lineasMantenidas.add(linea);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(producto))){
            for (String l : lineasMantenidas){
                bw.write(l);
                bw.newLine();
            }
            //bw.write(String.valueOf(lineasMantenidas));

        } catch (IOException e) {
            System.err.println("Error al reescribir el fichero: " + e.getMessage());
        }
        if (encontrado){
            System.out.println("Producto borrado");
        }else{
            System.out.println("No existe el producto");
        }

    }

}
