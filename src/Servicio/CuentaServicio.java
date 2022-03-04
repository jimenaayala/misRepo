/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class CuentaServicio {
    public Cuenta crearCuenta (){
        Cuenta c = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numero de Cuenta, DNI, Saldo Actual, Interes:");
        c.setNumCuenta(leer.nextInt());
        c.setDNI(leer.nextLong());
        c.setSaldoCuenta(leer.nextDouble());
        c.setInteres(leer.nextInt());       
        return c;
    }
    public void ingresarDinero (Cuenta c, double monto){
        c.setSaldoCuenta(c.getSaldoCuenta()+ monto);
    }
    public void retirarDinero (Cuenta c, double monto){
        if (c.getSaldoCuenta()>monto){
            c.setSaldoCuenta(c.getSaldoCuenta() - monto);
        } else {
            c.setSaldoCuenta(0);
        }        
     }
    public void extraccionRapida(Cuenta c, double  monto){
        if ((c.getSaldoCuenta()*0.2)>monto){
            c.setSaldoCuenta(c.getSaldoCuenta() - monto);
        } else{
            System.out.println("Se puede retirar hasta el 20%, esta tratando de retirar más");
        }
    }
}
