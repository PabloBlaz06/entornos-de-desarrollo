package Tema4.practica.ejerciciosExamenPasado.transporte;

public class VehiculoAutobus extends Vehiculo {

    private int pasajerosActuales;
    private double capacidadMaxima;

    public VehiculoAutobus(String matricula, double kmRecorridos, double combustibleRestante, int pasajerosActuales) {
        super(matricula, kmRecorridos, combustibleRestante);
        this.pasajerosActuales = pasajerosActuales;
        this.capacidadMaxima = 50;
    }

    @Override
    public void viajar(double distancia) throws Exception {
        double consumo = distancia * (0.08 + 0.005 * pasajerosActuales);

        if (getCombustibleRestante() <= 0){
            throw new Exception("Sin combustible");
        }

        setCombustibleRestante(getCombustibleRestante() - consumo);
        setKmRecorridos(getKmRecorridos() + distancia);

    }

    @Override
    public String toString() {
        return getMatricula() + getKmRecorridos() + getCombustibleRestante()+ pasajerosActuales + capacidadMaxima;
    }
}
