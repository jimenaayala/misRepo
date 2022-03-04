/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Jime
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona();
        PersonaServicio ps = new PersonaServicio();
        int peso = 0;
        int uno = 0;
        int menosUno = 0;
        int cero = 0;
        int mayor = 0;

        for (int i = 0; i < 4; i++) {
            p = ps.crearPersona();
            peso = ps.calcularImc(p);
            switch (peso) {
                case 1:
                    System.out.println("__________ESTAS GORDITO__________");
                    uno++;
                    break;
                case -1:
                    System.out.println("__________HECHALE CARNE  A LA OLLA__________");
                    menosUno++;
                    break;
                case 0:
                    System.out.println("__________PIPI CUCU__________");
                    cero++;
                    break;
            }
            if (ps.esMayor(p) == true) {
                System.out.println("La persona es mayor de edad");
                mayor++;
            }

        }
        System.out.println("__________ESTADISTICAS____________________________");
        System.out.println("El porcentaje de gorditos es: " + (uno * 100) / 4 + "%");
        System.out.println("El porcentaje de bajo peso es: " + (menosUno * 100) / 4 + "%");
        System.out.println("El porcentaje de pipis cucus es: " + (cero * 100) / 4 + "%");
        System.out.println("El porcentaje de mayores de edad es: " + (mayor * 100) / 4 + "%");
        System.out.println("El porcentaje de menores de edad es: " + (100-(mayor * 100) / 4) + "%");
        
    }

}
