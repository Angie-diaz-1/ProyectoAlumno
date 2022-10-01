/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Modelo.Estudiante;

/**
 *
 * @author USUARIO
 */
public class Nodo <T>  {
    
    private T dato;
    private Nodo nodoSig;

    public Nodo( T dato) {
        this.dato = dato;
        this.nodoSig = null;
    }

    public T getEstudiante() {
        return dato;
    }

    public void setEstudiante(T estudiante) {
        this.dato = estudiante;
    }

    public Nodo getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(Nodo nodoSig) {
        this.nodoSig = nodoSig;
    }
    
    public Nodo obtenerSiguiente(){
        return nodoSig;
    }
    
    
    
    
    
    
    
    
}
