package ejerciciosRepaso.ut2.ej213;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[30];
        double temp;
        int n =0;


        do{
            System.out.println("Introduce una temperatura: ");
            temp = sc.nextDouble();
            if (temp != 999) {
                temperaturas[n] = temp;
                n++;
            }

        }while(temp != 999 && n < 30);

        double media = calcularMedia(temperaturas, n);

        System.out.println("Introduce el umbral de temperatura para la racha: ");
        double umbral = sc.nextDouble();

        System.out.println("La media es: " + calcularMedia(temperaturas,n));
        System.out.println("Las temperaturas que superan la media son: " + cuantasSuperanMedia(temperaturas,n,media));
        System.out.println("La racha maxima es de: " + rachMaxCalor(temperaturas,n,umbral));

    }

    public static double calcularMedia(double[] temperaturas,int n){
        double suma = 0;
        double media;
        for (int i = 0; i < n; i++) {
            suma += temperaturas[i];
        }
        media = suma/n;
        return media;
    }

    public static int cuantasSuperanMedia(double[] temperaturas, int n, double media){
        int supera = 0;
        for (int i = 0; i < n; i++) {
            if(media < temperaturas[i]){
                supera++;
            }
        }
        return supera;
    }

    public static int rachMaxCalor(double[] temperaturas, int n, double umbral){
        int rachaActual = 0;
        int rachaMax = 0;
        int i = 0;

        while (i < n) {
            if (temperaturas[i] > umbral) {
                rachaActual++;
                if (rachaActual > rachaMax) {
                    rachaMax = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
            i++;
        }

        if (rachaMax > 5) {
            System.out.println("Alerta: ola de calor");
        }

        return rachaMax;
    }
}
