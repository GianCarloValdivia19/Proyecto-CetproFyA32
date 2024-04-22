/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author GIAN
 */
public class conexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/bdfya32";
    private static final String user = "root";
    private static final String password = "977966335";
            
    public static Connection getconexion() throws SQLException{
       return DriverManager.getConnection(URL,user,password);
    }
    
    public static void cerrar(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public static void cerrar(Statement sentencia) throws SQLException{
        sentencia.close();
    }
    
    public static void cerrar(PreparedStatement sentencia) throws SQLException{
        sentencia.close();
    }
    
    public static void cerrar(ResultSet resultado) throws SQLException{
        resultado.close();
    }  
}
