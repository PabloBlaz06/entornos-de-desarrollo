package Tema3.practica.Bibloteca;

public class Libro {

    private String titulo;
    private Autor escritor;
    private boolean prestado;

    public Libro(String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
    }

    void prestar() {
        if (prestado == false) {
            prestado = true;
            System.out.println("Has alquilado" + titulo);
        } else {
            System.out.println("error no esta disponible" + titulo);
        }
    }

    void devolver() {
        prestado = false;
    }

    void informacion() {
        System.out.println(titulo + "escrito por " + escritor.mostrarAutor());
    }
}
