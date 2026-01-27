package Tema4.ejercicios1;


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
