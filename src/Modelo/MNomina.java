/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class MNomina {
    private double montoSemanal;
    private String idVigilante;
    
    public MNomina()
    {
        this.idVigilante = "";
        this.montoSemanal = 0.00;
    }
    
    public double getMontoSemanal() {
        return montoSemanal;
    }

    public void setMontoSemanal(double montoSemanal) {
        this.montoSemanal = montoSemanal;
    }

    public String getIdVigilante() {
        return idVigilante;
    }

    public void setIdVigilante(String idVigilante) {
        this.idVigilante = idVigilante;
    }
    
    
}
