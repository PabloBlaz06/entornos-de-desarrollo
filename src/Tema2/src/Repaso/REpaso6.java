package Tema2.src.Repaso;

import java.util.Arrays;

public class REpaso6 {
    public static void main(String[] args) {
        int[] c = {1, 2, 3};
        int[] d = {1, 2, 3};

        System.out.println("== " + (c == d));
        System.out.println("equals " + c.equals(d));
        System.out.println(Arrays.equals(c, d));
    }
}
