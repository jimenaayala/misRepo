/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.PersonaDate;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PersonaDateServicio {

    public PersonaDate crearPersona() {
        Scanner leer = new Scanner(System.in);
        Calendar fechNac = new GregorianCalendar();
        PersonaDate p = new PersonaDate();
        System.out.println("Ingrese Nombre:");
        p.setName(leer.nextLine());
        System.out.println("Ingrese dias, mes y año de nacimiento de la persona:");
        fechNac.set(Calendar.DATE, leer.nextInt());
        fechNac.set(Calendar.MONTH, (leer.nextInt() - 1));
        fechNac.set(Calendar.YEAR, leer.nextInt());
        p.setFechNac(fechNac);
        return p;
    }

    public int calcularEdad(PersonaDate p) {
        int edad = 0;
        Date fechAcual = new Date();
        Period anios = Period.between(LocalDate.of(p.getFechNac().get(Calendar.YEAR), p.getFechNac().get(Calendar.MONTH), p.getFechNac().get(Calendar.DATE)), LocalDate.now());
        edad = Integer.parseInt(String.format("%d", anios.getYears()));
        return edad;
        /*El API de Java 8 es muy útil para calcular esta operación. Bastaría con usar la operación between de la clase Period del siguiente modo:
                Period edad = Period.between(LocalDate.of(1987, 4, 8), LocalDate.now());
                System.out.println(String.format("%d años, %d meses y %d días",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays()));*/
    }

    public boolean menorQue(int edad, PersonaDate p) {
        boolean esMenor = false;
        if (calcularEdad(p) > edad) {
            esMenor = true;
        }
        return esMenor;
    }
}
