package Tema4.src.ejercicios1;

/* Escribe un programa que muestre la hora actual en España ("Europe/Madrid"),
Japón ("Asia/Tokyo") y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z"*/

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ejercicio3 {
    public static void main(String[] args) {

        ZonedDateTime espania = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));

        System.out.println(espania);
        System.out.println(japon);
        System.out.println(mexico);
    }
}
