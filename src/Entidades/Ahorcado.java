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
public class Ahorcado {
    private String [] palabra;
    private int cantLetrEnc;
    private int cantIntentos;
    private int cantIntentosrestantes;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetrEnc, int cantIntentos) {
        this.palabra = palabra;
        this.cantLetrEnc = cantLetrEnc;
        this.cantIntentos = cantIntentos;
    }
    
    public Ahorcado (int largoVector, int intentos){
        this.palabra = new String[largoVector];
        this.cantIntentos=intentos;
        this.cantIntentosrestantes=intentos;
        
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCantLetrEnc() {
        return cantLetrEnc;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public int getCantIntentosrestantes() {
        return cantIntentosrestantes;
    }

    public void setCantIntentosrestantes(int cantIntentosrestantes) {
        this.cantIntentosrestantes = cantIntentosrestantes;
    }    

    public void setPalabra(String letra, int pos) {
        palabra[pos] = letra;
    }

    public void setCantLetrEnc(int cantLetrEnc) {
        this.cantLetrEnc = cantLetrEnc;
    }

    public void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }
    
    
    
    
}
