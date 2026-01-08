package Tema2.src.Ejercicios5;

/* Desarrolla una solución que elimine todas las vocales de una frase.
Introduciendo: “Hola a Todos”
Da como salida: “Hl Tds” */

public class ejercicio11 {
    public static void main(String[] args) {

        StringBuilder cadena = new StringBuilder("Hola a Todos");

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {

                cadena.delete(i, i + 1);
                i--;
            }
        }

        System.out.println(cadena);
    }
}
