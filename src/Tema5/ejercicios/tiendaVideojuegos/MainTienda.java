package Tema5.ejercicios.tiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MainTienda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, codigo;
        String dato, titulo;
        Videojuego videoJuego;
        Cliente cliente;
        Boolean encontrado = false;

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
                    titulo = sc.nextLine();
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
                case 5:     // Consultar cliente
                    System.out.println("Intriduce el código, nombre, papellido o email del cliente a buscar: ");
                    dato = sc.nextLine();
                    cliente = buscarCliente(clientes, dato);
                    if (cliente != null) {
                        System.out.println("El clientes existe");
                    }else{
                        System.out.println("El cliente no existe");
                    }
                    break;
                case 6:     // Registrar Venta
                    System.out.println("Introduzca el código de cliente");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    cliente = buscarCliente(clientes, String.valueOf(codigo));
                    if (cliente ==null){
                        // Dar de alta al cliente
                        System.out.println("El cliente no existe");
                        System.out.println("Introduce el nombre de cliente");
                        String nombre = sc.nextLine();
                        System.out.println("Introduce el apellido de cliente");
                        String apellidos = sc.nextLine();
                        System.out.println("Introduce el direccion de cliente");
                        String direccion = sc.nextLine();
                        System.out.println("Introduce el email de cliente");
                        String email = sc.nextLine();
                        cliente = new Cliente(nombre, apellidos, direccion, email, codigo);
                        clientes.add(cliente);
                    }

                    List<Videojuego> carrito = new ArrayList<>();
                    String respuesta;
                    do{
                        System.out.println("Titulo del juego a comprar");
                        titulo = sc.nextLine();
                        videojuego = buscarVideojuego(inventario, titulo);
                        if (videojuego != null) {
                            carrito.add(videojuego);
                        }else{
                            System.out.println("No lo he encontrado");
                        }
                        System.out.println("¿Desea comprar otro? (s/n)");
                        respuesta = sc.nextLine();
                    }while (respuesta.equalsIgnoreCase("s"));
                    // Verificar stock
                    for(Videojuego v : carrito){
                        if(v.getStock()<=0){
                            System.out.println("El stock no existe para el juego "+ v.getTitulo());
                            carrito.clear();
                            break;
                        }
                    }
                    // Si hay stock hacer la venta
                    if(!carrito.isEmpty()){
                        for (Videojuego v : carrito) {
                            v.setStock(v.getStock() - 1);
                        }
                            ventas.add(new Venta(cliente, carrito));
                            System.out.println("Venta registrada");
                    }
                    break;
                case 7:     // Mostrar historial de ventas completo
                     if (ventas.isEmpty()) {
                        System.out.println("No hay ventas registradas");
                    }else{
                         for (Venta v : ventas) {
                             System.out.println(v.toString());
                         }
                    }
                    break;
                case 8:     // Mostrar historial de ventas de una fecha
                    System.out.println("Introduce una fecha (AAAA-MM-DD): ");
                    dato = sc.nextLine();
                    LocalDate fecha = null;

                    try{
                        fecha = LocalDate.parse(dato);
                    }catch(Exception e){
                        System.out.println("Fecha no valido");
                        break;
                    }

                    encontrado = false;

                    for (Venta v : ventas){
                        if(v.getFechaVenta().equals(fecha)){
                            System.out.println(v.toString());
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("No hay ventas en esa fecha");
                    }
                    break;
                case 9:     // Estadísticas
                    if (ventas.isEmpty()) {
                        System.out.println("No hay ventas registradas");
                    }else{
                        System.out.println("/n**** Estadísticas ****");
                        System.out.println("/n1 Acumulado por plataforma");
                        acumuladoPorPlataforma(ventas);
                        System.out.println("/n2 Acumulado por género");
                        acumuladoPorGenero(ventas);
                        System.out.println("/n3 Título más vendido");
                        tituloMasVendido(ventas);
                        System.out.println("/n1 Mejor día de ventas");
                        mejorDiaVentas(ventas);
                    }
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

    public static void acumuladoPorPlataforma(List<Venta> ventas){
        List<String> plataformas = new ArrayList<>();
        List<Double> totales = new ArrayList<>();

        for (Venta venta : ventas) {
            for (Videojuego v : venta.getArticulos()){
                int indice = plataformas.indexOf(v.getPlataforma());
                if (indice == -1){
                    plataformas.add(v.getPlataforma());
                    totales.add(v.getPrecio());
                }else{
                    totales.set(indice, totales.get(indice) + v.getPrecio());
                }
            }
        }
        for(int i = 0; i < plataformas.size(); i++){
            System.out.println(plataformas.get(i) + ": " + totales.get(i) + " €");
        }
    }

    public static void acumuladoPorGenero(List<Venta> ventas){
        List<String> generos = new ArrayList<>();
        List<Double> totales = new ArrayList<>();

        for (Venta venta : ventas) {
            for (Videojuego v : venta.getArticulos()){
                int indice = generos.indexOf(v.getGenero());
                if (indice == -1){
                    generos.add(v.getPlataforma());
                    totales.add(v.getPrecio());
                }else{
                    totales.set(indice, totales.get(indice) + v.getPrecio());
                }
            }
        }
        for(int i = 0; i < generos.size(); i++){
            System.out.println(generos.get(i) + ": " + totales.get(i) + " €");
        }
    }

    public static void tituloMasVendido(List<Venta> ventas){
        List<String> titulos = new ArrayList<>();
        List<Integer> cantidades = new ArrayList<>();

        for (Venta venta : ventas) {
            for (Videojuego v : venta.getArticulos()){
                int indice = titulos.indexOf(v.getTitulo());
                if (indice == -1){
                    titulos.add(v.getTitulo());
                    cantidades.add(1);
                }else{
                    cantidades.set(indice, cantidades.get(indice) +1);
                }
            }
        }

        int max = 0;
        String tituloMasVendido = null;
        for(int i = 0; i < titulos.size(); i++){
           if(cantidades.get(i) > max){
               max = cantidades.get(i);
               tituloMasVendido = titulos.get(i);
           }
        }
        System.out.println("El más vendido es: " + tituloMasVendido);
    }

    public static void mejorDiaVentas(List<Venta> ventas){
        List<LocalDate> fechas = new ArrayList<>();
        List<Double> totales = new ArrayList<>();
        double totalVenta;
/*
        for (Venta venta : ventas) {
            totalVenta = 0.0;
            for (Videojuego v : venta.getArticulos()){
                totalVenta += v.getPrecio();
            }
            int indice = fechas.indexOf(venta.getFechaVenta());
            if (indice == -1){
                fechas.add(venta.getTitulo());
                totales.add(totalVenta);
            }else{
                totales.set(indice, totales.get(indice) + totalVenta);
            }
        }

        int max = 0;
        String tituloMasVendido = null;
        for(int i = 0; i < titulos.size(); i++){
            if(cantidades.get(i) > max){
                max = cantidades.get(i);
                tituloMasVendido = titulos.get(i);
            }
        }
        System.out.println("El más vendido es: " + tituloMasVendido);*/
    }


}
