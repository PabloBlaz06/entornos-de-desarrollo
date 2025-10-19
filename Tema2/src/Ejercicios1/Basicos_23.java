package Ejercicios1;

import java.util.Scanner;

/*Desarrolla un programa que lea números hasta que se den cinco ceros
y escriba después la suma de los números leídos.*/
public class Basicos_23 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int numero =0;
        int contador =0;
        int suma =0;

        System.out.println("Introduce numeros (el programa terminará cuando introduzcas 5 ceros): ");

        while (contador < 5){
            numero = sc.nextInt();
            suma +=numero;
        if (numero == 0){
            contador++;
        }}
        System.out.println("Laa suma de los numeros es: "+ suma);

        sc.close();
    }
}
