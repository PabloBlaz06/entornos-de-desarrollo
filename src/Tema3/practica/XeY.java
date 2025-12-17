package Tema3.practica;

/* Defina una clase punto que tendrá dos atributos, de tipo real, x e y,
 que representarán las coordenadas del punto dentro del plano.
Defina un metodo que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos.
Para probar esta funcionalidad, escriba un metodo main en el que se creen dos puntos,
el primero de los cuales deberá tener las coordenadas (100, 200) y el segundo deberá tener las coordenadas (400, 800)
 y calcule e imprima la distancia entre ambos.*/

public class XeY {

    private double x;
    private double y;

    public XeY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Punto (" + x + "," + y + ")";
    }

    /*Forma1
    public double mitad(XeY puntoA, XeY puntoB) {
        double distancia = Math.sqrt(Math.pow(puntoA.x - puntoB.x, 2) + Math.pow(puntoA.y - puntoB.y, 2));
        return distancia;
    }*/
    public double mitad(XeY otroPunto) {
        double distancia = Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2));
        return distancia;

    }

}
