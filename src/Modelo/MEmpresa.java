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
public class MEmpresa {
    
    //Atributos
    private String idRif;
    private String nombre;
    private String telefono;
    
    public MEmpresa() {
        this.idRif = "";
        this.nombre = "";
        this.telefono = "";
    }
    
    public MEmpresa (String idRif, String nombre, String telefono) {
        this.idRif = idRif;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    //Metodos Set y Get

    public String getIdRif() {
        return idRif;
    }

    public void setIdRif(String idRif) {
        this.idRif = idRif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
