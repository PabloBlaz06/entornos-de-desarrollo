package Tema4.src.ejercicios1;

/*Crea un programa que cuente cuántos días laborables (lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025*/

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ejercicio6 {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 4, 15);

        int dias = 0;

        while (!fecha.isAfter(fin)) {
            if (fecha.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    fecha.getDayOfWeek() != DayOfWeek.SUNDAY) {
                dias++;
            }
            fecha = fecha.plusDays(1);
        }

        System.out.println(dias);
    }
}
