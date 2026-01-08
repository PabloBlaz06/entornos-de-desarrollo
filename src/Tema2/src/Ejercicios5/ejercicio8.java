package Tema2.src.Ejercicios5;

/* Igual al anterior pero sumando los números completos.
Introduciendo: “15 de Noviembre de 2012”
Da como salida: 2027 */

public class ejercicio8 {
    public static void main(String[] args) {
        String texto = "15 de Noviembre de 2012";
        int suma = 0;
        String numero = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= '0' && c <= '9') {
                numero += c;
            } else {
                if (!numero.equals("")) {
                    suma += Integer.parseInt(numero);
                    numero = "";
                }
            }
        }

        if (!numero.equals("")) {
            suma += Integer.parseInt(numero);
        }

        System.out.println(suma);
    }
}
