package Tema4.practica.ejerciciosExamenPasado.cine;

public class Sesion {
    private Pelicula pelicula;
    private String horaInicio;
    private int entradasDisponibles;

    public Sesion(Pelicula pelicula, String horaInicio, int entradasDisponibles) {
        this.pelicula = pelicula;
        this.horaInicio = horaInicio;
        this.entradasDisponibles = entradasDisponibles;
    }

    public void reservar(int cantidad) throws Exception {
        if (entradasDisponibles < cantidad) {
            throw new Exception("No hay entradas disponibles para reservar");
        }else{
            entradasDisponibles = entradasDisponibles - cantidad;
        }
    }

    @Override
    public String toString() {
        return pelicula.getTitulo() + horaInicio + entradasDisponibles ;
    }
}
