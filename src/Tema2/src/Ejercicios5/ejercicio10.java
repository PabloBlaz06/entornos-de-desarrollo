package Tema2.src.Ejercicios5;

/*Desarrolla un programa que simule el juego del ahorcado. Elegimos una palabra y vamos pidiendo letras al usuario.
Cada vez mostramos la palabra solo con las letras acertadas.
Si no acierta todas las letras en 8 intentos, se da el juego por perdido. */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        String palabra = "tortuga";
        String progreso = "_______";
        int intentos = 8;

        Scanner sc = new Scanner(System.in);

        while (intentos > 0 && !progreso.equals(palabra)) {

            System.out.println("Palabra: " + progreso);
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Introduce una letra: ");
            String letra = sc.nextLine();

            boolean acierto = false;
            String nuevoProgreso = "";

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra.charAt(0)) {
                    nuevoProgreso += letra;
                    acierto = true;
                } else {
                    nuevoProgreso += progreso.charAt(i);
                }
            }

            progreso = nuevoProgreso;

            if (!acierto) {
                intentos--;
            }
        }

        if (progreso.equals(palabra)) {
            System.out.println("¡Has ganado! La palabra era: " + palabra);
        } else {
            System.out.println("Has perdido. La palabra era: " + palabra);
        }

        sc.close();
    }
}
