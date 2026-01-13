package Tema3.rectangulo;

public class Rectangulo {

    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo) {
        if(ancho > 0 && largo > 0){
            this.ancho = ancho;
            this.largo = largo;
        } else{
            this.ancho = 3;
            this.largo = 12;
        }
    }

    public Rectangulo() {
        ancho = 3;
        largo = 12;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
}
