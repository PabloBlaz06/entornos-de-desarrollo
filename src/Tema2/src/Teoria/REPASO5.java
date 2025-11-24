package Tema2.src.Teoria;

import java.util.Scanner;
import java.util.Random;

public class REPASO5 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pedimos dimensiones
        System.out.print("Introduce número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Introduce número de columnas: ");
        int columnas = sc.nextInt();

        // Creamos matriz original
        int[][] matriz = new int[filas][columnas];

        // La rellenamos con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }

        // Mostramos la matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Creamos la matriz transpuesta
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostramos la transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
