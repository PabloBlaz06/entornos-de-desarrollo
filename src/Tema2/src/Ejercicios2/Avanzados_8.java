package Tema2.src.Ejercicios2;

/*Muestra los números primos entre 1 y 100*/


public class Avanzados_8 {
    public static void main(String[] args) {

        System.out.println("Numeros primos entre 1 y 100:");

        for (int i = 2; i <= 100; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if(primo) {
                System.out.println(i);
            }
        }
    }
}
