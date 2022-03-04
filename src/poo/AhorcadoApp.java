/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class AhorcadoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio js = new AhorcadoServicio();
        Ahorcado j = js.crearJuego1();

        while (op != 1) {

            js.longitud(j);
            System.out.println("Ingrese letra para ver si se encuentra en la palabra");
            String letra = leer.next();
            js.buscarLetra(j, letra);
            js.encontradas(j, letra);
            js.intentos(j);

            System.out.println("si desea salir del juego presione 1");
            op = leer.nextInt();
        }

    }

}
