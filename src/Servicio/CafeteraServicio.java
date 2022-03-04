/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CafeteraServicio {

    public Cafetera crearCafetera(){ 
        Scanner leer = new Scanner (System.in);     
        Cafetera c = new Cafetera();
        System.out.println("Ingrese capacidad Maxima");
        c.setCapacidadMax(leer.nextDouble());
        return c;
    }

    public void llenarCafetera(Cafetera c) {
        c.setCapacidadActual(c.getCapacidadMax());
    }

    public boolean servirTaza(double taza, Cafetera c) {
        boolean seLlenoTaza = false;
        if (c.getCapacidadActual() < taza) {
            System.out.println("la taza se lleno con ml: " + c.getCapacidadActual());
            c.setCapacidadActual(0);

        } else {
            c.setCapacidadActual(c.getCapacidadActual() - taza);
            seLlenoTaza = true;
        }
        return seLlenoTaza;
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCapacidadActual(0);
        System.out.println("La cafetera se vacio ;|");
    }

    public void agregarCafe(Cafetera c, double cafe) {
        c.setCapacidadActual(c.getCapacidadActual() + cafe);
        System.out.println("a la cafetera se le agregaron "+ cafe+ " ml de cafe. Su capacidad actual es: "+ c.getCapacidadActual());
    }

}
