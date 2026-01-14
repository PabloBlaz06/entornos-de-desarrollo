package Tema3.practica.AvilaExpress;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    public int getCombustible() {
        return combustible;
    }

    public NaveEspacial(double capacidadCarga, String nombre) {
        this.combustible = 100;
        this.capacidadCarga = capacidadCarga;
        this.nombre = nombre;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this(6, nombre);
    }

    void viajar(int distancia) {
        if (distancia * 2 <= combustible) {
            combustible = combustible - (distancia * 2);
            enMision = true;
        } else {
            System.out.println("Combustible insuficiente para la misión");
        }
    }

    void repostar() {
        combustible = 100;
        enMision = false;
    }

    void mostrarEstado() {
        System.out.println(nombre + " " + combustible + " " + capacidadCarga + " " + enMision);
    }
}
