/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author Jime
 */
public class LibroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroServicio ls = new LibroServicio();
        Libro l1 = new Libro();
        l1 = ls.altaLibro();
        System.out.println(l1.toString());
        
    }
    
}
