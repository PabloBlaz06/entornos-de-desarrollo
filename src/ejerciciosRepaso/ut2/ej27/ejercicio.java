package ejerciciosRepaso.ut2.ej27;

import java.util.Scanner;

public class ejercicio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, num;
        num = sc.nextInt();
        while ( num >= 0 ) { // HUECO 1
            suma += num;
            num = sc.nextInt();
            if ( num<0 ) break; // HUECO 2
        }
        System.out.println("Suma: " + suma);
    }
}
