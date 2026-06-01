package Tema7.practicaClase.pais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {
    private Connection conexion;

    public CiudadDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public List<Ciudad> obtenerCiudadesPorPais(int idPais){
        List<Ciudad> lista = new ArrayList<>();

        if (conexion != null) {
            try{
                String sql = "SELECT * FROM Ciudades WHERE id_Pais = ?";
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.setInt(1, idPais);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Ciudad ciudad = new Ciudad();
                    ciudad.setId(rs.getInt("id"));
                    ciudad.setNombre(rs.getString("nombre"));
                    ciudad.setPoblacion(rs.getInt("poblacion"));
                    ciudad.setId_pais(rs.getInt("id_pais"));
                    lista.add(ciudad);
                }
                rs.close();
                ps.close();
            }catch(SQLException e){
                System.out.println("Error al obtener el listado de ciudades");
            }
            return  lista;
        }else{
            System.out.println("No se puede realizar la conexión");
            return lista;
        }

    }
}
