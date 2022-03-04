/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;

/**
 *
 * @author Jime
 */
public class MatematicaServicio {
    public Matematica crearMatematica (){
        Matematica mat = new Matematica();
        mat.setNum1(Math.random()*10);
        mat.setNum2(Math.random()*10);
        return mat;
    }
    public double mayorValor(Matematica m){
        if (m.getNum1()>m.getNum2()){
            return m.getNum1();
        }else{
            return m.getNum2();
        }        
    }
    public double menorValor(Matematica m){
        if (m.getNum1()>m.getNum2()){
            return m.getNum1();
        }else{
            return m.getNum2();
        }        
    }    
    public double calcularPotencia (Matematica m){
        double result=0;
        result = Math.pow(Math.abs(mayorValor(m)),Math.abs(menorValor(m)));
        return result;
    }
    public double calcularRaiz (Matematica m){
        double result=0;
        result = Math.sqrt(Math.abs(menorValor(m)));
        return result;
    }

}
