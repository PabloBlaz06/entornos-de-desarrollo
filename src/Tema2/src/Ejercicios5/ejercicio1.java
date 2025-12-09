package Tema2.src.Ejercicios5;

/*  Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.
Introduciendo: “Hola a Todos”
Da como salida: “HOLA A TODOS” 8 cambios*/
public class ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola a Todos";

        System.out.println("original: " + cadena);
        System.out.println(cadena.toUpperCase());

        String cadenaMayusculas = cadena.toUpperCase();

        int cambios = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadenaMayusculas.charAt(i)) {
                System.out.println(ca);
            }
        }

    }
}
