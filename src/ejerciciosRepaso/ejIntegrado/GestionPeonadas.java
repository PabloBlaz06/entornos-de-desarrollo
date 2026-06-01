package ejerciciosRepaso.ejIntegrado;

import java.io.*;
import java.util.*;

public class GestionPeonadas {
    static void main(String[] args) {
        List<Peonada> lista = leerFichero("peonadas.txt");
        Map<String, Object> estadisticas = calcularEstadisticas(lista);
        escribirInforme("informe_peonadas.txt", estadisticas);
        System.out.println("Informe generado");

    }

    private static void escribirInforme(String nombre, Map<String, Object> estadisticas) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))){
            bw.write("**** INFORME PEONADAS***\n\n");
            bw.write("Total de peonadas registradas " + estadisticas.get("totalPeonadas") + "\n");
            bw.write("Total de personas distintas " + estadisticas.get("totalPersonas") + "\n");
            bw.write("Persona que más aparece " + estadisticas.get("personaTop") + "\n");
            bw.write("Mes que má aparece " + estadisticas.get("mesTop") + "\n");
        }catch(IOException e){
            System.out.println("Error al escribir informe peonadas" +  e.getMessage());
        }
    }

    private static Map<String, Object> calcularEstadisticas(List<Peonada> lista) {
        Map<String, Object> datos = new HashMap<>();

        int totalPeonadas = 0;
        HashSet<String> personasUnicas = new HashSet<>();
        HashMap<String, Integer> contadorPersonas = new HashMap<>();
        HashMap<Integer, Integer> contadorMeses = new HashMap<>();

        for (Peonada p : lista){
            List<String> personas = p.getPersonas();
            totalPeonadas += personas.size();

            for (String persona : personas){
                personasUnicas.add(persona);
                contadorPersonas.put(persona, contadorPersonas.getOrDefault(persona, 0) + 1);
            }

            int mes = p.getMes();
            contadorMeses.put(mes, contadorMeses.getOrDefault(mes, 0) + personas.size());
        }
        String personaTop = null;
        int maxApariciones = 0;
        for (String nombre : contadorPersonas.keySet()){
            int apariciones = contadorPersonas.get(nombre);
            if (apariciones > maxApariciones){
                maxApariciones = apariciones;
                personaTop = nombre;
            }
        }

        int mesTop = 0;
        int maxMes = 0;
        for (int mes : contadorMeses.keySet()){
            int cantidad = contadorMeses.get(mes);
            if (cantidad > maxMes){
                maxMes = cantidad;
                mesTop = mes;
            }
        }

        datos.put("totalPeonadas", totalPeonadas);
        datos.put("totalPersonas", personasUnicas.size());
        datos.put("personaTop", personaTop);
        datos.put("mesTop", mesTop);

        return datos;
    }

    private static List<Peonada> leerFichero(String file) {
        List<Peonada> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                String[] fecha = partes[0].split("/");
                List<String> personas = new ArrayList<>();
                for (int i = 1; i < partes.length; i++) {
                    personas.add(partes[i]);
                }
                lista.add(new Peonada(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), personas));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero " + file + "\n" + e.getMessage());
        }
        return lista;
    }
}
