/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;
import java.awt.BorderLayout;

/**
 *
 * @author Jime
 */
public class RectanguloApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r = new Rectangulo();
        RectanguloServicio rs = new RectanguloServicio();
        r = rs.crearRectangulo();
        System.out.println("EL perimetro es: "+ rs.perimetro(r)+ " - y la superficie es: "+ rs.superficie(r));
        System.out.println(" ");
        System.out.println("DIBUJO DE SU RECTANGULO");
        System.out.println("________________________");
        System.out.println(" ");
        rs.dibujar(r);
        
        
    }
    
}
