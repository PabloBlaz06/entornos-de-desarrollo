package Tema4.src.herenciaRestaurante;

public class comanda {
    private int numeroMesa;
    private int numeroPersonas;
    private plato[] platos;

    public comanda(int numeroMesa, int numeroPersonas, plato[] platos) {
        this.numeroMesa = numeroMesa;
        this.numeroPersonas = numeroPersonas;
        this.platos = new plato[20];
    }

    @Override
    public String toString() {

        String todosPlatos = "";

        for (int i = 0; i < platos.length; i++) {
            if (platos[i] != null) {
                todosPlatos = todosPlatos + platos[i].toString();
            }
        }

        return "Mesa: " + numeroMesa + " Personas: " + numeroPersonas + " Platos: " + todosPlatos;

    }

    public double coste() {
        double total = 0;

        for (int i = 0; i < platos.length; i++) {
            if (platos[i] != null) {
                total = total + platos[i].getPrecio();
            }
        }
        return total;
    }

    public boolean hayDiabeticos() {
        if (platoPostres.isConAzucar() == true) {
            return false;
        } else {
            return true;
        }
    }
}
