package Tema2.src.Ejercicios5;

/* Desarrolla un programa que averigüe cuantas asignaturas tiene aprobadas un alumno.
El programa debe leer un String con el nombre de las asignaturas y después otro String con la lista de sus notas.
Debe dar como resultado el nombre de las asignaturas aprobadas.
Tanto la lista de asignaturas como la lista de notas utilizan el símbolo “:” como separador.
Ejemplo de funcionamiento del programa:
Escribe la lista de asignaturas: “Matemáticas:Literatura:Historia:Inglés”
Escribe la lista de notas: 7:4:10:3
Las asignaturas aprobadas son: Matemáticas Historia
Suponemos que las listas de asignaturas y de notas están bien formadas
es decir siempre habrá unos 8:9 entre una asignatura y otra o una nota y otra.
Además siempre existirá el mismo número de notas que de asignaturas.
El número de asignaturas no es fijo, pueden ser 4, 5, 6 o más. */

public class ejercicio17 {
    public static void main(String[] args) {

        String asignaturas = "Matemáticas:Literatura:Historia:Inglés";
        String notas = "7:4:10:3";

        String[] asignaturasA = asignaturas.split(":");
        String[] notasA = notas.split(":");
        for (int i = 0; i < asignaturasA.length; i++) {
            int nota = Integer.parseInt(notasA[i]);

            if(nota >= 5){
                System.out.println(asignaturasA[i]);
            }
        }

    }
}
