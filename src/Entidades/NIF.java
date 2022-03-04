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
public class NIF {
    private long DNI;
    private String NIF;

    public NIF() {
    }

    public NIF(long DNI, String NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public String getNIF() {
        return NIF;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", NIF=" + NIF + '}';
    }
    
}
