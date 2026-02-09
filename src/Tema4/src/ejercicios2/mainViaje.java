package Tema4.src.ejercicios2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class mainViaje {
    public static void main(String[] args) {

        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");


        ZonedDateTime salidaMadrid = ZonedDateTime.of(
                2025, 4, 12, 20, 45,
                0, 0,
                ZoneId.of("Europe/Madrid")
        );


        ZonedDateTime llegadaDoha = salidaMadrid
                .plusHours(6)
                .plusMinutes(45)
                .withZoneSameInstant(ZoneId.of("Asia/Qatar"));


        ZonedDateTime salidaDoha = llegadaDoha.plusHours(1);


        ZonedDateTime llegadaTokio = salidaDoha
                .plusHours(10)
                .plusMinutes(25)
                .withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Salida Madrid: " + salidaMadrid.format(f));
        System.out.println("Llegada Doha: " + llegadaDoha.format(f));
        System.out.println("Salida Doha: " + salidaDoha.format(f));
        System.out.println("Llegada Tokio: " + llegadaTokio.format(f));


        Viaje.avisoFamilia("Doha", llegadaDoha);
        Viaje.avisoFamilia("Tokio", llegadaTokio);


        long horasTotales =
                Duration.between(salidaMadrid, llegadaTokio).toHours();
        System.out.println("Tiempo total de viaje: " + horasTotales + " horas");


        if (Viaje.esFinDeSemana(llegadaTokio.toLocalDate())) {
            System.out.println("Llegas en fin de semana → WhatsApp a los amigos");
        }
    }
}
