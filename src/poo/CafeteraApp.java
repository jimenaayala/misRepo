/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CafeteraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera c = new Cafetera();
        String op = new String();
        CafeteraServicio cs = new CafeteraServicio();
        op="D";
        c = cs.crearCafetera();
        while (op.equals("S")== false) {
            System.out.println(" ");
            System.out.println("______________________________");
            System.out.println("INGRESE LA OPCION DESEADA");
            System.out.println("A = Agregar Cafe ");
            System.out.println("V = Vaciar Cafetera ");
            System.out.println("T = Servir taza ");
            System.out.println("L = Llenar cafetera");
            System.out.println("S = Para salir");
            System.out.println("_______________________________");
            System.out.println("Ingrese opcion:");
            op = leer.next();
            switch (op) {
                case "A":
                    System.out.println("ingrese la cantidad de cafe a agregar:");
                    cs.agregarCafe(c, leer.nextDouble());
                    continue;
                case "V":
                    cs.vaciarCafetera(c);
                    continue;
                case "T":
                    System.out.println("que capacidad tiene la taza en ml?");
                    if (cs.servirTaza(leer.nextDouble(), c) == true) {
                        System.out.println("su taza se lleno correctamente, queda "+ c.getCapacidadActual()+ " de café en la cafetera");
                    } else {
                        System.out.println(" ");
                        System.out.println("lo siento :( , su taza no llego a llenarse");
                    }
                    continue;
                case "L":
                    cs.llenarCafetera(c);
                    System.out.println("la cafetera esta llena");
                    break;
                case "S": break;
            }
        }
    }

}
