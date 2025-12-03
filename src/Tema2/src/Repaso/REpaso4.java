package Tema2.src.Repaso;

public class REpaso4 {
    public static void main(String[] args) {
        int[] notas = {4, 9, 7, 5, 10};

        int contador = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                contador++;
            }
        }
    }
}
