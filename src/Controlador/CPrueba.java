/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VServicio;
import java.awt.event.*;
/**
 *
 * @author Usuario
 */
public class CPrueba implements ActionListener{
    private VServicio vs = new VServicio();
    
    public CPrueba() {
        vs.setVisible(true);
        vs.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent evt){
        
    }
    
}
