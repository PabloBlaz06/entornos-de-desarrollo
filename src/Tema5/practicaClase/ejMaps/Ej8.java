package Tema5.practicaClase.ejMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Map<String, Map<String, String>> agenda = new HashMap<>();

        Map<String,String> contacto1 = new HashMap<>();
        contacto1.put("telefono","611676767");
        contacto1.put("email","lara@gmail.com");
        contacto1.put("ciudad","avila");
        agenda.put("Lara",contacto1);

        Map<String,String> contacto2 = new HashMap<>();
        contacto2.put("telefono","612234545");
        contacto2.put("email","carlos@gmail.com");
        contacto2.put("ciudad","avila");
        agenda.put("Carlos",contacto2);

        Map<String,String> contacto3 = new HashMap<>();
        contacto3.put("telefono","611223344");
        contacto3.put("email","ruben@gmail.com");
        contacto3.put("ciudad","avila");
        agenda.put("Ruben",contacto3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del contacto:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el campo (telefono/email/ciudad):");
        String campo = sc.nextLine();

        if (agenda.containsKey(nombre)) {
            System.out.println(agenda.get(nombre).get(campo));
        } else {
            System.out.println("Contacto no encontrado");
        }

    }

    public static void mostrarContacto(String nombre, Map<String, Map<String, String>> agenda) {
        if (agenda.containsKey(nombre)) {
            Map<String, String> datos = agenda.get(nombre);
            for (Map.Entry<String, String> entry : datos.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("Contacto no encontrado");
        }
    }
}
