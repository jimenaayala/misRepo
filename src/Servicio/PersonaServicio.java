/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        
        System.out.println("Ingrese nombre:");
        p.setNombre(leer.next());
        System.out.println("Ingrese edad:");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo - H,M,O:");
        p.setSexo(leer.next().charAt(0));
        
        while (!String.valueOf(p.getSexo()).equals("H") && !String.valueOf(p.getSexo()).equals("M") && !String.valueOf(p.getSexo()).equals("O")) {
                System.out.println("Ingrese dato incorrecto, Debe tipear M o H o O para indicar sexo, ingrese nuevamente");
                p.setSexo(leer.next().charAt(0));
        }
        System.out.println("Ingrese peso: ");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura de la persaona:");
        p.setAltura(leer.nextDouble());
        return p;
    }
    public int calcularImc(Persona p){
        p.setImc((p.getPeso()/(p.getAltura()*p.getAltura())*10000));      
        if (p.getImc()<20){
            return -1;
        } else if ((p.getImc()>25)){
            return 1;
        } else{
            return 0;
        }
    }
    public boolean esMayor(Persona p){
        if (p.getEdad()>18){
            return true;
        }else{
            return false;
        }
            
    }
}
