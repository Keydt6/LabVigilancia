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
public class MCliente {
    
    //Atributos
    private String idCliente;
    private int idTipo;
    private String telefono;
    private String direccion;
    private String nombre;
    
    public MCliente() {
        this.idCliente = "";
        this.idTipo = 0;
        this.telefono = "";
        this.direccion = "";
        this.nombre = "";
    }
    
    public MCliente(String idCliente,String nom, int idTipo, String telefono, String direccion) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nom;
    }
    
    //Metodos Set y Get
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente(){
        return nombre;
    }
    
    public void setNombreCliente(String nom){
        this.nombre = nom;
    }
    
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
