package Tema3.practica.Bibloteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Miguel de Cervantes", "Española");

        Libro libro1 = new Libro("Don Quijote", autor1);

        libro1.prestar();
        libro1.prestar();

        libro1.informacion();

    }
}
