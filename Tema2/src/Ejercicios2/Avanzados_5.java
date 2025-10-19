package Ejercicios2;

import java.util.Scanner;

/*Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura*/
public class Avanzados_5 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Ingresa un numero: ");
       int numero = sc.nextInt();

       for (int i = 1; i <= numero; i++) {

           for (int j = 1; j <= i; j++){
               System.out.print(j );
           }
           System.out.println();
       }

       sc.close();

    }
}
