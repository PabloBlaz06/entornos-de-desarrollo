package Tema2.src.Teoria;

import java.util.Arrays;

public class PruebaArrays {

    public static void main(String[] args) {

        int notaPrimerExamenPABLO = 7;
        int notaSegundoExamenPABLO = 6;

        //letras raras
        /*int[] notasPablo = new int[5];
        System.out.println(notasPablo);*/

        int[] notasPablo = new int[3];
        notasPablo[0] = 7;
        notasPablo[1] = 6;
        notasPablo[2] = 5;
        System.out.println(Arrays.toString(notasPablo));

        int[] notasPabloAuxiliares = notasPablo;
        notasPablo = new int[4];

        for (int i = 0; i < notasPabloAuxiliares.length; i++) {
            notasPablo[i] = notasPabloAuxiliares[i];
        }
        notasPablo[3] = 8;
        System.out.println("notas de pablo :: " + Arrays.toString(notasPablo));
        System.out.println("notas de pablo auxiliares :: " + Arrays.toString(notasPabloAuxiliares));

        int[] otra = notasPablo;
        otra[3] = 1;
        System.out.println("otra ::" + Arrays.toString(otra));
        System.out.println("notas de pablo :: " + Arrays.toString(notasPablo));

        int[] masNotas = {4, 6, 5, 8};

    }
}
