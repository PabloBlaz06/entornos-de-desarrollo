package Tema2.src.Teoria;

public class REPASO4 {
    public static void main(String[] args) {

        int niveles = 6;
        int[] fibo = new int[niveles];

        fibo[0] = 1;
        if (niveles > 1) {
            fibo[1] = 1;
        }

        for (int i = 2; i < niveles; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i = 1; i <= niveles; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(fibo[j] + " ");
            }

            System.out.println();
        }
    }
}
