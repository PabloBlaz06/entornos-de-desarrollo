package ejerciciosRepaso.jdbcPreparedStatement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AlumnoDAO {
    private Connection con;

    public AlumnoDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto","root","");

    }

    public List<Alumno> buscarPorCurso(String curso) throws SQLException {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "select * from alumnos where curso = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, curso);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            double nota = rs.getDouble("nota");

            Alumno alumno = new Alumno(id,nombre,curso,nota);
            alumnos.add(alumno);
        }
        rs.close();
        pst.close();
        return alumnos;
    }

    public int insertarAlumno(Alumno a) throws SQLException {
        String sql="insert into alumno (nombre, curso, nota) values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, a.getNombre());
        pst.setString(2, a.getCurso());
        pst.setDouble(3, a.getNota());
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();
        int idGenerado = -1;
        if (rs.next()) {
            idGenerado = rs.getInt(1);
        }
        rs.close();
        pst.close();
        return idGenerado;
    }

    public boolean actualizarNota(int id, double nota) throws SQLException {
        String sql = "update alumnos set nota=? where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setDouble(1, nota);
        pst.setInt(2, id);
        int filas = pst.executeUpdate();
        pst.close();
        if (filas > 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean borrarAlumno(int id) throws SQLException {
        String sql = "delete from alumnos where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        int filas = pst.executeUpdate();
        pst.close();
        if (filas > 0){
            return true;
        }else{
            return false;
        }
    }

    public void cerrar() throws SQLException{
        if (con != null){
            con.close();
        }
    }    
}


