package Tema2.src.Ejercicios4;

import java.util.Arrays;
import java.util.Random;

/* Realizar una funcion que indica si esta ordenado o no */
public class Arrayse0_2 {
    public static void main(String[] args) {

        int[] numeroAleatorio = new int[20];
        for (int i = 0; i < numeroAleatorio.length; i++) {
            Random r = new Random();
            r.nextInt(10);

            numeroAleatorio[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numeroAleatorio));

        boolean ordenado = true;
        for (int i = 0; i < numeroAleatorio.length; i++) {
            int elementoActual = numeroAleatorio[i];
            int elementoSiguiente = numeroAleatorio[i + 1];
            if (elementoSiguiente < elementoActual) {
                ordenado = false;
            }
        }

        System.out.println(ordenado ? "esta ordenado" : "esta desordenado");
    }

    private static boolean estaOrdenado(int[] nunmeroAleatorio) {
        boolean ordenado = true;
        return ordenado;
    }
}
