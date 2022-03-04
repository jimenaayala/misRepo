/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class LibroServicio {

    public Libro altaLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libroUno = new Libro();
        //llenar atributos de libro
        System.out.println("Introduzca ISBN");
        libroUno.setIsbn(leer.nextInt());
        System.out.println("Introduzca tìtulo");
        libroUno.setTitulo(leer.next());
        System.out.println("Introduzca Autor");
        libroUno.setAutor(leer.next());
        System.out.println("Introduzca numero de paginas");
        libroUno.setNumPaginas(leer.nextInt());
                  
        return libroUno;
    }

}
