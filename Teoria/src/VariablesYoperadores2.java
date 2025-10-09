import java.util.Scanner;

public class VariablesYoperadores2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        //if encadenados
        if (edad >= 65) {
            System.out.println("Estas jubilado");
        } else if (edad >= 18) {
            System.out.println("Eres un trabajador");
        } else {
            System.out.println("Eres menor de edad");
        }

        //MAL !!!
        if (edad >= 18) {
            System.out.println("Eres un trabajador");
        } else if (edad >= 65) {
            System.out.println("Estas jubilado");
        } else {
            System.out.println("Eres menor de edad");
        }

        sc.close();

    }
}
