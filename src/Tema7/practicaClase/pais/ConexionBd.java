package Tema7.practicaClase.pais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {
    private static final String URL = "jdbc:mysql://localhost:3306/geografia_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private Connection conexion;

    // Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión creada correctamente");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC");
        } catch (SQLException e) {
            System.out.println("Error: Fallo al ejecutar la consulta");
        } catch (Exception e) {
            System.out.println("Error: Fallo en el proceso de conexión");
        }
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            System.out.println("Error: Fallo al ejecutar la consulta");
        } catch (Exception e) {
            System.out.println("Error: Fallo en el proceso de desconexión");
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}
