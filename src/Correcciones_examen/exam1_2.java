package Correcciones_examen;

public class exam1_2 {
    public static void main(String[] args) {
        suma();
    }

    public static void suma() {
        int resultado = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 26 == 0) {
                resultado = resultado + i;
            }
        }
        System.out.println("La suma total es: " + resultado);
    }
}
