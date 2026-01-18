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
        if ( largo > 0) {
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public int area(){
        return (ancho * largo);
    }

    public int perimetro() {
        return 2 * (ancho + largo);
    }

    public String horizontalVertical (){
        if (largo > ancho){
            return "horizontal";
        } else {
            return "vertical";
        }
    }

    public void mostrarDimensiones(){
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
    }

    public void rectangulo() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
