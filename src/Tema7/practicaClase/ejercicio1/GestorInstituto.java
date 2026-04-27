package Tema7.practicaClase.ejercicio1;

import java.sql.*;

public class GestorInstituto {

    private static final String URL = "jdbc:mysql://localhost:3306/instituto_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; // Que cada alumno ponga la suya
    private Connection conexion;

    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            System.out.println("Conexión creada correctamente");
        }catch (ClassNotFoundException e){
            System.out.println("Error: No se encontró el driver JDBC");
        }catch(SQLException e){
            System.out.println("Error: Fallo en el proceso de conexión");
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public void desconectar(){
        try{
            if (conexion != null && !conexion.isClosed()){
                conexion.close();
                System.out.println("Conexión cerrada correctamente");
            }
        }catch(SQLException e){
            System.out.println("Error: Fallo en el proceso de desconexión");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente
    public void registrarAlumno(String nombre, String email){
        String sql = "INSERT INTO ALUMNOS (NOMBRE, EMAIL) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, email);
            int filas = ps.executeUpdate();
            System.out.println(filas + " registrado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al guardar el alumno");;
        } catch (Exception e) {
            System.out.println("Error");;
        }
    }

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N
    public void matricularAlumno(int idAlumno, int idAsignatura){
        String sql = "INSERT INTO MATRICULAS (id_alumno, id_asignatura) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idAsignatura);
            int filas = ps.executeUpdate();
            System.out.println(filas + " registrado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al matricular el alumno");;
        } catch (Exception e) {
            System.out.println("Error");;
        }
    }
    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        // Aquí iremos probando los métodos paso a paso
    }


}
