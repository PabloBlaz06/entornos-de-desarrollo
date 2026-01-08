package Tema2.src.Ejercicios5;

/*   Crea un programa que descubra si una palabra es o no palíndroma, es decir se lee igual del derecho que del revés.
Introduciendo: “oso”
Da como salida: true */

public class ejercicio6 {
    public static void main(String[] args) {

        String cadena = "oso";

        String alReves = new StringBuilder(cadena).reverse().toString();

        System.out.println(cadena.equals(alReves));

    }
}
