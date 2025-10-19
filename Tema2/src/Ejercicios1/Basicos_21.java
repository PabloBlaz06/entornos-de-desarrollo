package Ejercicios1;

import java.util.Scanner;

/*Realiza un programa que permita la entrada de varios números y calcule su media*/

public class Basicos_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = -1;
        int contador = 0;
        double sumar = 0;

        while (numero != 0) {
            System.out.println("Introduce numeros (con 0 terminas): ");
            numero = sc.nextInt();
            sumar += numero;
            contador++;

        }
        if (contador >0){
            double media= sumar/contador;
            System.out.println("La media es: " +media);
        }

        sc.close();
    }
}
