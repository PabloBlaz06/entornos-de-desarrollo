package Tema4.practica.HerenciaVehiculos;

public class vehiculosMotor extends vehiculos {
    int cilindrada;
    double combustible;

    public vehiculosMotor(String color, String modelo, double precio, String marca, int cilindrada, double combustible) {
        super(color, modelo, precio, marca);
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }
}
