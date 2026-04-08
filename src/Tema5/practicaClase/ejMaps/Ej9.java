package Tema5.practicaClase.ejMaps;

import java.util.HashMap;
import java.util.Map;

public class Ej9 {
    public static void main(String[] args) {

        Map<String, Map<String, Double>> curso = new HashMap<>();

        Map<String,Double> clase1 = new HashMap<>();
        clase1.put("Matemáticas",9.5);
        clase1.put("Historia",7.0);
        clase1.put("Física",8.5);
        curso.put("Ana",clase1);

        Map<String,Double> clase2 = new HashMap<>();
        clase2.put("Matemáticas",6.0);
        clase2.put("Historia",8.0);
        clase2.put("Física",5.5);
        curso.put("Luis",clase2);

        Map<String,Double> clase3 = new HashMap<>();
        clase3.put("Matemáticas",7.5);
        clase3.put("Historia",9.0);
        clase3.put("Física",8.0);
        curso.put("Marta",clase3);

        Map<String, Double> media = mediaAlumno(curso);
        System.out.println("La media de cada alumno es: " + media);

        Map<String,Double> mediaAsignaturas = mediaAsignatura(curso);
        System.out.println("La media por asignatura es: "  + mediaAsignaturas);

        Map<String,Double> mediaCursos = mediaCurso(curso);
        System.out.println(mediaCursos);
    }

    public static Map<String, Double> mediaAlumno(Map<String, Map<String, Double>> curso){
        Map<String, Double> media = new HashMap<>();
        for(String alumno: curso.keySet()){
            double mediaTotal = 0.0;
            for(String asignatura: curso.get(alumno).keySet()){
                mediaTotal += curso.get(alumno).get(asignatura);
            }
            media.put(alumno, mediaTotal / curso.get(alumno).size() );
        }
        return media;
    }

    public static Map<String,Double> mediaAsignatura (Map<String, Map<String, Double>> curso){
        Map<String,Double> media = new HashMap<>();
        for (String alumno : curso.keySet()) {
            for (String asignatura : curso.get(alumno).keySet()) {
                double nota = curso.get(alumno).get(asignatura);
                media.put(asignatura, media.getOrDefault(asignatura, 0.0) + nota);
            }
        }
        /*for (String asignatura : media.keySet()) {
            media.put(asignatura, media.get(asignatura) / curso.size());
        }*/
        int numAlumnos = curso.size();
        for (String asignatura : media.keySet()) {
            double notaMedia = media.get(asignatura) / numAlumnos;
            media.put(asignatura, notaMedia);
        }
        return media;
    }

    public static Map<String, Double> mediaCurso (Map<String, Map<String, Double>> curso){
        Map<String, Double> media = new HashMap<>();
        String mejorAlumno = "";
        double mejorMedia = 0.0;
        for(String alumno: curso.keySet()){
            double mediaTotal = 0.0;
            for(String asignatura: curso.get(alumno).keySet()){
                mediaTotal += curso.get(alumno).get(asignatura);
            }
            media.put(alumno, mediaTotal / curso.get(alumno).size() );

        }
        for(Map.Entry<String, Double> med : media.entrySet()){
            if(med.getValue() > mejorMedia){
                mejorMedia = med.getValue();
                mejorAlumno = med.getKey();
            }
        }
        System.out.println("Mejor alumno: " + mejorAlumno + " con " + mejorMedia);
        return null;
    }
}
