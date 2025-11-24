package Tema2.src.Ejercicios4;

public class Arrayse1_9 {
    public static void main(String[] args) {

        int[] arr1 = {4,8,15,22,25,40};
        int[] arr2 = {3,6,18,21,25,47};

        int[] arrOrdenado = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arrOrdenado[k] = arr1[i];
                i++;
            } else {
                arrOrdenado[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            arrOrdenado[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            arrOrdenado[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Array ordenado:");
        for (int x = 0; x < arrOrdenado.length; x++) {
            System.out.print(arrOrdenado[x] + " ");
        }


    }
}
