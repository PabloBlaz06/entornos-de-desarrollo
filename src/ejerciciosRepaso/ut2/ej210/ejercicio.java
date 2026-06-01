package ejerciciosRepaso.ut2.ej210;

import java.util.Scanner;

public class ejercicio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce el tipo de sesion (mañana/tarde/noche): ");
        String tipo = sc.nextLine();
        System.out.println("Introduce si eres socio (true/false):");
        boolean socio = sc.nextBoolean();

        double tarifa = calcularTarifa(edad,tipo,socio);
        System.out.printf("Precio final: %.2f€%n", tarifa);


    }


    public static double calcularTarifa(int edad,String tipo, boolean socio){

        double precioBase= 10.0;

        if(tipo.equalsIgnoreCase("mañana")){
            precioBase *= 0.8;
        }

        if(edad <= 14 || edad >= 65){
            precioBase *= 0.7;
        }

        if(socio = true){
            precioBase *= 0.85;
        }

        if(precioBase < 2.0){
            precioBase = 2.0;
        }

        return precioBase;
    }
}
