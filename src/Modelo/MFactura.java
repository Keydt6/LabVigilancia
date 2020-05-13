/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jose Alejandro
 */
public class MFactura {
    
    //Atributos
    private String nroFact;
    private String fecha;
    private double montoTotal;
    
    public MFactura() {
        this.nroFact = "";
        this.fecha ="";
        this.montoTotal = 0.00;
    }
    
    public MFactura (String nroFact, String fecha) {
        this.nroFact = nroFact;
        this.fecha = fecha;
    }

       //Atributos Get y Set
    public double getMontoTotal() {    
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getNroFact() {
        return nroFact;
    }

    public void setNroFact(String nroFact) {
        this.nroFact = nroFact;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
