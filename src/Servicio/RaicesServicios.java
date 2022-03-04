/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class RaicesServicios {
    public Raices crearRaices(){
        Raices r = new Raices();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los tres coeficientes: ");
        r.setA(leer.nextInt());
        r.setB(leer.nextInt());
        r.setC(leer.nextInt());
        return r;
    }
    public double getDiscriminante(Raices r){
        double discr = Math.pow(r.getB(), 2)-4*r.getA()*r.getC();
        return discr;
    }
    public double getDiscriminante2(Raices r){
        double discr = -r.getB()+Math.sqrt((Math.pow(r.getB(), 2)-4*r.getA()*r.getC()))/(2*r.getA());
        return discr;
    }
    
    public boolean tieneRaices(Raices r){
        boolean poseeRaices = false;
        if (getDiscriminante(r)> 0){
            poseeRaices=true;
        }
        return poseeRaices;
    }
    public boolean tieneRaiz(Raices r){
        boolean poseeRaiz = false;
        if (getDiscriminante(r)== 0){
            poseeRaiz=true;
        }
        return poseeRaiz;
    }
    public void obtenerRaices(Raices r){
        if (tieneRaices(r)){
            System.out.println(-r.getB()-Math.sqrt((Math.pow(r.getB(), 2)-4*r.getA()*r.getC()))/(2*r.getA()));
            System.out.println(-r.getB()+Math.sqrt((Math.pow(r.getB(), 2)-4*r.getA()*r.getC()))/(2*r.getA()));
        }
    }
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)){
            System.out.println(getDiscriminante(r));
        }
    } 
    public void calcular(Raices r){
        obtenerRaices(r);
        obtenerRaiz(r);
        if (tieneRaices(r)==false && tieneRaiz(r)==false){
            System.out.println("la solucion no tiene raices"); 
        }
    }
}
