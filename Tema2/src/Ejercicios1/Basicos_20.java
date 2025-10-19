import java.util.Scanner;

public class Basicos_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero entero: ");
        int numero = sc.nextInt();

        for(int i = numero; i < numero + 100; ++i) {
            numero += i;
            System.out.println("Sumamos " + i);
        }

        System.out.println("El total es " + numero);
        sc.close();
    }
}
