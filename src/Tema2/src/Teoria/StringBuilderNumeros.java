package Tema2.src.Teoria;

public class StringBuilderNumeros {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
            if (i < 10) sb.append("-");
        }
        System.out.println(sb.toString());
    }
}
