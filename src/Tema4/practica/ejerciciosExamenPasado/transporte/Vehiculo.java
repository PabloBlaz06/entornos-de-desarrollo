package Tema4.practica.ejerciciosExamenPasado.transporte;

public abstract class Vehiculo implements Transportable {
    private String matricula;
    private double kmRecorridos;
    private double combustibleRestante;

    public Vehiculo(String matricula, double kmRecorridos, double combustibleRestante) {
        this.matricula = matricula;
        this.kmRecorridos = kmRecorridos;
        this.combustibleRestante = combustibleRestante;
    }

    public abstract void viajar(double distancia) throws Exception;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    public void setCombustibleRestante(double combustibleRestante) {
        this.combustibleRestante = combustibleRestante;
    }
}
