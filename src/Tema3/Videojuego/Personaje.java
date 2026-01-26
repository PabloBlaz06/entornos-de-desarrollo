package Tema3.Videojuego;

public class Personaje {

    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean esMagico;

    public Personaje(String nombre, boolean esMagico) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntosVida = 100;
        this.esMagico = false;
    }

    public int recibirDano(int dano){

        if (esMagico = true) {
            dano = (int) (dano * 0.8);
        }

        if (puntosVida <= 0){
            return 0;
        }
        return dano;
    }


    public void curar(){
        if (nivel < 5){
            puntosVida += 10;
        } else{
            puntosVida += 25;
        }

        if (puntosVida > 100) {
            puntosVida = 100;
        }
    }
}
