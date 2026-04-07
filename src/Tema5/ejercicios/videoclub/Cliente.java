package Tema5.ejercicios.videoclub;

import java.util.Random;

public class Cliente {
    private int numeroCarnet;
    private String nombre;

    public Cliente(int numeroCarnet, String nombre) {
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
