package Tema5.ejercicios.primerosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        Random random = new Random();
        int resultado = 0;
        int mayor = 0;

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(1, 50));
        }
        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            int sumando = numeros.get(i);
            resultado += sumando;
        }
        System.out.println(resultado);

        for (int i = 0; i < numeros.size(); i++) {
            if (mayor < numeros.get(i)) {
                mayor = numeros.get(i);
            }
        }
        System.out.println(mayor);
    }
}
