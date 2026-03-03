package Tema5.ejercicios.primerosList;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static void main(String[] args) {
        int[] notasArray = {4, 9, 7, 5, 10};
        List<Integer> notaAlumn = new ArrayList<>();

        for (int i = 0; i < notasArray.length; i++) {
            notaAlumn.add(notasArray[i]);
        }

        for (Integer numero : notaAlumn) {
            String numeroString = numero.toString();
            System.out.println(numeroString);
        }
    }
}
