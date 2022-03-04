/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CircunferenciaServicio {
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese radio");
        Circunferencia c1 = new Circunferencia(leer.nextDouble());
        return c1;
    }
    public void area (Circunferencia c1){
        System.out.println("El Area es: "+ Math.PI*Math.pow(c1.getRadio(),2));
    }
    public void perimetro (Circunferencia c1){
        System.out.println("El Perimetro es: "+2*Math.PI*c1.getRadio()*2);
    }       
}
