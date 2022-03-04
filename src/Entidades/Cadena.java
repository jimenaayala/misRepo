/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Jime
 */
public class Cadena {
    private String frase;
    private int log;

    public Cadena() {
    }

    public Cadena(String frase, int log) {
        this.frase = frase;
        this.log = log;
    }
    //getters and setters

    public String getFrase() {
        return frase;
    }

    public int getLog() {
        return log;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLog(int log) {
        this.log = log;
    }
    

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", log=" + log + '}';
    }
    
    
}
