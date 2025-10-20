package Tema2.src.Teoria;

public class Ambitos {
    public static void main(String[] args) {

        int edad = 74;

        if (edad > 64) {
            float pension = calculameLaPension(edad);
            System.out.println("Y su pension es de " + pension);
            System.out.println(edad);
        }
    }

    static float calculameLaPension(int e) {
        e++;
        return e * 10;
    }
}
