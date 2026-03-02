package Tema4.src.practica.ejerciciosExamenPasado.transporte;

public class VehiculoCamion extends Vehiculo {

    private double cargaActual;
    private double capacidadMaxima;

    public VehiculoCamion(String matricula, double kmRecorridos, double combustibleRestante, double cargaActual) {
        super(matricula, kmRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }

    @Override
    public void viajar(double distancia) throws Exception {
        double consumo = distancia * (0.1 + 0.01 * (cargaActual / 1000));
        setCombustibleRestante(getCombustibleRestante() - consumo);
        setKmRecorridos(getKmRecorridos() + distancia);

        if (getCombustibleRestante() <= 0){
            throw new Exception("Sin combustible");
        }
    }

    @Override
    public String toString() {
        return getMatricula() + getKmRecorridos() + getCombustibleRestante() + cargaActual + capacidadMaxima;
    }
}

