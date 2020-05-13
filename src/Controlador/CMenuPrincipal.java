/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
import java.awt.event.*;
import Modelo.*;
import java.lang.Runtime;


/**
 *
 * @author jose Alejandro
 */
public class CMenuPrincipal implements ActionListener {
    
    private Listas li;
    private VMenuPrincipal mp;
    private MCliente mc;
    
    public CMenuPrincipal() {
        li = new Listas();
        li.CargarClientes();
        li.CargarVigilantes();
       // li.cargarServicios();
        GuardarArchivo();

        
        mp  = new VMenuPrincipal();
        //Abrimos pantalla principal
        mp.setVisible(true);
        //Centramos la pantalla
        mp.setLocationRelativeTo(null);
        //Creamos el Listener
        mp.agregarListener(this);
        
        
    }
    
      @Override
      //Codigo a ejecutar cuando se hace Click
     
      public void actionPerformed(ActionEvent evt){   
          
       Object fuente = evt.getSource();
       
       if (fuente == mp.getMnuCliente()) {
            CCliente cc = new CCliente(li);
       }
       
       if (fuente == mp.getMnuVigilante()) {
          
           CVigilante cv = new CVigilante(li);
       }
       
       if (fuente == mp.getMnuNuevoCont()){
          CContrato cct = new CContrato(li);
       }
       
       if (fuente == mp.getMnuFacturacion()) {
           CFactura cf = new CFactura();
       }
       
       if (fuente == mp.getMnuDetPagos()){
           CDetPagos cdp = new CDetPagos();
       }
       
       if(fuente == mp.getMnuConsultaVig()){
           CConsulta ccon = new CConsulta();
       }
       
       if(fuente == mp.getMnuNomina())
       {
           CNomina cn = new CNomina(li);
       }
           
       if(fuente == mp.getMnuDesarrolladores())
       {
           //CPrueba cp = new CPrueba();
       }
    }   
      
      
      public void GuardarArchivo() {
        //Creamos un nuevo hilo
        Thread hilo = new Thread (new Runnable () {
                 @Override
                 public void run () {
                     
                    //Codigo a ejecutar cuando se cierra el programa
                    li.GuardarArchivoCliente();
                    li.GuardarArchivoVigilante();
                  // li.GuargarArchivoServicios();
                 }
                 });
                    //Ejecutamos el codigo
                    Runtime.getRuntime().addShutdownHook(hilo);
}

}


