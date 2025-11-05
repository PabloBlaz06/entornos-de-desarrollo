package Tema2.src.Ejercicios3;

public class Funciones_8 {
    public static void main(String[] args) {
        String texto = "hola";

        String cifrado = cifrar(texto);
        System.out.println("Cifrado: " + cifrado);

        String descifrado = descifrar(cifrado);
        System.out.println("Descifrado: " + descifrado);
    }

    static String cifrar(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 2) % 26);
            }

            resultado += c;
        }
        return resultado;
    }

    static String descifrar(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' - 2 + 26) % 26);
            }

            resultado += c;
        }
        return resultado;
    }
}
