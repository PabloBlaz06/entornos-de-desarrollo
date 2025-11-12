package Tema2.src.Ejercicios4;

import java.util.Arrays;

public class Arrayse0_4 {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

        int[][] numeros = {num1, num2};
        System.out.println("Vamos a imprimir el array de arrays");
        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }
    }
}
