package Tema4.practica.herenciaSencilla;

public class FiguraTriangulo extends Figura {
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;


    public FiguraTriangulo(String color, double area, double perimetro, double base, double altura, double lado1, double lado2, double lado3) {
        super(color, area, perimetro);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    double calcularArea() {
        return (base * altura) / 2;
    }

    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}