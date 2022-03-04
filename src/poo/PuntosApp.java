/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Punto;
import Servicio.PuntoServicio;

/**
 *
 * @author Jime
 */
public class PuntosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntoServicio ps = new PuntoServicio();
        Punto a = ps.crearPunto();
        Punto b = ps.crearPunto();
        System.out.println("La distancia entre los dos puntos es: "+ps.distancia(a, b));
        
    }
    
}
