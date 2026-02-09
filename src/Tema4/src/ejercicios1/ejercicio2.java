package Tema4.src.ejercicios1;

/*Crea un programa que pida al usuario su fecha de nacimiento (día y mes)
y calcule cuántos días faltan para su próximo cumpleaños desde hoy (02/04/2025)*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        LocalDate hoy = LocalDate.of(2025, 4, 2);
        LocalDate cumple = LocalDate.of(2025, mes, dia);
        if (cumple.isBefore(hoy)) {
            cumple = cumple.plusYears(1);
        }
        long dias = ChronoUnit.DAYS.between(hoy, cumple);
        System.out.println("Faltan " + dias + " días");
    }
}
