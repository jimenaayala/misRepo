/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class RectanguloServicio {

    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base y altura del rectangulo");
        r.setBase(leer.nextInt());
        r.setAltura(leer.nextInt());
        return r;
    }

    public double superficie(Rectangulo r) {
        return r.getBase() * r.getAltura();
    }

    public double perimetro(Rectangulo r) {
        return r.getBase() * 2 + r.getAltura() * 2;
    }

    public void dibujar(Rectangulo r) {
        int fila = r.getBase();
        int col = r.getAltura();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fila; j++) {
                if (i == 0){
                    System.out.print("* ");
                } else {
                    if (i==col-1){
                        System.out.print("* ");
                    } else  
                        if (j==0){
                            System.out.print("* ");
                        } else{
                            if (j!=fila-1){
                                System.out.print("  ");
                            }else{
                                System.out.print("* ");
                            }
                        }
                    
                }

            }
            System.out.println(" ");

        }
    }
}
