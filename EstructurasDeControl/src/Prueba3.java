import java.util.Scanner;

public class Prueba3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero != 0) {
            System.out.println("introduce un numero y te doy el doble: ");
            numero = sc.nextInt();
            System.out.println("El doble de " + numero + " es " + numero * 2);
        }
    }
}
