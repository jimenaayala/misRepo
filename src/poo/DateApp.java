/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class DateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date ();
        Calendar fechaCal= new GregorianCalendar();
        Date fechaUser = new Date(); 
        fechaCal.setTime(fechaActual);
        
        //usuario carga la fecha
        System.out.println("Ingrese dia, mes y año"); 
        fechaCal.set(Calendar.DATE, leer.nextInt());
        fechaCal.set(Calendar.MONTH, leer.nextInt());
        fechaCal.set(Calendar.YEAR, leer.nextInt());
        
        
        fechaUser = fechaCal.getTime();
        
        System.out.println(fechaUser);
        
        
        System.out.println("Año: "+fechaCal.get(Calendar.YEAR)+" Mes:"+ fechaCal.get(Calendar.MONTH)+ " dia: "+ fechaCal.get(Calendar.DATE)+ " Dia del año nro: "+fechaCal.get(Calendar.DAY_OF_YEAR));
        System.out.println("Fecha Date: " +fechaActual);
        if (fechaCal.get(Calendar.YEAR)==fechaActual.getYear()){
            System.out.println("son iguales"); 
        }else{
            System.out.println("No son iguales");
        }
    }
    
}
