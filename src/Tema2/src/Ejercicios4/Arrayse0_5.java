package Tema2.src.Ejercicios4;

import java.util.Arrays;

public class Arrayse0_5 {
    public static void main(String[] args) {

        int[][] numeros = new int[2][3];
        int k = 1;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = k++;
            }
        }

        for (int[] num : numeros) {
            System.out.println(Arrays.toString(num));
        }
    }

}

