package Tema4.practica.ejerciciosExamenPasado.transporte;

public class Burro implements Transportable{

    private String nombre;
    private double energiaRestante;
    private double carga;

    public Burro(String nombre, double carga) {
        this.nombre = nombre;
        this.energiaRestante = 100;
        this.carga = carga;
    }

    public void descansar(){
        energiaRestante = 100;
    }

    @Override
    public void viajar(double distancia) throws Exception {
        double consumo = distancia * 3;

        if (consumo > energiaRestante){
            throw new Exception("El burro no tiene energía");
        }

        energiaRestante = energiaRestante - consumo;
    }

    @Override
    public String toString() {
        return "Burro{" +
                "nombre='" + nombre + '\'' +
                ", energiaRestante=" + energiaRestante +
                ", carga=" + carga +
                '}';
    }
}
