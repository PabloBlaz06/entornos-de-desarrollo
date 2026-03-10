package Tema4.practica.HerenciaVehiculos;

public class moto extends vehiculosMotor {

    String tipo;

    public moto(String color, String modelo, double precio, String marca, int cilindrada, double combustible, String tipo) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.tipo = tipo;
    }
}
