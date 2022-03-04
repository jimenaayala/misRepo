/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Jime
 */
public class MatematicaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica mat = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        mat=ms.crearMatematica();
        System.out.println(mat.toString());
        System.out.println(ms.mayorValor(mat));
        System.out.println(ms.calcularPotencia(mat));
        System.out.println(ms.calcularRaiz(mat));
    }
    
}
