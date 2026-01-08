package Tema2.src.Ejercicios5;

/*Implementa un programa que intercale las letras de dos palabras.
El programa debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las dos palabras intercaladas.
Introduciendo:               Primera palabra “INTERNET”
Segunda palabra “correo”
Da como salida: “IcNoTrErReNoET” */

public class ejercicio14 {
    public static void main(String[] args) {

        String cadena1 = "INTERNET";
        String cadena2 = "correo";

        StringBuilder resultado = new StringBuilder();

        for (int i = 0 ; i < cadena1.length() ; i++) {
            resultado.append(cadena1.charAt(i));
            if( i < cadena2.length() ){
                resultado.append(cadena2.charAt(i));
            }
        }
        System.out.println(resultado);
    }
}
