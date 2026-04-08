package Tema5.ejercicios.alquiler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Alquileres {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> cocheClienteDias = new HashMap<>();

        // Coche CAR01
        Map<String, Integer> clientesCAR01 = new HashMap<>();
        clientesCAR01.put("12345678A", 3);
        clientesCAR01.put("87654321B", 5);
        clientesCAR01.put("11223344C", 2);
        cocheClienteDias.put("CAR01", clientesCAR01);

        // Coche CAR02
        Map<String, Integer> clientesCAR02 = new HashMap<>();
        clientesCAR02.put("44332211D", 7);
        clientesCAR02.put("55667788E", 4);
        clientesCAR02.put("99887766F", 6);
        cocheClienteDias.put("CAR02", clientesCAR02);

        // Coche CAR03
        Map<String, Integer> clientesCAR03 = new HashMap<>();
        clientesCAR03.put("12345678A", 1); // repetido
        clientesCAR03.put("33445566G", 8);
        clientesCAR03.put("77889900H", 3);
        cocheClienteDias.put("CAR03", clientesCAR03);

        // Coche CAR04
        Map<String, Integer> clientesCAR04 = new HashMap<>();
        clientesCAR04.put("22334455J", 4);
        clientesCAR04.put("11223344C", 6); // repetido
        clientesCAR04.put("44332211D", 2); // repetido
        cocheClienteDias.put("CAR04", clientesCAR04);

        // Coche CAR05
        Map<String, Integer> clientesCAR05 = new HashMap<>();
        clientesCAR05.put("99001122M", 9);
        clientesCAR05.put("55667788E", 5); // repetido
        clientesCAR05.put("77889900H", 4); // repetido
        clientesCAR05.put("11998877P", 3);
        cocheClienteDias.put("CAR05", clientesCAR05);

        // TODO - Generar un set con los códigos de coche
        System.out.println(getCodigosCoches(cocheClienteDias));

        // TODO - Mostrar el alquiler más largo
        System.out.printf(
            "El alquiler más largo ha sido de %d días%n",
            getAlquilerMasLargo(cocheClienteDias)
        );

        // TODO - Crear un Map que la clave sea el coche y el value la media de días alquilados
        System.out.println(
            "La media de días por coche es " +
                getMediaDiasPorCoche(cocheClienteDias)
        );

        // TODO - Crear un MAP que la clave sea el DNI y el value los días totales alquilados
        System.out.println(
            "Los días totales por cliente son " +
                getDiasTotalesPorCliente(cocheClienteDias)
        );
    }

    public static Set<String> getCodigosCoches(Map<String, Map<String, Integer>> datos) {
        Set<String> codigos = datos.keySet();
        return codigos;
    }

    public static Integer getAlquilerMasLargo(
        Map<String, Map<String, Integer>> datos
    ) {
        int diaLargo = 0;
        for(Map<String, Integer> dato : datos.values()){
            for(Integer dia : dato.values()){
                if(diaLargo < dia){
                    diaLargo = dia;
                }
            }
        }
        // TODO
        return diaLargo;
    }

    public static Map<String, Double> getMediaDiasPorCoche(
        Map<String, Map<String, Integer>> datos
    ) {
        Map<String, Double> medias = new HashMap<>();
        for(String dato : datos.keySet()){
            Map<String, Integer> alquileres = datos.get(dato);
            int suma = 0;
            for(Integer dias : alquileres.values()){
                   // suma = suma + dias;
                suma += dias;
            }
            double media = (double) suma/alquileres.size();
            medias.put(dato, media);


        }
        // TODO
        return medias;
    }

    public static Map<String, Integer> getDiasTotalesPorCliente(
        Map<String, Map<String, Integer>> datos
    ) {
        Map<String, Integer> totales = new HashMap<>();
        for (Map<String, Integer> alquileres : datos.values()){
            for (Map.Entry<String, Integer> entry : alquileres.entrySet()){
                String dni = entry.getKey();
                int dias = entry.getValue();
                totales.put(dni, dias + totales.getOrDefault(dni, 0));
            }
        }
        // TODO
        return totales;
    }
}
