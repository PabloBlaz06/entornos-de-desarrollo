package Tema4.src.practica.HerenciaVehiculos;

public class vehiculoSinMotor extends vehiculos {
    String material;

    public vehiculoSinMotor(String color, String modelo, double precio, String marca, String material) {
        super(color, modelo, precio, marca);
        this.material = material;
    }
}
