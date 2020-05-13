/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VDetPagos;
import java.awt.event.*;
/**
 *
 * @author Jesus
 */
public class CDetPagos implements ActionListener{
    
    VDetPagos vdp = new VDetPagos();

    public CDetPagos() {
    vdp.setVisible(true);
    vdp.setLocationRelativeTo(null);
    vdp.AgregarListener(this);
    }
    
    public void  actionPerformed (ActionEvent evt){
        
    }
    
}
