import java.util.Scanner;

/*Escribir un programa en Java que lea un número entero desde teclado y
 realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla.*/

public class ejercicio1_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un numero entero: ");
        int numero = sc.nextInt();

        for (int i = numero; i < numero + 100; i++) {
            suma += i;
            System.out.println("Sumamos " + i);
        }

        System.out.println("El total es " + suma);
        sc.close();
    }
}
