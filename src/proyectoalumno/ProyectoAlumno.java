/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoalumno;

import Controlador.Controlador;
import Modelo.Estudiante;

/**
 *
 * @author USUARIO
 */
public class ProyectoAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controlador controlador = new Controlador();

        Estudiante maria = new Estudiante("maria1", "111", 1, 18, "luz", "");
        Estudiante maria2 = new Estudiante("maria2", "222", 12, 128, "luz", "");
        Estudiante maria3 = new Estudiante("maria3", "333", 12, 128, "luz", "");
        Estudiante maria4 = new Estudiante("maria4", "444", 12, 128, "luz", "");
        Estudiante maria5 = new Estudiante("maria5", "555", 12, 128, "luz", "");

        boolean aux = controlador.registrarEstudiante(maria);
        boolean aux2 = controlador.registrarEstudiante(maria2);
        boolean aux3 = controlador.registrarEstudiante(maria3);
        boolean aux4 = controlador.registrarEstudiante(maria4);
        boolean aux5 = controlador.registrarEstudiante(maria5);

        System.out.println(aux);
        System.out.println(aux2);

        System.out.println(aux3);
        System.out.println(aux4);
        System.out.println(aux5);
        System.out.println(controlador.lista.size());

        for (int i = 0; i < controlador.lista.size(); i++) {
            System.out.println(controlador.lista.obtener(i).getNombre());
        }

        Estudiante maria6 = new Estudiante("maria6", "777", 12, 128, "luz", "");
        boolean aux6 = controlador.agregarPosicionEspecifica(maria6, 2);

        System.out.println(aux6);
        for (int i = 0; i < controlador.lista.size(); i++) {
            System.out.println(controlador.lista.obtener(i).getNombre());
        }

        System.out.println();
        boolean aux7 = controlador.eliminarEstudiante("777");

        System.out.println(aux7);
        for (int i = 0; i < controlador.lista.size(); i++) {
            System.out.println(controlador.lista.obtener(i).getNombre());
        }
        System.out.println();
        System.out.println();
        System.out.println();

//        System.out.println(controlador.estadoLista() );
//
//        for(Estudiante est:controlador.estadoLista()) {
//      System.out.println(est.getNombre());
//    }
        
    }

}
