package Tema2.src.Teoria;

import java.util.Scanner;

public class REPASO3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una altura: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int troncoAltura = altura / 5;

        if (troncoAltura < 1) {
            troncoAltura = 1;
        }

        int anchoMaximo = 2 * altura - 1;
        int espaciosAntesTronco = (anchoMaximo / 2);

        for (int i = 0; i < troncoAltura; i++) {
            for (int j = 0; j < espaciosAntesTronco; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        sc.close();
    }
}
