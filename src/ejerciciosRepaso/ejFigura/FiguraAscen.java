package ejerciciosRepaso.ejFigura;

import java.util.Scanner;

public class FiguraAscen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();

        // Parte ascendente (de 1 a N)
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Parte descendente (de N-1 a 1)
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
