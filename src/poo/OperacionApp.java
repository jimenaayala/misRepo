/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author Jime
 */
public class OperacionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionServicio os = new OperacionServicio();
        Operacion op = new Operacion();
        op = os.crearOperacion();
        System.out.println("la suma de los dos numeros es: " + os.sumar(op));
        System.out.println("la resta de los dos numeros es: " + os.restar(op));
        System.out.println("la multiplicacion de los dos numeros es: " + os.multiplicar(op));
        System.out.println("la division de los dos numeros es: " + os.dividir(op));
    }
}
