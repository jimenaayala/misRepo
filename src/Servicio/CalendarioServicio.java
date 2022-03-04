/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Calendario;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CalendarioServicio {
    public Calendario crearCalendario(){
        Calendario cal = new Calendario();
        return cal;
    }
    public boolean acerto (Calendario cal){
        boolean alcoyana = false;
        String mes;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese mes para evaluar si adivino: ");
        mes = leer.next();
        if (mes.equals(cal.getMesSecreto())){
                alcoyana=true;
        }
        return alcoyana;
        
    }
}
