package Ejercicios1;

import java.util.Scanner;

/*Pedir un número entre 0 y 9.999, decir si es capicúa.*/

public class Basicos_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pon un numero para saber si es capicua(entre 0 y 9999): ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido =0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if(original == invertido){
            System.out.println("Es capicua");
        }else {
            System.out.println("No es capicua");
        }

        sc.close();

    }
}
