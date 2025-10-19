package Teoria;

public class Pruebas2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("hola");
        }

        //for sabemos cuantas veces
        //while no sabemos
        //for while almenos una vez

        int numero = 1;
        while (numero < 5) {
            System.out.println(numero);
            numero++;
        }

        for (int i = 10; i > 1; i--) {
            System.out.println(i);
        }

        for (int i = 10; i % 2 == 0; i--) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i -= 2) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
