package Tema2.src.Ejercicios4;

public class Arrayse1_8 {
    public static void main(String[] args) {

        int[] num1 = {15,8,1,24,17};
        int[] num2 = {16,14,7,5,23};
        int[] num3 = {22,20,13,6,4};
        int[] num4 = {3,21,19,12,10};
        int[] num5 =  {9,2,25,18,11};

        int [][] cuadro = {num1,num2,num3,num4,num5};

        int sumaMagica = 0;
        for (int j = 0; j < 5; j++) {
            sumaMagica += cuadro[0][j];
        }

        boolean esMagico = true;

        for (int i = 1; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += cuadro[i][j];
            }
            if (sumaFila != sumaMagica) {
                esMagico = false;
            }
        }

        for (int j = 0; j < 5; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 5; i++) {
                sumaCol += cuadro[i][j];
            }
            if (sumaCol != sumaMagica) {
                esMagico = false;
            }
        }

        int sumaDiag1 = 0;
        for (int i = 0; i < 5; i++) {
            sumaDiag1 += cuadro[i][i];
        }
        if (sumaDiag1 != sumaMagica) {
            esMagico = false;
        }

        int sumaDiag2 = 0;
        for (int i = 0; i < 5; i++) {
            sumaDiag2 += cuadro[i][4 - i];
        }
        if (sumaDiag2 != sumaMagica) {
            esMagico = false;
        }

        if (esMagico) {
            System.out.println("ES un cuadro mágico");
        } else {
            System.out.println("NO es un cuadro mágico");
        }
    }
}


