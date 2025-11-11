package Tema2.src.Ejercicios4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Array que pida un numnero y diga cuantas veces aparece el numero en el array */
public class Arrayse0_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        int contador = 0;
        int[] numeroAleatorio = new int[20];

        for (int i = 0; i < numeroAleatorio.length; i++) {
            Random r = new Random();
            r.nextInt(10);

            numeroAleatorio[i] = r.nextInt(10);

            if (numeroAleatorio[i] == numero) {
                contador = contador + 1;
            }
        }

        System.out.println(Arrays.toString(numeroAleatorio));
        System.out.println("El numero se repite: " + contador);

        sc.close();
    }
}
