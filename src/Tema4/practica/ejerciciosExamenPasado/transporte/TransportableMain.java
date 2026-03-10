package Tema4.practica.ejerciciosExamenPasado.transporte;

public class TransportableMain {
    public static void main(String[] args) {

        VehiculoCamion camion = new VehiculoCamion("0250 ASG",0,100,2000);
        VehiculoAutobus autobus = new VehiculoAutobus("7005 HAR",0,100,20);
        Burro burro = new Burro("pepe",1);

        try {
            camion.viajar(35);
            System.out.println("Camion llego");
        } catch (Exception e) {
            System.out.println("Incidencia camion: " + e.getMessage());
        }

        try {
            autobus.viajar(35);
            System.out.println("Autobus llego");
        } catch (Exception e) {
            System.out.println("Incidencia autobus: " + e.getMessage());
        }

        try {
            burro.viajar(35);
            System.out.println("Burro llego");
        } catch (Exception e) {
            System.out.println("Incidencia burro: " + e.getMessage());
        }

        System.out.println(camion);
        System.out.println(autobus);
        System.out.println(burro);
    }
}
