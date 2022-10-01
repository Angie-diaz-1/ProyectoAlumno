/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepcion.DocumentoDuplicadoException;
import Excepcion.documentoNoExisteExeption;
import Modelo.Estudiante;
import Util.Lista;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */

public class Controlador {

    public Lista<Estudiante> lista;

    public Controlador() {
        lista = new Lista<>();  // crear la expepcion

    }

    public Lista<Estudiante> getLista() {
        return lista;
    }
    
    //para llamr la persona
    
    public Estudiante estudiante (int posicion){
        return lista.obtener(posicion);
    }

    public boolean agregarPosicionEspecifica(Estudiante estudiante, int index) {
        return lista.añadirPosicion(estudiante, index);

    }

    public boolean registrarEstudiante(Estudiante estudiante) throws DocumentoDuplicadoException {
        Estudiante auxiliar = buscarEstudiante(estudiante.getDocumento());
        if (auxiliar == null) {
            if (lista.size() >= 0) {
                lista.add(estudiante);
                return true;
            }
        }
        throw new DocumentoDuplicadoException();
    }

    public Estudiante buscarEstudiante(String documento) {
        Estudiante estudianteTemporal = null;
        for (int i = 0; i < lista.size(); i++) {
            estudianteTemporal = lista.obtener(i);

            if (estudianteTemporal != null) {

                if (estudianteTemporal.getDocumento().equals(documento)) {
                    return estudianteTemporal;

                }
            }
        }
        return null;
    }

    public void editarEstu(Estudiante estudiante) throws documentoNoExisteExeption{

        Estudiante auxiliar = buscarEstudiante(estudiante.getDocumento());
        if (auxiliar == null) {
            throw new documentoNoExisteExeption();
            
        }else {
        
            auxiliar.setNombre(estudiante.getNombre());

            auxiliar.setNumeroDecurso(estudiante.getNumeroDecurso());
            auxiliar.setEdad(estudiante.getEdad());
            auxiliar.setNombreAcudiente(estudiante.getNombreAcudiente());
            auxiliar.setNumeroAcudiente(estudiante.getNumeroAcudiente());

           
        }
       
    }

    public boolean eliminarEstudiante(String documento) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.obtener(i) != null && lista.obtener(i).getDocumento().equals(documento)) {

                lista.eliminar(i);
                return true;
            }

        }
        return false;
    }
    
    public Estudiante obtenerEstudiante(int espacio ){
        return lista.obtener(espacio);
        
    }
    
    
    
    
    
    
    
    
    
    

//    public ArrayList<Estudiante> estadoLista() {
//        return this.lista.estadoLista();
//    }

}
 