package ejerciciosRepaso.ejIntegrado;

import java.util.List;

public class Peonada {
    private int dia;
    private int mes;
    private int ano;
    private List<String> personas;

    public Peonada(int dia, int mes, int ano, List<String> personas) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.personas = personas;
    }
    public int getMes() {
        return dia;
    }

    public List<String> getPersonas() {
        return personas;
    }

}
