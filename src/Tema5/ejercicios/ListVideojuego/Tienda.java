package Tema5.ejercicios.ListVideojuego;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Tienda {

    private List<VideoJuegos> inventario = new ArrayList<>();
    private List<Clientes>    clientes   = new ArrayList<>();
    private List<Venta>      ventas     = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void anadirVideojuego(){
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Plataforma: ");
        String plataforma = sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine();

        VideoJuegos videoJuegos = new VideoJuegos(titulo, plataforma, genero, precio, stock);
        inventario.add(videoJuegos);

        System.out.println("Videojuego añadido: " + titulo);
    }

    public void mostrarInventario(){
        if (inventario.isEmpty()){
            System.out.println("Tienes el inventario vacio, añade algun juego");
        }else {
            for (VideoJuegos videojuegos : inventario) {
                System.out.println(videojuegos);
            }
            System.out.println("Total de inventario: " + inventario.size());
        }
    }

    public void consultarTitulo() {

        System.out.println("Buscar por (1-Código UUID  2-Nombre): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if(opcion == 1){
            System.out.print("Introduce el código UUID: ");
            String entrada = sc.nextLine();
            UUID codigo = UUID.fromString(entrada);
            boolean encontrado = false;

            for (VideoJuegos juego : inventario) {
                if (juego.getCodigo().equals(codigo)) {
                    System.out.println("Videojuego encontrado: " + juego);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún videojuego con ese código");
            }
        }else if(opcion == 2){
            System.out.print("Introduce el título: ");
            String titulo = sc.nextLine();
            boolean encontrado = false;

            for (VideoJuegos juego : inventario) {
                if (juego.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                    System.out.println("Videojuego encontrado: " + juego);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún videojuego con ese título");
            }
        } else{
            System.out.println("Codigo no valido");
        }
    }

    public void consultarStock() {

        System.out.print("Introduce el título del videojuego: ");
        String titulo = sc.nextLine();
        boolean encontrado = false;

        for (VideoJuegos juego : inventario) {
            if (juego.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("Título: " + juego.getTitulo());
                System.out.println("Stock: "  + juego.getStock() + " unidades disponibles");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún videojuego con ese título");
        }
    }

    public void buscarCliente() {

        System.out.println("Buscar por (1-Código  2-Nombre  3-Apellidos  4-Email): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {

            System.out.print("Introduce el código de cliente: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            boolean encontrado = false;

            for (Clientes cliente : clientes) {
                if (cliente.getCodCliente() == codigo) {
                    System.out.println("Cliente encontrado: " + cliente);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún cliente con ese código.");
            }

        } else if (opcion == 2) {

            System.out.print("Introduce el nombre: ");
            String nombre = sc.nextLine();
            boolean encontrado = false;

            for (Clientes cliente : clientes) {
                if (cliente.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                    System.out.println("Cliente encontrado: " + cliente);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún cliente con ese nombre.");
            }

        } else if (opcion == 3) {

            System.out.print("Introduce los apellidos: ");
            String apellidos = sc.nextLine();
            boolean encontrado = false;

            for (Clientes cliente : clientes) {
                if (cliente.getApellidos().toLowerCase().contains(apellidos.toLowerCase())) {
                    System.out.println("Cliente encontrado: " + cliente);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún cliente con esos apellidos.");
            }

        } else if (opcion == 4) {

            System.out.print("Introduce el email: ");
            String email = sc.nextLine();
            boolean encontrado = false;

            for (Clientes cliente : clientes) {
                if (cliente.getEmail().toLowerCase().contains(email.toLowerCase())) {
                    System.out.println("Cliente encontrado: " + cliente);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún cliente con ese email.");
            }

        } else {
            System.out.println("Opción no válida.");
        }
    }

    public void registrarVenta(){
        System.out.print("Introduce el código del cliente: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        Clientes clienteVenta = null;

        for (Clientes cliente : clientes) {
            if (cliente.getCodCliente() == codigo) {
                clienteVenta = cliente;
            }
        }

        if (clienteVenta == null) {
            System.out.println("No se encontró ningún cliente con ese código");
            return;
        }

        List<VideoJuegos> articulosVenta = new ArrayList<>();
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {

            System.out.print("Introduce el título del videojuego: ");
            String titulo = sc.nextLine();

            VideoJuegos juegoVenta = null;

            for (VideoJuegos juego : inventario) {
                if (juego.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                    juegoVenta = juego;
                }
            }
            if (juegoVenta == null) {
                System.out.println("No se encontró ese videojuego en el inventario.");

            } else if (juegoVenta.getStock() == 0) {
                System.out.println("No hay stock disponible de: " + juegoVenta.getTitulo());
            } else {
                articulosVenta.add(juegoVenta);
                juegoVenta.setStock(juegoVenta.getStock() - 1);
                System.out.println("Añadido: " + juegoVenta.getTitulo()
                        + " (stock restante: " + juegoVenta.getStock() + ")");
            }
            System.out.print("¿Añadir otro videojuego? (si/no): ");
            respuesta = sc.nextLine();
        }

        if (articulosVenta.isEmpty()) {
            System.out.println("No se añadió ningún artículo. Venta cancelada.");
            return;
        }

        Venta venta = new Venta(clienteVenta, articulosVenta);
        ventas.add(venta);

        System.out.println("Venta registrada correctamente" + venta);

    }

    public void mostrarHistorial() {

        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
            return;
        }

        System.out.println("=== HISTORIAL DE VENTAS ===");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
        System.out.println("Total de ventas: " + ventas.size());
    }




}
