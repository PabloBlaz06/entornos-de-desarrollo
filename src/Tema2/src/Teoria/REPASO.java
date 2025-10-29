package Tema2.src.Teoria;

import java.util.Scanner;

public class REPASO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base");
        int base = sc.nextInt();

        System.out.println("Introduce la altura");
        int altura = sc.nextInt();

        double area = CalcularAreaTriangulo(base, altura);
        System.out.println("El area seria de " + area);

        sc.close();
    }

    static double CalcularAreaTriangulo(int base, int altura) {
        return base * altura / 2d;
    }
}
