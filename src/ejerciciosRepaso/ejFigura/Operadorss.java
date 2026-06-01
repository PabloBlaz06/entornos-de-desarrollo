package ejerciciosRepaso.ejFigura;

public class Operadorss {
    static void main(String[] args) {
        int x = 0;
        int y = 5;
        boolean r = (x++ != 0) && (y++ > 3);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("r: " + r);

        boolean s = (x++ == 1) || (y++ < 10);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("s: " + s);
    }
}
