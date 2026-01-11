package Tema2.src.Ejercicios5;

/* Realiza un programa que compruebe si en una palabra se repite alguna vocal más de 2 veces.
El programa pedirá que se teclee una palabra y comprobará las vocales que contiene,
cuando compruebe que una vocal aparece más de dos veces emitirá un mensaje en la pantalla y terminará.
El programa debe terminar en el mismo instante en que encuentre más de dos vocales iguales,
no esperará a comprobar toda la palabra (prohibido usar break).
Ejemplo: Escriba una palabra: “Instintivo”
Dará como resultado: “Tiene mas de dos vocales iguales” */

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese palabra: ");
        String palabra = sc.nextLine();

        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        boolean encontrado = false;

        for (int i = 0; i < palabra.length()  && !encontrado; i++) {
            char c = palabra.charAt(i);

            if (c == 'a'){
                contA++;
            } else if (c == 'e'){
                contE++;
            } else if (c == 'i'){
                contI++;
            } else if (c == 'o'){
                contO++;
            } else if (c == 'u'){
                contU++;
            }

            if (contA > 2 || contE > 2 || contI > 2 || contO > 2 || contU > 2){
                encontrado = true;
                System.out.println("Tiene mas de dos vocales iguales");
            }
        }
    }
}
