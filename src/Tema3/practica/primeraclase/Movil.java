package Tema3.practica.primeraclase;

public class Movil {

    //atributos
    private String marca;
    private int bateria;
    private boolean estaBloqueado;

    //metodo
    static void llamar() {
        System.out.println("Llamando...");
    }

    //constructor q recibe marca y bateria

    public Movil(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    // constructor por defecto

    /* public Movil() {this.marca = "generico";this.bateria = 100;}*/

    public Movil() {
        this("generico", 100);
    }
}
