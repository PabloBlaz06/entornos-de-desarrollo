package Tema5.practicaClase.ejHotel;

import java.util.*;

public class Hoteles {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> hotelClienteNoches = new HashMap<>();

        // Hotel HTL01 - Madrid
        Map<String, Integer> reservasHTL01 = new HashMap<>();
        reservasHTL01.put("12345678A", 3);
        reservasHTL01.put("87654321B", 5);
        reservasHTL01.put("11223344C", 2);
        reservasHTL01.put("55667788E", 4);
        hotelClienteNoches.put("HTL01", reservasHTL01);

        // Hotel HTL02 - Barcelona
        Map<String, Integer> reservasHTL02 = new HashMap<>();
        reservasHTL02.put("44332211D", 1);
        reservasHTL02.put("55667788E", 2);
        reservasHTL02.put("99887766F", 3);
        reservasHTL02.put("12345678A", 2);
        hotelClienteNoches.put("HTL02", reservasHTL02);

        // Hotel HTL03 - Valencia
        Map<String, Integer> reservasHTL03 = new HashMap<>();
        reservasHTL03.put("77889900H", 6);
        reservasHTL03.put("87654321B", 3);
        reservasHTL03.put("33445566G", 2);
        hotelClienteNoches.put("HTL03", reservasHTL03);

        // Hotel HTL04 - Sevilla
        Map<String, Integer> reservasHTL04 = new HashMap<>();
        reservasHTL04.put("22334455J", 4);
        reservasHTL04.put("11223344C", 3);
        reservasHTL04.put("55443322L", 2);
        reservasHTL04.put("44332211D", 5);
        hotelClienteNoches.put("HTL04", reservasHTL04);

        // Hotel HTL05 - Bilbao
        Map<String, Integer> reservasHTL05 = new HashMap<>();
        reservasHTL05.put("99001122M", 7);
        reservasHTL05.put("55667788E", 3);
        reservasHTL05.put("77889900H", 4);
        reservasHTL05.put("11998877P", 2);
        reservasHTL05.put("87654321B", 1);
        hotelClienteNoches.put("HTL05", reservasHTL05);

        // Hotel HTL06 - París
        Map<String, Integer> reservasHTL06 = new HashMap<>();
        reservasHTL06.put("12345678A", 5);
        reservasHTL06.put("99887766F", 4);
        reservasHTL06.put("22334455J", 3);
        hotelClienteNoches.put("HTL06", reservasHTL06);

        // Llamadas a los métodos
        System.out.println("Códigos de hoteles: " + getCodigosHoteles(hotelClienteNoches));
        System.out.println("Reserva más larga: " + getReservaMasLarga(hotelClienteNoches));
        System.out.println("Media de noches por hotel: " + getMediaNochesPorHotel(hotelClienteNoches));
        System.out.println("Noches totales por cliente: " + getNochesTotalesPorCliente(hotelClienteNoches));

        // BOLA EXTRA
        System.out.println("\n--- ORDENADOS POR MEDIA DE NOCHES ---");
        ordenarHotelesPorMedia(hotelClienteNoches);

        System.out.println("\n--- ORDENADOS POR NOCHES TOTALES POR CLIENTE ---");
        ordenarClientesPorNoches(hotelClienteNoches);
    }

    // 1. Obtener códigos de hotel
    public static Set<String> getCodigosHoteles(Map<String, Map<String, Integer>> datos) {
        return datos.keySet();
    }

    // 2. Reserva más larga
    public static Integer getReservaMasLarga(Map<String, Map<String, Integer>> datos) {
        int maxNoches = 0;
        for (Map.Entry<String, Map<String, Integer>> dato : datos.entrySet()) {
            Map<String, Integer> reservasHotel = dato.getValue();

            for (int noche : reservasHotel.values()) {
                if (noche > maxNoches) {
                    maxNoches = noche;
                }
            }
        }
        return maxNoches;
    }

    // 3. Media de noches por hotel
    public static Map<String, Double> getMediaNochesPorHotel(Map<String, Map<String, Integer>> datos) {
        Map<String, Double> medias = new HashMap<>();
        for (Map.Entry<String, Map<String, Integer>> dato : datos.entrySet()) {
            String hotel = dato.getKey();
            Map<String, Integer> reservasHotel = dato.getValue();
            int sumaNoches = 0;
            for(int noche : reservasHotel.values()) {
                sumaNoches += noche;
            }
            double media = (double) sumaNoches / reservasHotel.size();
            medias.put(hotel, media);
        }
        return medias;
    }

    // 4. Noches totales por cliente
    public static Map<String, Integer> getNochesTotalesPorCliente(Map<String, Map<String, Integer>> datos) {
        Map <String, Integer> totales = new HashMap<>();
        for (Map<String, Integer> reservasHotel : datos.values()) {
            for (Map.Entry<String, Integer> reserva : reservasHotel.entrySet()) {
                String dniCliente = reserva.getKey();
                int nochesReserva = reserva.getValue();
                totales.put(dniCliente, totales.getOrDefault(dniCliente, 0) + nochesReserva);
            }
        }
        return totales;
    }

    // BOLA EXTRA 1: Ordenar hoteles por media de noches
    public static void ordenarHotelesPorMedia(Map<String, Map<String, Integer>> datos){
/*
        Map<String, Double> mediasOrdenadas = new TreeMap<>();
        mediasOrdenadas.putAll(getMediaNochesPorHotel(datos));

        for(Map.Entry<String, Double> dato : mediasOrdenadas.entrySet()) {
            System.out.println(dato.getKey() + ": " + dato.getValue());
        }*/

        Map<String, Double> medias = getMediaNochesPorHotel(datos);
        // Paso las entradas a una lista para poder ordenarlas
        List<Map.Entry<String, Double>> lista = new ArrayList<>(medias.entrySet());
        // Ordeno por valor (la media), de menor a mayor
        lista.sort(Comparator.comparing(Map.Entry<String, Double>::getValue));

        for(Map.Entry<String, Double> dato : lista) {
            System.out.println(dato.getKey() + ": " + dato.getValue());
        }

    }

    // BOLA EXTRA 2: Ordenar clientes por noches totales
    public static void ordenarClientesPorNoches(Map<String, Map<String, Integer>> datos) {

        Map<String, Integer> noche = getNochesTotalesPorCliente(datos);
        // Paso las entradas a una lista para poder ordenarlas
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(noche.entrySet());
        // Ordeno por valor (la media), de menor a mayor
        lista.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue).thenComparing(Map.Entry::getKey));

        for(Map.Entry<String, Integer> dato : lista) {
            System.out.println(dato.getKey() + ": " + dato.getValue());
        }
    }
}
