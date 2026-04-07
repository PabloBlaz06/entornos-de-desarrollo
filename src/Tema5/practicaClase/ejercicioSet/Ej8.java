package Tema5.practicaClase.ejercicioSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ej8 {
    public static void main(String[] args) {

        Set<String> agenda = new LinkedHashSet<>();

        agenda.add("Revisar email");
        agenda.add("Reunion");
        agenda.add("Informe");
        agenda.add("Revisar email");
        agenda.add("LLamar cliente");

        for(String agenda1 : agenda){
            System.out.println(agenda1);
        }
        //System.out.println(agenda);
    }
}
