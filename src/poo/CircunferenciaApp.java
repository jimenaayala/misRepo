/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author Jime
 */
public class CircunferenciaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia cir = new Circunferencia (0);
        CircunferenciaServicio cs= new CircunferenciaServicio();
        cir = cs.crearCircunferencia();
        cs.area(cir);
        cs.perimetro(cir);
                
    }
    
}
