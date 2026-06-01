package ejerciciosRepaso.ejFigura;

public class Operadors {
    static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = ++a + b--;
        int d = a-- + --b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
