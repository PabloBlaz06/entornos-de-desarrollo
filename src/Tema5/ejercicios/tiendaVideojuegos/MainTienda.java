package Tema5.ejercicios.tiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTienda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        List<Videojuego> inventario = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();

        do {
            System.out.println("\n=== TIENDA DE VIDEOJUEGOS ===");
            System.out.println("1. Crear Videojuego");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Consultar titulo");
            System.out.println("4. Consultar stock");
            System.out.println("5. Buscar cliente");
            System.out.println("6. Buscar cliente");
            System.out.println("7. Buscar cliente");
            System.out.println("8. Buscar cliente");
            System.out.println("9. Buscar cliente");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: // Crear videojuego
                    System.out.println("Introduce el titulo del videojuego");
                    String titulo = sc.nextLine();
                    System.out.println("Introduce la plataforma del videojuego");
                    String plataforma = sc.nextLine();
                    System.out.println("Introduce el genero del videojuego");
                    String genero = sc.nextLine();
                    System.out.println("Introduce el precio del videojuego");
                    double precio = sc.nextDouble();
                    System.out.println("Introduce la stock del videojuego");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    // Dos líneas
                    Videojuego videojuego = new Videojuego(titulo, plataforma, genero, precio, stock);
                    inventario.add(videojuego);

                    // Una sóla línea
                    // inventario.add( new Videojuego(titulo, plataforma, genero, precio, stock));

                    break;
                case 2: // Mostrar inventario
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío");
                    }else{
                        for (Videojuego v : inventario) {
                            System.out.println(v.toString());
                        }
                    }
                    break;
                case 3: // Crear videojuego
                    System.out.println("Introduce el titulo o el codigo del videojuego:");
                    String dato = sc.nextLine();
                    Videojuego v = null;

                    break;
            }
        } while (opcion!=0);
        sc.close();
    }
}
