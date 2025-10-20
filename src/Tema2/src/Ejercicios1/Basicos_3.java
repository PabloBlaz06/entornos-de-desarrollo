package Tema2.src.Ejercicios1;

/*Desarrolla un programa que, dado un número entre el 1 y el 7,
 indique el día de la semana del que se trata*/

import java.util.Scanner;

public class Basicos_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 7:");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println(numero + " es el Lunes");
        } else if (numero == 2) {
            System.out.println(numero + " es el Martes");
        } else if (numero == 3) {
            System.out.println(numero + " es el Miercoles");
        } else if (numero == 4) {
            System.out.println(numero + " es el Jueves");
        } else if (numero == 5) {
            System.out.println(numero + " es el Viernes");
        } else if (numero == 6) {
            System.out.println(numero + " es el Sabado");
        } else {
            System.out.println(numero + " es el Domingo");
        }
    }
}
