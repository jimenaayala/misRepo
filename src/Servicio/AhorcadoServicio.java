/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class AhorcadoServicio {

    public Ahorcado crearJuego1() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidada de intentos");
        int ci = leer.nextInt();

        System.out.println("Ingrese palabra");
        String palabra = leer.next();

        Ahorcado j = new Ahorcado(palabra.length(), ci);

        for (int i = 0; i < palabra.length(); i++) {
            j.setPalabra(palabra.substring(i, i + 1), i);
        }
        /* for (int x = 0; x < palabra.length(); x++) {
                        System.out.print(j.getPalabra()[x]);                    
                } */
        return j;
    }

    public void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra a adivinar es de " + a.getPalabra().length + " letras");
    }

    public void buscarLetra(Ahorcado a, String letra) {
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                System.out.println("La letra se encuentra en la palabra");
            }
        }
    }

    public void encontradas(Ahorcado a, String letra) {
        boolean encontrada = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                a.setCantIntentosrestantes(a.getCantIntentosrestantes()- 1);
                a.setCantLetrEnc(a.getCantLetrEnc() + 1);
            }
        }
        System.out.println("Letras encontradas: "+a.getCantLetrEnc()+" - faltantres: "+(a.getPalabra().length-a.getCantLetrEnc()));
        System.out.println("Numero de oportunidades restantes: "+ a.getCantIntentosrestantes());

        //return encontrada;
    }
    public void intentos(Ahorcado a){
        System.out.println("El numero de intentos que le quedan es: "+a.getCantIntentosrestantes());
    }
}
