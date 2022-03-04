/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jime
 */
public class PersonaDate {
    private String name;
    private Calendar fechNac;

    public PersonaDate() {
    }

    public PersonaDate(String name, Calendar fechNac) {
        this.name = name;
        this.fechNac = fechNac;
    }

    public String getName() {
        return name;
    }

    public Calendar getFechNac() {
        return fechNac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFechNac(Calendar fechNac) {
        this.fechNac = fechNac;
    }    
    
}
