package Tema4.src.practica.herenciaSencilla;

public class FiguraCuadrado extends Figura {
    double lado;

    public FiguraCuadrado(String color, double area, double perimetro, double lado) {
        super(color, area, perimetro);
        this.lado = lado;
    }

    double calcularArea() {
        return 4 * lado;
    }

    double calcularPerimetro() {
        return lado * lado;
    }
}
