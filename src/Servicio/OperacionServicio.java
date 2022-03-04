/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class OperacionServicio {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero uno y numero dos:");
        Operacion op = new Operacion(leer.nextInt(), leer.nextInt());
        return op;
    }

    public int sumar(Operacion op) {
        return op.getNum1() + op.getNum2();
    }

    public int restar(Operacion op) {
        return op.getNum1() - op.getNum2();
    }

    public int dividir(Operacion op) {
        if (op.getNum2()==0.0){
            System.out.println("No se pueden dividir un número por cero");
            return 0;
        } else{
            return op.getNum1() / op.getNum2();
        }
        
    }

    public int multiplicar(Operacion op) {
        if (op.getNum2()==0){
            return 0;
        } else {
            return op.getNum1() * op.getNum2();
        }
        
    }
}
