package Tema4.ejercicios1;

/* Escribe un programa que muestre la fecha actual en el formato
"Hoy es día, dd de mes de yyyy" (ejemplo: "Hoy es miércoles, 02 de abril de 2025")*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ejercicio1 {
    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy ");
        System.out.println("Hoy es " + hoy.format(fecha));
    }

}
