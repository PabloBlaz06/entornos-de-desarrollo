package Tema5.ejercicios.videoclub;

public class Pelicula {

    private int codigo;
    private String titulo;

    public Pelicula(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
