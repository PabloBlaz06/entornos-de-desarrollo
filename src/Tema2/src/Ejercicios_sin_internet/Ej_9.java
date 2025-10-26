package Tema2.src.Ejercicios_sin_internet;

/*Crea un metodo llamado operacion que reciba dos números y un código de operación
 (1 para suma, 2 para resta, 3 para multiplicación, 4 para división).
 Según el código, el metodo debe realizar la operación indicada y mostrar el resultado*/

import java.util.Scanner;

public class Ej_9 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        int numero2 = sc.nextInt();

        System.out.println("Introduce un codigo de operacion (1 para suma, 2 para resta, 3 para multiplicación, 4 para división): ");
        int codigo  = sc.nextInt();

        sc.close();

        operacion(numero1,numero2,codigo);
    }

    static void operacion(int numero1, int numero2, int codigo) {
        if (codigo == 1){
            System.out.println("EL resultado es: " + (numero1+numero2) );
        } else if (codigo == 2){
            System.out.println("EL resultado es: " + (numero1-numero2) );
        } else if (codigo == 3){
            System.out.println("EL resultado es: " + (numero1*numero2) );
        } else {
            System.out.println("EL resultado es: " + (numero1/numero2) );
        }
    }
}
