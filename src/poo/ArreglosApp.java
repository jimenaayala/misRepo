/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author Jime
 */
public class ArreglosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] arr1= new double [50]; 
        double [] arr2= new double [30]; 
        //Arrays.fill(arr2, 0.1);
        Arrays.fill(arr1, 5);
        mostrarArray(arr1);
        arr2 = Arrays.copyOf(arr1, 30);
        Arrays.sort(arr1);
        System.out.println("Arreglo 2");
        mostrarArray(arr2);
        Arrays.fill(arr2, 20, 30, 0.5);
        System.out.println("Arreglo 2 con valores extras");
        mostrarArray(arr2);
        Arrays.fill(arr2, 20, 30, Math.random());
        System.out.println("Arreglo 3 con valores extras");
        mostrarArray(arr2);
        System.out.println("Con valores aleatorios");
        llenarArrays(arr1);
        mostrarArray(arr1);
        
    }
    public static void mostrarArray(double[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
    }
    public static void llenarArrays(double[] arr){
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Math.random();
            }
    }
    
}
