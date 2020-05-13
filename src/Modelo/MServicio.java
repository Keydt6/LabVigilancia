/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;

/**
 *
 * @author jose Alejandro
 */
public class MServicio {
    
    //Atributos
    private String idContrato;
    private String idCliente;
    private String idTurno;
    private ArrayList<String> idVigilantes = new ArrayList<>();
    private String fecha;
    private double montoVigilantes;
    private double montoBici;
    private double montoRadio;
    
    public MServicio() {
        this.idContrato = "";
        this.idCliente = "";
        this.idTurno = "";
        this.fecha = "";
    }

    public MServicio(String idServicio,
                     String idCliente, 
                     String idTurno,  
                     String fecha,
                     double montoVigilantes,
                     double montoBici,
                     double montoRadio) {
        this.idContrato = idServicio;
        this.idCliente = idCliente;
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.montoVigilantes=montoVigilantes;
        this.montoBici = montoBici;
        this.montoRadio = montoRadio;
    }
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdTurno() {
        return idTurno;
    }

    //Metodos Get y Set
    public void setIdTurno(String idTurno) {
        this.idTurno = idTurno;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }




    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getIdVigilantes() {
        return idVigilantes;
    }

    public void setIdVigilantes(ArrayList<String> idVigilantes) {
        this.idVigilantes = idVigilantes;
    }

    
      
    
    public double calHora(MMontoServicio mm){
        return 7 * mm.getMontoHora();
    }
    
    public double calHoraExtra(MMontoServicio mm){
        return 5 * mm.horaExtra();
    }

    public double getMontoVigilantes() {
        return montoVigilantes;
    }

    public void setMontoVigilantes(double montoVigilantes) {
        this.montoVigilantes = montoVigilantes;
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
    
    
}
    
