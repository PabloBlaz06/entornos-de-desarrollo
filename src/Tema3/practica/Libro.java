package Tema3.practica;

public class Libro {


    private String titulo;
    private String Autor;
    private int AnioPublicacion;
    private String editorial;
    private String isbn;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public Libro(String titulo, String Autor, int AnioPublicacion, String editorial, String isbn) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.AnioPublicacion = AnioPublicacion;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //@Override
    public String toSrting() {
        String comprobarAutor = Autor != null ? Autor : "sin autor";
        return titulo + "(" + isbn + ")" + comprobarAutor;
    }

}
