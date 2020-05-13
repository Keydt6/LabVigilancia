/*
    CAsigTurnos, se encarga de asignar a MServicio los vigilantes por turnos, para 
    un cliente

    integrantes:
 */
package Controlador;
import java.awt.event.*;
import Vista.VAsigTurnos;
import Modelo.*;

/**
 *
 * @author Usuario
 */
public class CAsigTurnos implements ActionListener{

    VAsigTurnos va = new VAsigTurnos();
    Listas lis;
    public CAsigTurnos(Listas lis) {
        this.lis = lis;
        va.setVisible(true);
        va.setLocationRelativeTo(null);
        va.AgregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    public boolean verificarAsig()
    {
        boolean asig = false;
        String fecha;
        int k = lis.getListaServicios().size();
    for(int i = 0; i < k; i++)
    {
        
        if(va.getJdcFechaAsig().getDate().equals(lis.getListaServicios().get(i).getFecha()) && va.getCboClientes().getItemListeners().equals(lis.getListaCliente().get(i).getIdCliente()))
        {
            asig = true;
        }
    }
        return asig;
    }
}