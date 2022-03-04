/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CadenaServicio {
    public Cadena crearCadena(){
        Cadena c = new Cadena ();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese frase");
        c.setFrase(leer.next());
        c.setLog(c.getFrase().length());
        return c;
    }
    public int mostrarVocales(Cadena c){
        int cantVocales = 0;
        for (int i = 0; i < c.getLog(); i++) {
            if (c.getFrase().substring(i, i+1).equalsIgnoreCase("A")==true || 
                c.getFrase().substring(i, i+1).equalsIgnoreCase("E")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("I")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("O")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("U")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("a")==true || 
                c.getFrase().substring(i, i+1).equalsIgnoreCase("e")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("i")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("o")==true ||
                c.getFrase().substring(i, i+1).equalsIgnoreCase("u")==true ){
                cantVocales++;
            }
        }
        return cantVocales;
    }
    public void invertirFrase(Cadena c){
        int i=0;
        System.out.println(" _______________________ ");
        for (i = c.getLog(); i != 0; i--) {
            System.out.print(c.getFrase().substring(i-1, i));            
        }
        System.out.println(" ");        
    }
     public void vecesRepetidas (Cadena c){
        Scanner leer = new Scanner(System.in);
        int vecesrepetidas=0;        
        String letra = new String();
        System.out.println("Ingrese la letra a buscar:");
        letra = leer.next();
        for (int i = 0; i < c.getLog(); i++) {
              if (letra.equalsIgnoreCase(c.getFrase().substring(i, i+1))){
                  vecesrepetidas++;
              }
        }
         System.out.println("se repite:"+vecesrepetidas);
    }
    public void compararLog (Cadena c){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        //String cadena2= new String ();
        System.out.println("Ingrese cadena sobre la que desea comparar el largo:");
        String cadena2=leer.nextLine();
        if (c.getFrase().length()==cadena2.length()){
            System.out.println("Mismo largo las cadenulis!");
        }else{
            System.out.println("diferente largo las cadenulis!");
        }
        
    }
    public void unirFrases (Cadena c){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Introduzca la frase a unir: ");
        System.out.println(c.getFrase()+" - "+ leer.next());
    }
    public void reemplazar(Cadena c){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Introduzca la letra a reemplazar por las letras a encontradas: ");
        String letra = leer.next();
        String cadena = new String();
        for (int i = 0; i < c.getFrase().length(); i++) {
           if (c.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
              cadena = cadena + letra;
           } else{
               cadena = cadena + c.getFrase().substring(i, i+1);
           }
        }
        System.out.println(cadena);
    }
    public boolean contiene(Cadena c){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        boolean esta = false;
        System.out.println("Introduzca la letra a buscar dentro de la cadena: ");
        String letra = leer.next();
        for (int i = 0; i < c.getFrase().length(); i++) {
           if (c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
               esta = true;
               return esta;
           } 
        }
        return esta;
    }
}
