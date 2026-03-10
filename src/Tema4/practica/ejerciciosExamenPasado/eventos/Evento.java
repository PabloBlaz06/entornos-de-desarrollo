package Tema4.practica.ejerciciosExamenPasado.eventos;

public abstract class Evento implements Accesible{

    private String nombre;
    private int capacidad;
    private int asistentes;

    public Evento(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.asistentes = 0;
    }

    public abstract double calcularPrecio();

    public void agregarAsistentes(int asistentes){
        if(asistentes >= capacidad) {
            throw new IllegalStateException("Error con los asistentes");
        }else {
            asistentes++;
        }
    }
}
