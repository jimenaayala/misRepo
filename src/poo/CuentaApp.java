/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cuenta;
import Servicio.CuentaServicio;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CuentaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String op = new String();
        Cuenta c = new Cuenta();
        CuentaServicio cs = new CuentaServicio();
        op="C";
        while (op != "S") {
            System.out.println(" ");
            System.out.println("______________________________");
            System.out.println("INGRESE LA OPCION DESEADA");
            System.out.println("C = Crear un cuenta ");
            System.out.println("I = Ingresar dinero ");
            System.out.println("R = Extraer dinero ");
            System.out.println("E = Extraccion rápida");
            System.out.println("S = Para salir");
            System.out.println("_______________________________");
            System.out.println("Ingrese opcion:");
            op = leer.next();
            switch (op) {
                case "C":
                    c = cs.crearCuenta();
                    break;
                case "I":
                    System.out.println("Ingrese monto de dinero");
                    cs.ingresarDinero(c, leer.nextDouble());
                    System.out.println("_______________________________");
                    System.out.println("Su saldo actual es " + c.getSaldoCuenta());
                    System.out.println("_______________________________");
                    break;
                case "R": 
                    System.out.println("Ingrese monto de dinero a extraer");
                    cs.retirarDinero(c, leer.nextDouble());
                    System.out.println("_______________________________");
                    System.out.println("Su saldo actual es " + c.getSaldoCuenta());
                    System.out.println("_______________________________");
                    break;
                case "E":
                    System.out.println("Ingrese monto de dinero a extraer");
                    cs.extraccionRapida(c, leer.nextDouble());
                    System.out.println("_______________________________");
                    System.out.println("Su saldo actual es " + c.getSaldoCuenta());
                    System.out.println("_______________________________");
                    break;

                case "S": break;
                default: break;
            }

        }          
    }
}
