/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import SQL.conexionBD;
import java.util.*;
import java.sql.*;

/**
 *
 * @author GIAN
 */
public class AlumnosDAO {
    public static final String SQL_SELECT = "SELECT * FROM ALUMNOS";
    public static final String SQL_SELECTASISTENCIA = "SELECT codigoAlumno, nombre FROM ALUMNOS";
    public static final String SQL_INSERT = "INSERT INTO ALUMNOS(codigoAlumno,nombre,telefono,especialidad,docente,fecha,departamento,provincia,edad,sexo) VALUES(?,?,?,?,?,?,?,?,?,?)";
    public static final String SQL_UPDATE = "UPDATE ALUMNOS SET nombre = ?, telefono = ?, especialidad =?, docente=?, fecha=?, departamento=?, provincia=?, edad=?, sexo=? WHERE codigoAlumno=?";
    public static final String SQL_DELETE = "DELETE FROM ALUMNOS WHERE codigoAlumno=?";
    public static final String SQL_SEARCH = "SELECT nombre,telefono,especialidad,docente,fecha,departamento,provincia,edad,sexo FROM ALUMNOS WHERE codigoAlumno=?";
    public static final String SQL_CODIGOEXIST = "SELECT COUNT(*) FROM ALUMNOS WHERE codigoAlumno = ?";
    //List<alumnos> ListaAlumnos = new ArrayList<>();
    
    public List<Alumnos> view(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Alumnos alumno = null;
        List<Alumnos> alumnos = new ArrayList<>();
        try{
           conexion = conexionBD.getconexion();
           sentencia = conexion.prepareStatement(SQL_SELECT);
           resultado = sentencia.executeQuery();
           
           while(resultado.next()){
               alumno = new Alumnos();
               alumno.setCodigo(resultado.getInt("codigoAlumno"));
               alumno.setNombre(resultado.getString("nombre"));
               alumno.setTelefono(resultado.getInt("telefono"));
               alumno.setEspecialidad(resultado.getString("especialidad"));
               alumno.setDocente(resultado.getString("docente"));    
               alumno.setFecha(resultado.getDate("fecha"));
               alumno.setDepartamento(resultado.getString("departamento"));
               alumno.setProvincia(resultado.getString("provincia"));
               alumno.setEdad(resultado.getInt("edad"));
               alumno.setSexo(resultado.getString("sexo"));
               alumnos.add(alumno);
            } 
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(resultado);
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }
        return alumnos;  
    }
    
    public List<Alumnos> viewAsistencia(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Alumnos alumno = null;
        List<Alumnos> alumnos = new ArrayList<>();
        try{
           conexion = conexionBD.getconexion();
           sentencia = conexion.prepareStatement(SQL_SELECT);
           resultado = sentencia.executeQuery();
           
           while(resultado.next()){
               alumno = new Alumnos();
               alumno.setCodigo(resultado.getInt("codigoAlumno"));
               alumno.setNombre(resultado.getString("nombre"));
               alumnos.add(alumno);
            } 
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(resultado);
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }
        return alumnos;  
    }
    
    public int Insert(Alumnos alumno){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        try{
            conexion = conexionBD.getconexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            sentencia.setInt(1, alumno.getCodigo());
            sentencia.setString(2, alumno.getNombre());
            sentencia.setInt(3, alumno.getTelefono());
            sentencia.setString(4, alumno.getEspecialidad());
            sentencia.setString(5, alumno.getDocente());
            sentencia.setDate(6,alumno.getFecha());
            sentencia.setString(7,alumno.getDepartamento());
            sentencia.setString(8, alumno.getProvincia());
            sentencia.setInt(9, alumno.getEdad());
            sentencia.setString(10, alumno.getSexo());
            registros = sentencia.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }
        return registros; 
    }
    
    public int Uptade(Alumnos alumno){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        try{
            conexion = conexionBD.getconexion();
            sentencia = conexion.prepareStatement(SQL_UPDATE);
            sentencia.setString(1, alumno.getNombre());
            sentencia.setInt(2, alumno.getTelefono());
            sentencia.setString(3, alumno.getEspecialidad());
            sentencia.setString(4, alumno.getDocente());
            sentencia.setDate(5,alumno.getFecha());
            sentencia.setString(6,alumno.getDepartamento());
            sentencia.setString(7, alumno.getProvincia());
            sentencia.setInt(8, alumno.getEdad());
            sentencia.setString(9, alumno.getSexo());
            sentencia.setInt(10, alumno.getCodigo());
            registros = sentencia.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }
        return registros;  
    }
    
    public int delete(Alumnos alumno){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0; 
        try{
            conexion = conexionBD.getconexion();
            sentencia = conexion.prepareStatement(SQL_DELETE);
            sentencia.setInt(1, alumno.getCodigo());
            registros = sentencia.executeUpdate();           
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public List<Alumnos> Search(int codigo){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Alumnos> alumnoEncontrado = new ArrayList<>();
        try{
            conexion = conexionBD.getconexion();
            sentencia = conexion.prepareStatement(SQL_SEARCH);
            sentencia.setInt(1,codigo);
            resultado = sentencia.executeQuery();
            while(resultado.next()){
                Alumnos alumno = new Alumnos();
                alumno.setCodigo(codigo);
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setTelefono(resultado.getInt("telefono"));
                alumno.setEspecialidad(resultado.getString("especialidad"));
                alumno.setDocente(resultado.getString("docente"));
                alumno.setFecha(resultado.getDate("fecha"));
                alumno.setDepartamento(resultado.getString("departamento"));
                alumno.setProvincia(resultado.getString("provincia"));
                alumno.setEdad(resultado.getInt("edad"));
                alumno.setSexo(resultado.getString("sexo"));
                alumnoEncontrado.add(alumno);    
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }       
        return alumnoEncontrado;
    }
    
    public boolean ExisteCodigo (int Codigo){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean existe = false;
        try{
            conexion = conexionBD.getconexion();
            sentencia = conexion.prepareStatement(SQL_CODIGOEXIST);
            sentencia.setInt(1, Codigo);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                int count = resultado.getInt(1);
                existe = count > 0;
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                conexionBD.cerrar(resultado);
                conexionBD.cerrar(sentencia);
                conexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }    
        return existe;
    }
}
