package Tema7.practicaClase.pais;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Geografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConexionBd CBD = new ConexionBd();
        CBD.conectar();
        Connection conexion = CBD.getConexion();

        if (conexion != null) {
            try{
                // Pedir un continente y mostrarlo
                System.out.print("Introduce un continente: ");
                String continente = sc.nextLine();
                mostrarCiudades(conexion, continente);

                // Trasvase de población con Transacción
                System.out.println("Iniciando trasvase de población ");
                trasvasePoblacion(conexion);

                // Llamada a procedimiento almacenado
                llamadaProcedimiento(conexion);

                // mostrar ciudades de Brasil

                CiudadDAO dao = new CiudadDAO(conexion);
                List<Ciudad> ciudadesBrasil = dao.obtenerCiudadesPorPais(4);
                System.out.println("Ciudades de Brasil:");
                for (Ciudad ciudad : ciudadesBrasil) {
                    System.out.println(ciudad.getNombre() + ": " + ciudad.getPoblacion());
                }
            } catch (Exception e) {
                System.out.println("Fallo al mostrar los datos");
            } finally{
                CBD.desconectar();
            }
        }else{
            System.out.println("No se puede realizar la conexión");
        }

    }

    private static void llamadaProcedimiento(Connection conexion) {
        try {
            CallableStatement cs = conexion.prepareCall("{CALL calcular_poblacion_continente(?, ?)}");
            cs.setString(1, "Asia");
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            int totalHabitantes = cs.getInt(2);
            System.out.printf("Total habitantes: %d%n", totalHabitantes);
            cs.close();
        }catch (SQLException e) {
            System.out.println("Error al obtener el número de hbitantes");
        }
    }

    private static void mostrarCiudades(Connection conexion, String continente) {
        String sql = "SELECT c.nombre AS ciudad, c.poblacion AS poblacion, p.nombre AS pais " +
                "FROM Ciudades c JOIN Paises p ON c.id_pais = p.id " +
                "WHERE p.continente = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, continente);
            ResultSet rs = ps.executeQuery();
            System.out.println("Ciudades:");
            while (rs.next()) {
                System.out.println("Ciudad: " + rs.getString("ciudad") + " | Pais: " + rs.getString("pais") +
                        " | Poblacion: " + rs.getInt("poblacion") + " habitantes");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el listado de ciudades");
        }
    }

    private static void trasvasePoblacion(Connection conexion) {
        try{
            conexion.setAutoCommit(false);
            String sql1 = "UPDATE Ciudades SET poblacion = poblacion + 50000 WHERE nombre = 'Madrid'";
            String sql2 = "UPDATE Ciudades SET poblacion = poblacion - 50000 WHERE nombre = 'Barcelona'";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            conexion.commit();
            st.close();
            System.out.println("La población ha migrado");
        } catch (SQLException e) {
            System.out.println("Error en la transacción");
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                System.out.println("Error al hacer el rollback");
            }
        } finally{
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Error de autocommit");;
            }
        }
    }
}
