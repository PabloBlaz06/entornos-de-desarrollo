package Tema2.src.Ejercicios1;

import java.util.Scanner;

/*Calcular el mayor de tres números enteros en Java*/

public class Basicos_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero1 = sc.nextInt();

        System.out.println("Introduce otro numero entero: ");
        int numero2 = sc.nextInt();

        System.out.println("Introduce un ultimo numero entero: ");
        int numero3 = sc.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor es el primer numero");
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El mayor es el segundo numero");
        } else {
            System.out.println("El mayor es el tercer numero");
        }
    }
}
