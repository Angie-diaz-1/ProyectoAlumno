/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepcion;

/**
 *
 * @author USUARIO
 */
public class DocumentoDuplicadoException extends RuntimeException {
    
     public DocumentoDuplicadoException() {
        super (" El numero de documento del estudiante ya se encuentra registrado ");
    }
    
    
    
}
