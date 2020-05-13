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
public abstract class MPersona {
    
    //Atributos
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected String telf;
    
    public MPersona() {
        nombre = "";
        apellido = "";
        cedula = "";
        direccion = "";
        telf = "";
    }
    
    public MPersona(String nombre, String apellido, String cedula, String dir, String telf) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.direccion = dir;
        this.telf = telf;
    }
    
    //Metodos Set y Get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccon(String dir){
        this.direccion = dir;
    }
    
    public String getTelf(){
        return telf;
    }
    
    public void setTefl(String telf){
        this.telf = telf;
    }
}
