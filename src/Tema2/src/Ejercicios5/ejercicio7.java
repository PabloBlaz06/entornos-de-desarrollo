package Tema2.src.Ejercicios5;

/* Implementa un programa que sume todas las cifras de los números que aparecen en una cadena de caracteres.
Introduciendo: “15 de Noviembre de 2012”
Da como salida: 11 */

public class ejercicio7 {
    public static void main(String[] args) {
        String texto ="15 de Noviembre de 2012";
        StringBuilder numeros = new StringBuilder();
        int suma = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= '0' && c <= '9') {
                numeros.append(c);
            }
        }

        for (int i = 0; i < numeros.length(); i++) {
            suma += numeros.charAt(i) - '0';
        }

        System.out.println(suma);
    }
}
