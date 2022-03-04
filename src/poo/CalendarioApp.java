/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Calendario;
import Servicio.CalendarioServicio;

/**
 *
 * @author Jime
 */
public class CalendarioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalendarioServicio cs = new CalendarioServicio();
        Calendario cal = cs.crearCalendario();
        if (cs.acerto(cal)){
            System.out.println("Adivinaste el mes");
        }else{
            System.out.println("Segui intentando :/");
        }
        
    }
    
}
