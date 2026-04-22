package Tema7.practicaClase.ejercicio1;

import java.sql.*;

public class GestorInstituto {

    private static final String URL = "jdbc:mysql://localhost:3306/instituto_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; // Que cada alumno ponga la suya
    private Connection conexion;

    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación

    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N

    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        // Aquí iremos probando los métodos paso a paso
    }


}
