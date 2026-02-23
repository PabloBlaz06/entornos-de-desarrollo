package Tema4.src.practica.ej1excepciones;

public class CalculadorSimple {

    private double dividendo;
    private double divisor;

    public void dividir(double dividendo, double divisor) {

        try {
            double division = dividendo / divisor;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

    }
}
