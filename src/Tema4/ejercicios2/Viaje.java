package Tema4.ejercicios2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Viaje {

    public static void avisoFamilia(String lugar, ZonedDateTime llegada) {
        int hora = llegada.getHour();

        if (hora >= 9 && hora <= 22) {
            System.out.println("En " + lugar + ": puedes LLAMAR");
        } else {
            System.out.println("En " + lugar + ": manda WHATSAPP");
        }
    }

    public static boolean esFinDeSemana(LocalDate fecha) {
        return fecha.getDayOfWeek() == DayOfWeek.SATURDAY ||
                fecha.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}
