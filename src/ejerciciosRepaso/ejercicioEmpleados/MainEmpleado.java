package ejerciciosRepaso.ejercicioEmpleados;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainEmpleado {
    static Empleado [] empleados = new Empleado[3];
    static int posLibre = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("\n---MENU EMPLEADOS---");
            System.out.println("1. Crear empleado");
            System.out.println("2. Leer empleados");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Borrar empleado");
            System.out.println("0. Salir");
            System.out.println("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1: crear();
                case 2: leer();
                case 3: actualizar();
                case 4: borrar();

            }
        }while (opcion!=0);
    }

    private static void crear() {
        if (posLibre >= empleados.length){
            System.out.println("No hay espacio en el array");
        }else{
            System.out.println("Ingrese el nombre del empleado");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el ID del empleado");
            int id = sc.nextInt();
            System.out.println("Ingrese el salario del empleado");
            double salario = sc.nextDouble();
            sc.nextLine();
            System.out.println("Tipo (d = desarrollador / g = gerente): ");
            String tipo = sc.nextLine();
            Empleado nuevoEmpleado;
            if (tipo.equalsIgnoreCase("d")){
                System.out.println("Ingrese el lenguaje principal del empleado: ");
                String lenguaje = sc.nextLine();
                nuevoEmpleado = new Desarrollador(nombre, id, salario, lenguaje);
                empleados[posLibre] = nuevoEmpleado;
                System.out.println("Empleado añadido");
                posLibre++;
            } else if(tipo.equalsIgnoreCase("g")){
                System.out.println("Ingrese el bono por proyectos: ");
                double bono = sc.nextDouble();
                sc.nextLine();
                nuevoEmpleado = new Gerente(nombre, id, salario, bono);
                empleados[posLibre] = nuevoEmpleado;
                System.out.println("Empleado añadido");
                posLibre++;
            }else{
                System.out.println("El tipo no existe");
            }
        }
    }

    private static void leer() {
        System.out.println("\n---LISTADO EMPLEADOS---");
        for (int i = 0; i < empleados.length; i++){
            if(empleados[i] != null){
                System.out.println(empleados[i].toString());
            }
        }
    }

    private static void actualizar() {
        System.out.println("Introduce el id del empleado: ");
        int id = sc.nextInt();
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i].getId() == id){

                System.out.println("Quieres cambiar su nombre o salario base?(s/n): ");
                String cambio = sc.nextLine();

                if(cambio.equalsIgnoreCase("s")){
                    System.out.println("Que quieres cambiar su nombre o salario base(n/sb): ");
                    String nuevo = sc.nextLine();
                    if(nuevo.equalsIgnoreCase("n")){
                        System.out.println("Introduce el nuevo nombre del empleado: ");
                        String newNombre = sc.nextLine();
                        empleados[i].setNombre(newNombre);
                    } else if (nuevo.equalsIgnoreCase("sb")) {
                        System.out.println("Introduce el nuevo salario base del empleado: ");
                        Double newSalario = sc.nextDouble();
                        empleados[i].setSalarioBase(newSalario);
                    } else{
                        System.out.println("Tienes que introducir n o sb");
                    }
                }
            }else{
                System.out.println("No existe ningun empleado con ese id");
            }
        }
    }

    private static void borrar() {
        System.out.println("Introduce el id del empleado: ");
        int id = sc.nextInt();
        for(int i = 0; i < empleados.length; i++) {
            if(empleados[i].getId() == id){
                empleados[i] = null;
            }else{
                System.out.println("No existe ningun empleado con ese id");
            }
        }
    }

}
