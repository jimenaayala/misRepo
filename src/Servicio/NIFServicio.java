/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class NIFServicio {

    public NIF crearNIF() {
        NIF n = new NIF();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese DNI:");
        n.setDNI(leer.nextInt());
       
        return n;
    }

    public void llenarTabla() {
        final String[][] tabla = new String[22][2];
        tabla[0][0] = "0";
        tabla[1][0] = "1";
        tabla[2][0] = "2";
        tabla[3][0] = "3";
        tabla[4][0] = "4";
        tabla[0][1] = "T";
        tabla[1][1] = "R";
        tabla[2][1] = "W";
        tabla[3][1] = "A";
        tabla[4][1] = "G";
    }
}
