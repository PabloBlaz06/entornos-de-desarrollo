package Tema4.src.practica.HerenciaVehiculos;

public class bicicleta extends vehiculoSinMotor {

    int marchas;

    public bicicleta(String color, String modelo, double precio, String marca, String material, int marchas) {
        super(color, modelo, precio, marca, material);
        this.marchas = marchas;
    }
}
