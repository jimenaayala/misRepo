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
public class Cuenta {
    private int numCuenta;
    private long DNI;
    private double saldoCuenta;
    private int interes;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long DNI, double saldoCuenta, int interes) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoCuenta = saldoCuenta;
        this.interes = interes;
    }
// Getters and Setters
    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public int getInteres() {
        return interes;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", DNI=" + DNI + ", saldoCuenta=" + saldoCuenta + ", interes=" + interes + '}';
    }
    
    
}
