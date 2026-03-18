package Tema5.ejercicios.tiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MainTienda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, codigo;
        String dato;
        Videojuego videoJuego;
        Cliente cliente;

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
            System.out.println("6. Registrar venta");
            System.out.println("7. Mostrar historial de ventas completo");
            System.out.println("8. Mostrar historial de ventas de una fecha");
            System.out.println("9. Estadísticas");
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
                    dato = sc.nextLine();
                    videoJuego = buscarVideojuego(inventario, dato);
                    if (videoJuego != null) {
                        System.out.println(videoJuego.toString());
                    }else{
                        System.out.println("No lo he encontrado");
                    }
                    break;
                case 4: // Consultar stock
                    System.out.println("Introduce el titulo del videojuego:");
                    dato = sc.nextLine();
                    videoJuego = buscarVideojuego(inventario, dato);
                    if (videoJuego != null) {
                        System.out.println("Stock: " + videoJuego.getStock());
                    }else{
                        System.out.println("No lo he encontrado");
                    }
                    break;
                case 5:     // Consukltar cliente
                    break;
                case 6:     // Registrar Venta
                    System.out.println("Introuduzca el código de cliente");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    cliente = buscarCliente(clientes, codigo);
                    if (cliente ==null){
                        // Dar de alta al cliente
                        System.out.println("El cliente no existe");
                        System.out.println("Introduce el codigo de cliente");
                        codigo = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce el nombre de cliente");
                        String nombre = sc.nextLine();
                        System.out.println("Introduce el apellido de cliente");
                        String apellidos = sc.nextLine();
                        System.out.println("Introduce el direccion de cliente");
                        String direccion = sc.nextLine();
                        System.out.println("Introduce el email de cliente");
                        String email = sc.nextLine();
                        cliente = new Cliente(codigo, nombre, apellidos, direccion, email);
                        clientes.add(cliente);
                    }

                    List<Videojuego> carrito = new ArrayList<>();
                    String respuesta;
                    do{
                        System.out.println("Titulo del juego a comprar");
                        String titulo = sc.nextLine();
                        videojuego = buscarVideojuego(inventario, titulo);
                        if (videojuego != null) {
                            carrito.add(videojuego);
                        }else{
                            System.out.println("No lo he encontrado");
                        }
                        System.out.println("¿Desea comparr otro? (s/n)");
                        respuesta = sc.nextLine();
                    }while (respuesta.equalsIgnoreCase("s"));
                    // Verificar stock

                    // Si hay stock hacer la venta


                    break;


            }
        } while (opcion!=0);
        sc.close();
    }

    public static Videojuego buscarVideojuego(List<Videojuego> inventario, String dato){
        for (Videojuego v : inventario) {
            if (v.getTitulo().equalsIgnoreCase(dato)) {
                return v;
            }
        }
        try{
            UUID id = UUID.fromString(dato);
            for (Videojuego v : inventario) {
                if ( v.getCodigo().equals(id)) {
                    return v;
                }
            }
        }catch (Exception e){}
            return null;
    }

    public static Cliente buscarCliente(List<Cliente> clientes, String dato){
        try{
            int codigo = Integer.parseInt(dato);
            for (Cliente c : clientes) {
                if (c.getCodCliente() == codigo)
                    return c;
            }
        }catch (Exception e){}

        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(dato) || c.getApellidos().equalsIgnoreCase(dato) ||c.getEmail().equalsIgnoreCase(dato)){
                return c;

            }
        }

        return null;
    }
}
