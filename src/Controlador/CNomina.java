/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import Vista.VNomina;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class CNomina implements ActionListener{
    
    private Listas li;
    private VNomina vn = new VNomina();
    private MMontoServicio mms = new MMontoServicio();

    public CNomina(Listas li)
    {
        this.li = li;
        vn.setVisible(true);
        vn.setLocationRelativeTo(null);
        vn.AgregarListener(this);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource().equals(vn.getBtnConsultaNomina()))
        {
            if(validarConsulta())
                consultaNomina();
        }
        
        if(evt.getSource().equals(vn.getBtnCancelar()))
        {
         limpiar();   
        }
        
        if(evt.getSource().equals(vn.getBtnSalir()))
        {
            vn.dispose();
        }
    }
    
    public Listas getLi() {
        return li;
    }

    public void setLi(Listas li) {
        this.li = li;
    }

    public void limpiar()
    {
        vn.getTxtIdVig().setText("");
        vn.getRbtMensual().setSelected(false);
        vn.getRbtSemanal().setSelected(false);
        
    }
    
    public boolean validarConsulta()
    {
        if(vn.getTxtIdVig().getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "¡Complete el campo Código de Vigilante!");
            return false;
        }
        
        if(vn.getRbtMensual().isSelected() == false && vn.getRbtSemanal().isSelected() == false)
        {
             JOptionPane.showMessageDialog(null, "¡Elija el Tipo de Periodo!");
             return false;
        }
        
        return true;
    }
    
    public void consultaNomina()
    {       
        int i = 0; //variable de iteración
        int k = li.getListaServicios().size();
        
        double monHoras = 0.00;
        double monHExtra = 0.00;
        Vector aux = new Vector();
        
        DefaultTableModel tabla = new DefaultTableModel();
        MServicio ms;
        
        int a = 0; //variable de iteración
        int b = 0;
        int cont = 0; //cuanta cuantos servicios en los que trabajo un vigilante
        
        while(i < k) //ciclo que recorre todos los servicios que prestaron los vigilantes
        {
            ms = li.getListaServicios().get(i);
            b = ms.getIdVigilantes().size();
            
            while( a <  b) //ciclo que verifica si el vigilante trabajo en dicho servicio 
            {
                if(vn.getTxtIdVig().getText().equals(ms.getIdVigilantes().get(a)))
                {
                    cont++;
                }
            }
            
            monHoras = cont * 7 * mms.getMontoHora();
            monHExtra = cont * 5 * mms.horaExtra();
            //continuar acá
           
                aux.addElement(ms.getIdCliente());
                aux.addElement(ms.calHora(mms));
                aux.addElement(ms.calHoraExtra(mms));
                aux.addElement(ms.getFecha());
                tabla.addRow(aux);
                aux.clear();
                //vn.getJtlNomina().
            
            
        }
        
        vn.getJtlNomina().setModel(tabla);
    }
 
        
}
