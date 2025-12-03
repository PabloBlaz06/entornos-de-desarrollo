package Tema2.src.Repaso;

import java.util.Arrays;

public class REpaso5 {
    public static void main(String[] args) {

        int[] numeros = {7, 4, 9};

        System.out.println(Arrays.toString(numeros));

       /* numeros[1] = 6;
        System.out.println(Arrays.toString(numeros));*/

        int[] temp = numeros;
        numeros = new int[4];
        System.out.println("Nuevo: " + Arrays.toString(temp));
        System.out.println("Original: " + Arrays.toString(numeros));

    }
}
