package Tema2.src.Ejercicios4;

public class Arrayse1_9 {
    public static void main(String[] args) {

        int[] a = {4,8,15,22,25,40};
        int[] b = {3,6,18,21,25,47};

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Array c ordenado:");
        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }


    }
}
