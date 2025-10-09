import java.util.Scanner;

public class Ejercicio3_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter = scanner.next().charAt(0);



        System.out.println("Tu letra es: " + (Character.isUpperCase(caracter)? "Mayuscula" : "No mayuscula" ));

        scanner.close();

    }
}
