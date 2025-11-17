package Tema2.src.Ejercicios4;

import java.util.Arrays;

public class Arrayse1_4 {
    public static void main(String[] args) {

        int[] original = {34, 54, 12, 85, 45};
        int[] indice = {0, 1, 2, 3, 4};

        for (int i = 0; i < indice.length - 1; i++) {
            for (int j = 0; j < indice.length - 1; j++) {

                if (original[indice[j]] < original[indice[j + 1]]) {

                    int auxiliar = indice[j];
                    indice[j] = indice[j + 1];
                    indice[j + 1] = auxiliar;
                }
            }
        }

        System.out.println(Arrays.toString(indice));

    }

}
