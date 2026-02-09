package Tema4.src.ejercicios1;

/*Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias)
 que introduzca el usuario*/

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicio (HH:mm): ");
        LocalTime inicio = LocalTime.parse(sc.next());

        System.out.print("Hora fin (HH:mm): ");
        LocalTime fin = LocalTime.parse(sc.next());

        Duration d = Duration.between(inicio, fin);

        System.out.println(
                d.toHours() + " horas y " + (d.toMinutes() % 60) + " minutos"
        );
    }
}
