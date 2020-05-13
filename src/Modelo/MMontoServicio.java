/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class MMontoServicio {
    private double montoBici;
    private double montoRadio;
    private double montoHora;
    private double porcGanancia;
    
public MMontoServicio(){
    this.montoBici = 2000;
    this.montoRadio = 1000;
    this.montoHora = 1500;
    this.porcGanancia = 1.30;
}
    public double getMontoBici() {
        return montoBici;
    }

    public void setMontoBici(double montoBici) {
        this.montoBici = montoBici;
    }

    public double getMontoRadio() {
        return montoRadio;
    }

    public void setMontoRadio(double montoRadio) {
        this.montoRadio = montoRadio;
    }

    public double getMontoHora() {
        return montoHora;
    }

    public void setMontoHora(double montoHora) {
        this.montoHora = montoHora;
    }
    
    public double horaExtra(){
        return montoHora * 1.30;
    }

    public double getPorcGanancia() {
        return porcGanancia;
    }

    public void setPorcGanancia(double porcGanancia) {
        this.porcGanancia = porcGanancia;
    }
    
}
