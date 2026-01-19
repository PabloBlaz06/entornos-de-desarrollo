package Tema3.BatallaDeRobots;

import java.util.Random;

public class Robot {

    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;

    public Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100.0;
    }

    public Robot() {
        Random r = new Random();
        this.potenciaAtaque = r.nextInt(10, 21);
        this.blindaje = r.nextInt(0, 11);
    }

    public void mostrarEstadisticas() {

        System.out.println(nombre + " " + vida + " " + potenciaAtaque + " " + blindaje);

    }

    public void recibirDano(double cantidad) {
        double danoReal  = cantidad - blindaje;

        if (danoReal <= 0 ){
            System.out.println("No ha hecho daño");
        } else {
             vida = vida - danoReal;
            if (vida <= 0){
                vida = 0;
            }
        }
    }

    public void atacar( Robot enemigo){
        if ()


    }
}
