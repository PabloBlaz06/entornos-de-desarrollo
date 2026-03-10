package Tema4.practica.HerenciaVehiculos;

public class coche extends vehiculosMotor {

    int puertas;

    public coche(String color, String modelo, double precio, String marca, int cilindrada, double combustible, int puertas) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.puertas = puertas;
    }
}
