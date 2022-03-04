/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CadenaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadena c  = new Cadena();
        CadenaServicio cs = new CadenaServicio();
        c = cs.crearCadena();
        System.out.println(c.toString());
        System.out.println("la cantidad de vocales es: "+ cs.mostrarVocales(c));
        cs.invertirFrase(c);
        cs.vecesRepetidas(c);
        cs.compararLog(c);
        cs.unirFrases(c);
        cs.reemplazar(c);
        if (cs.contiene(c)==true){
            System.out.println("El caracter esta contenido");
        } else{
            System.out.println("el caracter no esta contenido");
        }
            
    }
   
}
