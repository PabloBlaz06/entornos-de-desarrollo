package Tema2.src.Ejercicios4;

import java.util.Arrays;
import java.util.Random;

/* Array de 20 elementos donde hay numeros enteros aleatoriamente */
public class Arrayse0 {
    public static void main(String[] args) {

        int[] numeroAleatorio = new int[20];
        for (int i = 0; i < numeroAleatorio.length; i++) {
            Random r = new Random();
            r.nextInt(10);

            numeroAleatorio[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numeroAleatorio));
    }
}
