package Tema5.ejercicios.ListVideojuego;

import java.util.UUID;

public class VideoJuegos {
   private String titulo;
   private String plataforma;
   private String genero;
   private String precio;
   private int stock;
   private UUID codigo;

    public VideoJuegos(String titulo, String plataforma, String genero, String precio, int stock, UUID codigo) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "VideoJuegos{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", precio='" + precio + '\'' +
                ", stock=" + stock +
                ", codigo=" + codigo +
                '}';
    }
}
