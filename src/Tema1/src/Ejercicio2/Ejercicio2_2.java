package Tema1.src.Ejercicio2;

public class Ejercicio2_2 {
    public static void main(String[] args) {

        int C = 2;

        System.out.println("C es par o impar: " + C + (C % 2 == 0 ? " par" : " impar"));

        System.out.println("C es positivo o negativo: " + C + (C >= 0 ? " positivo" : " negativo"));

        System.out.println("C es par o impar: " + C + (C % 5 == 0 ? " multiplo de 5" : " no es multiplo de 5"));

        System.out.println("C es par o impar: " + C + (C % 10 == 0 ? " multiplo de 10" : " no es multiplo de 10"));

        System.out.println("C es par o impar: " + C + (C >= 100 ? " mayor de 100" : " menor de 100"));


    }
}
