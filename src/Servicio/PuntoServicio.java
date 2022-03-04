/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PuntoServicio {
    public Punto crearPunto(){
        Punto p = new Punto();
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese las coordenadas del punto a crear [x,y]: ");
        p.setX(leer.nextInt());
        p.setY(leer.nextInt());
        return p;
    }
    public double distancia (Punto a, Punto b){
        double dist;
        dist= Math.sqrt(Math.pow((b.getX()-a.getX()),2) + Math.pow((b.getY()-a.getY()),2));
        return dist;
    }
}
