package ejerciciosRepaso.ut2.ej211;

import java.util.Scanner;

public class ejercicio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n =  sc.nextInt();

        if(esPrimo(n) == true){
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }

        System.out.println("Introduce hasta donde comprobar los primos: ");
        int hasta = sc.nextInt();
        imprimirPrimos(hasta);

        System.out.println("Introduce el principio del rango");
        int desde = sc.nextInt();

        System.out.println("Introduce el final del rango");
        hasta = sc.nextInt();

        int total = contarPrimos(desde, hasta);
        System.out.println("Hay " + total + " primos entre " + desde + " y " + hasta);
    }

    public static boolean esPrimo(int n){
        if (n <2){
            return false;
        }else{
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void imprimirPrimos(int hasta){
        System.out.print("Primos hasta " + hasta + ": ");

        for(int i = 2; i < hasta; i++){
            if(esPrimo(i)){
                System.out.println(i + " ");
            }
        }

        System.out.println();
    }

    public static int contarPrimos(int hasta,int desde){
        int contador = 0;

        for(int i = desde; i <=hasta; i++){
            if(esPrimo(i)){
                contador++;
            }
        }
        return contador;
    }
}
