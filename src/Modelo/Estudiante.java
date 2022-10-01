/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Estudiante {
    
    String nombre;
    String documento;
    int numeroDecurso;
    int edad;
    String nombreAcudiente;
    String numeroAcudiente;

    public Estudiante(String nombre, String documento, int numeroDecurso, int edad, String nombreAcudiente, String numeroAcudiente) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroDecurso = numeroDecurso;
        this.edad = edad;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setIdentificacion(String identificacion) {
        this.documento = identificacion;
    }

    public int getNumeroDecurso() {
        return numeroDecurso;
    }

    public void setNumeroDecurso(int numeroDecurso) {
        this.numeroDecurso = numeroDecurso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumeroAcudiente() {
        return numeroAcudiente;
    }

    public void setNumeroAcudiente(String numeroAcudiente) {
        this.numeroAcudiente = numeroAcudiente;
    }
    
    
    
    
    
    
    
    
    
    
    
}
