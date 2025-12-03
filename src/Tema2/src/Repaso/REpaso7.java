package Tema2.src.Repaso;

public class REpaso7 {
    public static void main(String[] args) {

        int[][] notas = new int[2][3];

        notas[0][0] = 5;
        notas[0][1] = 9;
        notas[0][2] = 4;

        notas[1][0] = 6;
        notas[1][1] = 2;
        notas[1][2] = 3;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("notas [" + i + "][" + j + "]");
            }
        }
    }
}
