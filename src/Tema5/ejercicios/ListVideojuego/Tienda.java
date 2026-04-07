package Tema5.ejercicios.ListVideojuego;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Tienda {
    Scanner sc = new Scanner(System.in);
    List<VideoJuegos> inventario = new ArrayList<>();
    List<Clientes> clientela = new ArrayList<>();
    List<Venta> ventas = new ArrayList<>();

    public void addVideojuego(VideoJuegos videojuego) {
        inventario.add(videojuego);
    }

    public void mostrarInventario() {
        for (VideoJuegos juego : inventario) {
            System.out.println(juego);
        }
    }

    public void buscartitulo(){
        System.out.println("Introduce como quieres consultar un titulo (1:codigo identificativo | 2:nombre titulo)");
        int opcion = sc.nextInt();

        if(opcion==1) {
            System.out.println("Introduce el codigo identificativo:");
            String codigo = sc.next();
            for(VideoJuegos juego : inventario) {
                if (juego.getCodigo().equals(UUID.fromString(codigo))) {
                    System.out.println("El titulo si existe " + inventario);
                    return;
                } else {
                    System.out.println("El titulo todavia no exisre pero lo puedes crear");
                }
            }
        }else if(opcion==2) {
            System.out.println("Introduce el nombre:");
            String codigo = sc.next();
            for(VideoJuegos juego : inventario) {
                if (juego.getTitulo().equals(codigo)) {
                    System.out.println("El titulo si existe " + inventario);
                    return;
                } else {
                    System.out.println("El titulo todavia no exisre pero lo puedes crear");
                }
            }
        }else{
            System.out.println("Opcion invalida");
        }
    }

    public void consultarStock(){
        System.out.println("Introduce un titulo para mirar el stock: ");
        String dato = sc.next();
        for (VideoJuegos juego : inventario) {
            if (juego.getTitulo().equals(dato)) {
                System.out.println("Stock: " + juego.getStock());
                return;
            }
        }
        System.out.println("Título no encontrado");
    }

    public void buscarCliente(){
        System.out.println("Introduce como quieres consultar un cliente (1-por codigo|2-por nombre|3-por apellidos|4-por email):");
        int opcion = sc.nextInt();
        if(opcion==1) {
            System.out.println("Introduce el codigo identificativo:");
            int codigo = sc.nextInt();
            for(Clientes cli : clientela) {
                if (cli.getCodigoCliente() == codigo) {
                    System.out.println("El cliente si existe " + clientela);
                    return;
                } else {
                    System.out.println("El cliente todavia no existe");
                }
            }
        } else if (opcion==2) {
            System.out.println("Introduce el nombre: ");
            String nombre = sc.next();
            for(Clientes cli : clientela) {
                if (cli.getNombre().equals(nombre)) {
                    System.out.println("El cliente si existe " + clientela);
                    return;
                }else {
                    System.out.println("El cliente todavia no existe");
                }
            }
        } else if (opcion == 3) {
            System.out.println("Introduce el apellido: ");
            String apellido = sc.next();
            for(Clientes cli : clientela) {
                if (cli.getApellidos().equals(apellido)) {
                    System.out.println("El cliente si existe " + clientela);
                    return;
                }else {
                    System.out.println("El cliente todavia no existe");
                }
            }
        } else if (opcion == 4) {
            System.out.println("Introduce el email: ");
            String email = sc.next();
            for(Clientes cli : clientela) {
                if (cli.getEmail().equals(email)) {
                   System.out.println("El cliente si existe " + clientela);
                    return;
                }else {
                    System.out.println("El cliente todavia no existe");
                }
            }
        }
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
        for(VideoJuegos venta1 : venta.getVideojuegos()) {
            venta1.setStock(venta1.getStock()-1);
        }
    }

    public void mostrarVentas(){
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public void historialVentas(){
        System.out.println("Introduce la fecha de la venta (YYYY-MM-DD): ");
        String fecha = sc.next();
        LocalDate fechaVenta = LocalDate.parse(fecha);

        for(Venta venta1 : ventas) {
            if(venta1.getFecha().equals(fechaVenta)) {
                System.out.println(venta1);
            }
        }
    }

}
