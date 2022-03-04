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
public class Calendario {

    private String[] mes = new String[12];
    private String mesSecreto;

    public Calendario() {
        this.mes[0] = "enero";
        this.mes[1] = "febrero";
        this.mes[2] = "marzo";
        this.mes[3] = "abril";
        this.mes[4] = "mayo";
        this.mes[5] = "junio";
        this.mes[6] = "julio";
        this.mes[7] = "agosto";
        this.mes[8] = "setiembre";
        this.mes[9] = "octubre";
        this.mes[10] = "noviembre";
        this.mes[11] = "diciembre";
        this.mesSecreto=this.mes[(int) Math.abs(Math.random()*10)];
        
    }

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    

}
