package Tema2.src.Ejercicios4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrayse1_5 {
    public static void main(String[] args) {

        int[] numeroAleatorio = new int[50];
        for (int i = 0; i < numeroAleatorio.length; i++) {
            Random r = new Random();
            r.nextInt(100);

            numeroAleatorio[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(numeroAleatorio));

        for (int i = 1; i <= 100; i++) {
            int contador = 0;   // cuenta cuántas veces aparece i

            // contamos cuántas veces aparece i en el array
            for (int j = 0; j < numeroAleatorio.length; j++) {
                if (numeroAleatorio[j] == i) {
                    contador++;
                }
            }

            // si contador sigue en 0, es que NO aparece
            if (contador == 0) {
                System.out.println(i);
            }
        }

    }
}
