package Tema4.src.practica.ejPrueba;

public class Divide {
    public static void main(String[] args) {
        try {
            double resultado = dividir(3, 0);
            System.out.println(resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Ha habido un error: " + e.getMessage());
        }
    }

    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }


}
