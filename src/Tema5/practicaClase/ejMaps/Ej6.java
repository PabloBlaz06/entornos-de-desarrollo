package Tema5.practicaClase.ejMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Map<String,Double> salario = new HashMap<>();
        salario.put("Pablo",5000.00);
        salario.put("Carlos",3000.00);
        salario.put("Ruben",2500.00);
        salario.put("Marcos",3000.00);
        salario.put("Alejandro",1800.00);

        for (Map.Entry<String, Double> entry : salario.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del que quieres ver el salario: ");
        String nom = sc.nextLine();

        double sueldo = salario.getOrDefault(nom,0.0);
        System.out.println("Sueldo: " + sueldo);

        double media = 0.0;

        for(Double sal :salario.values()){
            media += sal;
        }
        double mediaTotal = media/salario.size();
        System.out.println("Media: " + mediaTotal);
    }
}
