package Tema4.src.ejercicios1;

/* Crea un metodo que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.*/

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ejercicio4 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();

        if (fecha.getDayOfWeek() == DayOfWeek.SATURDAY ||
                fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("No es fin de semana");
        }
    }
}

