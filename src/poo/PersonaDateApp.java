/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.PersonaDate;
import Servicio.PersonaDateServicio;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PersonaDateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaDate p = new PersonaDate();
        PersonaDateServicio ps=new PersonaDateServicio();
        p=ps.crearPersona();
        System.out.println(p.toString());
        System.out.println("La persona tiene "+ ps.calcularEdad(p)+ " años");
        System.out.println("Ingrese la edad de la persona a comparar:");
        if (ps.menorQue(leer.nextInt(), p)){
            System.out.println("La edad ingresada es menor");
        }else{
            System.out.println("La edad ingresada es mayor");
        }
    }
    
}
