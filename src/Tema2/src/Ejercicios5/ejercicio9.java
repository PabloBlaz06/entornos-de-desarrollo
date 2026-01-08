package Tema2.src.Ejercicios5;

/*Escribe un programa que recibe dos cadenas de caracteres y comprueba cuantas veces aparece la primera en la segunda.
Introduciendo:               “la”
“La calle de la plaza”
Da como salida: 2 */

public class ejercicio9 {
    public static void main(String[] args) {

        String cadena1 = "la";
        String cadena2 = "La calle de la plaza";
        int contador = 0;

        for (int i = 0; i <= cadena2.length() - cadena1.length(); i++) {
            String compar = cadena2.substring(i, i + cadena1.length());
            if (compar.equals(cadena1)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
