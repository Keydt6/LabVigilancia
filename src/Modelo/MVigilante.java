/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;

/**
 *
 * @author jose Alejandro
 */
public class MVigilante extends MPersona {
    
    //Atributos
    private String idVigilante;
    private String telefono;
    private ArrayList fecha = new ArrayList();
    private ArrayList fechaD = new ArrayList();
    
    //Metodos Get y Set
    
    public MVigilante() {
        super("","","","","");
        this.idVigilante = "";
    }
    
    public MVigilante(String nombre, String apellido, String cedula, String idVigilante,String dir, String telf) {
        super(nombre,apellido,cedula,dir,telf);
        this.idVigilante = idVigilante;
        
    }

    //Metodos Set y Get

    public String getIdVigilante() {
        return idVigilante;
    }

    public void setIdVigilante(String idVigilante) {
        this.idVigilante = idVigilante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha(int i) {
        return (String) fecha.get(i);
    }

    public void setFecha(String fecha) {
        this.fecha.add(fecha);
    }

    public String getFechaD(int i) {
        return (String) fechaD.get(i);
    }

    public void setFechaD(String fe) {
        this.fechaD.add(fe);
    }
    
    
    
}
