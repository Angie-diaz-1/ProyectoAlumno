/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepcion;

/**
 *
 * @author USUARIO
 */
public class documentoNoExisteExeption extends RuntimeException {

    public documentoNoExisteExeption() {
        super ("El documento que esta ingresando no existe en la lista");
    
    }
    
    
    
    
}
