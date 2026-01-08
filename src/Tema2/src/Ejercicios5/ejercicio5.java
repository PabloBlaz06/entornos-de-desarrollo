package Tema2.src.Ejercicios5;

/*  Escribe un programa que lea un número en coma flotante de doble precisión,
lo convierta a una cadena y le añada las comas separadoras de los miles.
Introduciendo: 2388432.34
Da como salida: 2,388,432.34 */

public class ejercicio5 {
    public static void main(String[] args) {

        String numero = "2388432.34" ;
        String resultado = "";
        int contador = 0;

        for (int i = numero.indexOf('.') - 1; i >= 0; i--) {
            resultado = numero.charAt(i) + resultado;
            contador++;

            if (contador == 3 && i != 0) {
                resultado = "," + resultado;
                contador = 0;
            }
        }

        System.out.println(resultado + numero.substring(numero.indexOf('.')));
    }
}
