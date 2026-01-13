package Tema3.practica.Bibloteca;

public class Autor {

    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    String mostrarAutor() {
        return nombre + "(" + nacionalidad + ")";
    }
}
