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
        Random r = new Random();
        this.potenciaAtaque = r.nextInt(10, 21);
        this.blindaje = r.nextInt(0, 11);
    }

    public void mostrarEstadisticas() {

        System.out.println(nombre + " " + vida + " " + potenciaAtaque + " " + blindaje);

    }

    public void recibirDano(double cantidad) {
        double danoReal = cantidad - blindaje;

        if (danoReal <= 0) {
            System.out.println("No ha hecho daño");
        } else {
            vida = vida - danoReal;
            if (vida <= 0) {
                vida = 0;
            }
        }
    }

    public void atacar(Robot enemigo) {
        if (vida == 0) {
            System.out.println("El robot " + nombre + " está destruido y no puede atacar");
        } else if (enemigo.vida == 0) {
            System.out.println("El enemigo ya está vencido");
        } else {
            enemigo.recibirDano(potenciaAtaque);
        }
    }

    public boolean estaVivo(){
        if (vida > 0) {
            return true;
        }
        return false;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public void setPotenciaAtaque(double potenciaAtaque) {
        this.potenciaAtaque = potenciaAtaque;
    }

    public double getBlindaje() {
        return blindaje;
    }

    public void setBlindaje(double blindaje) {
        this.blindaje = blindaje;
    }
}
