package Tema3.practica.SISnotas;

public class Alumno {

    //atributos
    private String nombre;
    private double nota;

    //constructor
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //metodo
    public double aprobar() {
        if (nota < 5) {
            nota = 5.0;
        }
        return nota;
    }

    static void imprimir(double nota, String nombre) {
        System.out.println(nombre + "tiene un " + nota);
    }

    public String toString() {
        return nombre + " tiene de nota " + nota;
    }
}
