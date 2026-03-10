package Tema4.practica.HerenciaVehiculos;

public class patinete extends vehiculoSinMotor {
    int ruedas;

    public patinete(String color, String modelo, double precio, String marca, String material, int ruedas) {
        super(color, modelo, precio, marca, material);
        this.ruedas = ruedas;
    }
}