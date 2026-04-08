package Tema5.practicaClase.cursosOnline;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class CursosOnline {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> cursoAlumnoNota = new HashMap<>();
        // Curso CURS01
        Map<String, Integer> notasCURS01 = new HashMap<>();
        notasCURS01.put("12345678A", 8);
        notasCURS01.put("87654321B", 6);
        notasCURS01.put("11223344C", 9);
        cursoAlumnoNota.put("CURS01", notasCURS01);
        // Curso CURS02
        Map<String, Integer> notasCURS02 = new HashMap<>();
        notasCURS02.put("44332211D", 7);
        notasCURS02.put("55667788E", 5);
        notasCURS02.put("99887766F", 4);
        cursoAlumnoNota.put("CURS02", notasCURS02);
        // Curso CURS03
        Map<String, Integer> notasCURS03 = new HashMap<>();
        notasCURS03.put("12345678A", 10); // repetido
        notasCURS03.put("33445566G", 6);
        notasCURS03.put("77889900H", 7);
        cursoAlumnoNota.put("CURS03", notasCURS03);
        // Curso CURS04
        Map<String, Integer> notasCURS04 = new HashMap<>();
        notasCURS04.put("22334455J", 3);
        notasCURS04.put("11223344C", 8); // repetido
        notasCURS04.put("44332211D", 9); // repetido
        cursoAlumnoNota.put("CURS04", notasCURS04);
        // Curso CURS05
        Map<String, Integer> notasCURS05 = new HashMap<>();
        notasCURS05.put("99001122M", 6);
        notasCURS05.put("55667788E", 7); // repetido
        notasCURS05.put("77889900H", 9); // repetido
        notasCURS05.put("11998877P", 5);
        cursoAlumnoNota.put("CURS05", notasCURS05);
        // 1. Códigos de curso
        System.out.println(getCodigosCursos(cursoAlumnoNota));
        // 2. Número de alumnos por curso
        System.out.println(getNumeroAlumnosPorCurso(cursoAlumnoNota));
        // 3. Nota media por curso
        System.out.println(getNotaMediaPorCurso(cursoAlumnoNota));
        // 4. Nota más alta
        System.out.println("La nota más alta es " + getNotaMasAlta(cursoAlumnoNota));
        // 5. Cursos valorados por cada alumno
        System.out.println(getCursosValoradosPorAlumno(cursoAlumnoNota));
        // 6. Cursos aprobados por alumno
        System.out.println(getCursosAprobadosPorAlumno(cursoAlumnoNota));
    }
    public static Set<String> getCodigosCursos(Map<String, Map<String, Integer>> datos)
    {
        // TODO
        Set<String> codigosCursos = new HashSet<>();
        for(String codigos: datos.keySet()){
            codigosCursos.add(codigos);
        }
        return codigosCursos;
    }
    public static Map<String, Integer> getNumeroAlumnosPorCurso(Map<String, Map<String, Integer>> datos) {
        // TODO
        Map<String, Integer> alumnosPorCurso = new HashMap<>();

        for(String codigos: datos.keySet()){
            alumnosPorCurso.put(codigos, datos.get(codigos).size());
        }
        return alumnosPorCurso;
    }
    public static Map<String, Double> getNotaMediaPorCurso(Map<String, Map<String,
            Integer>> datos) {
        // TODO
        Map<String, Double> mediaCursos = new HashMap<>();
        for(String curso : datos.keySet()){
            double suma = 0.0;
            for(Integer nota: datos.get(curso).values() ){
                suma += nota ;
            }
            mediaCursos.put(curso, suma / datos.get(curso).size());
        }
        return mediaCursos;
    }
    public static int getNotaMasAlta(Map<String, Map<String, Integer>> datos) {
        // TODO
        int notaMasAlta = 0;
        for(String codigos: datos.keySet()){
            for(Integer nota: datos.get(codigos).values() ){
                if(nota > notaMasAlta){
                    notaMasAlta = nota ;
                }
            }
        }
        return notaMasAlta;
    }
    public static Map<String, Integer> getCursosValoradosPorAlumno(Map<String, Map<String, Integer>> datos) {
        // TODO
        Map<String, Integer> valoradosPorAlumno = new HashMap<>();
        for(String codigos: datos.keySet()){
            for(String alumno: datos.get(codigos).keySet() ){
                valoradosPorAlumno.put(alumno, valoradosPorAlumno.getOrDefault(alumno, 0) + 1);
            }
        }
        return valoradosPorAlumno;
    }
    public static Map<String, Integer> getCursosAprobadosPorAlumno(Map<String,
            Map<String, Integer>> datos) {
        // TODO
        Map<String, Integer> aprobados = new HashMap<>();
        for(String codigos: datos.keySet()){
            for(String alumno: datos.get(codigos).keySet() ){
                if(datos.get(codigos).get(alumno) >= 5){
                    aprobados.put(alumno, aprobados.getOrDefault(alumno, 0) + 1);
                }
            }
        }
        return aprobados;
    }
}