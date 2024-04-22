/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.sql.Date;

/**
 *
 * @author GIAN
 */
public class Alumnos {
    private int codigo;
    private String nombre;
    private int telefono;
    private String especialidad;
    private String docente;
    private Date fecha;
    private String departamento;
    private String provincia;
    private int edad;
    private String sexo;

    public Alumnos(){
    
    }
    
    public Alumnos(int codigo){
        this.codigo = codigo;
    }
    
    public Alumnos(int codigo, String nombre, int telefono, String especialidad,
            String docente, Date fecha, String departamento, String provincia , int edad, String sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.docente = docente;
        
        this.fecha = fecha;
        this.departamento = departamento;
        this.provincia = provincia;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Alumnos(String nombre, int telefono, String especialidad, 
            String docente, Date fecha, String departamento, String provincia, int edad, String sexo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.docente = docente;
        this.fecha = fecha;
        this.departamento = departamento;
        this.provincia = provincia;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public String getDocente() {
        return docente;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } 
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }
    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
