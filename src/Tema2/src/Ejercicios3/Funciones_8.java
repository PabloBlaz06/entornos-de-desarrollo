package Tema2.src.Ejercicios3;

public class Funciones_8 {
    public static void main(String[] args) {
        String cadena = "holaz";
        System.out.println("La cadena es: " + cadena);

        // cifrar
        String cadenaCifrada = cifrar(cadena);
        System.out.println("La cadena cifrada sería: " + cadenaCifrada);
        // descifrar
        String cadenaDescifrada = descifrar(cadenaCifrada);
        System.out.println("La cadena descifrada sería: " + cadenaDescifrada);

    }

    static String cifrar(String cadena) {
        String cadenaCifrada = "";
        // Pasamos por todos los caracteres, y los vamos cifrando uno a uno
        for (int i = 0; i < cadena.length(); i++) {
            // Ciframos el caracter actual
            char caracter = cadena.charAt(i);
            if (caracter != 'y' && caracter != 'z') {
                char caracterCifrado = (char) (caracter + 2);
                // Lo metemos en la cadena cifrada
                cadenaCifrada = cadenaCifrada + caracterCifrado;
            } else if (caracter == 'y') {
                cadenaCifrada = cadenaCifrada + 'a';
            } else if (caracter == 'z') {
                cadenaCifrada = cadenaCifrada + 'b';
            }
        }
        return cadenaCifrada;
    }

    static String descifrar(String cadena) {
        String cadenaDescifrada = "";
        // Pasamos por todos los caracteres, y los vamos cifrando uno a uno
        for (int i = 0; i < cadena.length(); i++) {
            // Ciframos el caracter actual
            char caracter = cadena.charAt(i);
            if (caracter != 'a' && caracter != 'b') {
                char caracterDescifrado = (char) (caracter - 2);
                // Lo metemos en la cadena cifrada
                cadenaDescifrada = cadenaDescifrada + caracterDescifrado;
            } else if (caracter == 'a') {
                cadenaDescifrada = cadenaDescifrada + 'y';
            } else if (caracter == 'b') {
                cadenaDescifrada = cadenaDescifrada + 'z';
            }
        }
        return cadenaDescifrada;
    }
}
