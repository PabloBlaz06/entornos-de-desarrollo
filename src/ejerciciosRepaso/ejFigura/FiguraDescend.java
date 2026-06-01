package ejerciciosRepaso.ejFigura;

import java.util.Scanner;

public class FiguraDescend {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <=num ; i++) {
            for (int j = num; j >= num - i +1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = num -1; i >= 1; i--){
            for(int j = num; j > num -i ; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
