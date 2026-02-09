package Tema4.src.practica.herenciaSencilla;

public class FiguraCirculo extends Figura {
    double radio;

    public FiguraCirculo(String color, double area, double perimetro, double radio) {
        super(color, area, perimetro);
        this.radio = radio;
    }

    double calcularArea() {
        return 3.14 * radio * radio;
    }

    double calcularPerimetro() {
        return 2 * 3.14 * radio;
    }
}
