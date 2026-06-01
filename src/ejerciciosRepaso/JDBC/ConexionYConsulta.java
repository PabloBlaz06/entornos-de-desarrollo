package ejerciciosRepaso.JDBC;

import java.sql.*;

public class ConexionYConsulta {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto","root","");

            st = con.createStatement();

            String sql = "SELECT * FROM alumnos ORDER BY nombre";



            rs = st.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println(id + " - " +  nombre);
            }
        }catch(SQLException e){
            System.out.println("Error SQL " + e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("No e encontró el driver JDBC");
        }finally{
            try{
                if(rs != null)
                    rs.close();
            } catch (SQLException e) {}
            try{
                if(st != null)
                    st.close();
            } catch (SQLException e) {}
            try{
                if(con != null)
                    con.close();
            } catch (SQLException e) {}
        }
    }
}
