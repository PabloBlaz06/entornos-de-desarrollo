package Tema2.src.Ejercicios3;

/*Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado. Para hacer el cifrado de un String,
se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c),
teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b. El proceso de descifrado es el contrario.
Los caracteres que no sean alfabéticos no registrarán ningún cambio.*/

import java.util.Scanner;

public class Funciones_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un texto: ");
        String textoOriginal = sc.nextLine();

        System.out.print("Elige una opción (1 = cifrar, 2 = descifrar): ");
        int opcion = sc.nextInt();

        sc.close();

        String textoFinal = cambiarTexto(textoOriginal, opcion);

        System.out.println("Resultado: " + textoFinal);
    }

    static String cambiarTexto(String texto, int tipoOperacion) {
        String textoTransformado = "";
        int desplazamiento;

        if (tipoOperacion == 1) {
            desplazamiento = 2;
        } else {
            desplazamiento = -2;
        }

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                letra = (char) ('a' + (letra - 'a' + desplazamiento + 26) % 26);
            }
            else if (letra >= 'A' && letra <= 'Z') {
                letra = (char) ('A' + (letra - 'A' + desplazamiento + 26) % 26);
            }
            textoTransformado += letra;
        }

        return textoTransformado;
    }
}
