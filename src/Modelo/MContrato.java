/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.math.*;

/**
 *
 * @author Usuario
 */
public class MContrato {
    
    private String idContrato;
    private String idCliente;
    private int tipoCliente;
    private int nroVigilantes;
    private int nroBicis;
    private int nroRadios;
    private String fecha;
    private int nroDias;
    private MMontoServicio mms;
    private int horas;
    private int horasE;
    private double MontoAPagar;
 
    public MContrato()
    {
        this.idContrato = "";
        this.idCliente = "";
        this.tipoCliente = 0;
        this.nroVigilantes = 0;
        this.nroBicis = 0;
        this.nroRadios = 0;
        this.fecha = "";
        this.nroDias=0;
    }

    public MContrato(String idContrato, String idCliente, int tipoCliente, int nroVigilantes, int nroBicis, int nroRadios, String fecha, int nroDias) {
        this.idContrato = idContrato;
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.nroVigilantes = nroVigilantes;
        this.nroBicis = nroBicis;
        this.nroRadios = nroRadios;
        this.fecha = fecha;
        this.nroDias = nroDias;
        this.mms = mms;
    }
    
    

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getNroVigilantes() {
        return nroVigilantes;
    }

    public void setNroVigilantes(int nroVigilantes) {
        this.nroVigilantes = nroVigilantes;
    }

    public int getNroBicis() {
        return nroBicis;
    }

    public void setNroBicis(int nroBicis) {
        this.nroBicis = nroBicis;
    }

    public int getNroRadios() {
        return nroRadios;
    }

    public void setNroRadios(int nroRadios) {
        this.nroRadios = nroRadios;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void CalcularHoras() {
       if(tipoCliente==1 || tipoCliente==2) {
        horas=nroVigilantes*2*7;
        horasE=nroVigilantes*2*5;
       } else {
         horas=nroVigilantes*7;
         horasE=nroVigilantes*5;  
       }
    }   
    
    public double CalcularMonto(MMontoServicio mms) {
        //Calculamos el monto de las bicicletas y radios
        double montoBici=0;
        double montoRadio=0;
        if(tipoCliente==1 || tipoCliente==2) {
            montoBici=nroDias*2*mms.getMontoBici();
            montoRadio=nroDias*2*mms.getMontoRadio();
        } else {
            montoBici=nroDias*mms.getMontoBici();
            montoRadio=nroDias*mms.getMontoRadio();
        }

        //Calcular monto a pagar por dia
        double montoTotalDiario=horas*mms.getMontoHora()+horasE*mms.horaExtra();
        //Calcular monto del mes
        double montoTotal=(montoTotalDiario*nroDias)+montoBici+montoRadio;
       //Calcular el monto total mas la ganancia de la empresa
        double montoTotalGanancia= montoTotal*mms.getPorcGanancia();
        //Añadimos el IVA
        double montoTotalIva=montoTotalGanancia*1.12;
        //Retornamos el total que pagara el cliente
        return Math.round(montoTotalIva);
    }

    public double getMontoAPagar() {
        return MontoAPagar;
    }

    public void setMontoAPagar(double MontoAPagar) {
        this.MontoAPagar = MontoAPagar;
    }
    
   
    
    
}
