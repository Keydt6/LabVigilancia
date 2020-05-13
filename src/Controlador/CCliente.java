/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VCliente;
import java.awt.Toolkit;
import java.awt.event.*;
import Modelo.Listas;
import Modelo.MCliente;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jesus
 */
public class CCliente implements ActionListener {
    
    Listas li;
    VCliente vc = new VCliente(); //se abre la ventana

public CCliente(Listas li) {
    this.li = li;
    vc.setVisible(true);
    vc.setLocationRelativeTo(null);
    vc.AgregarListener(this);
            DesactivarCampos();
//        Validacion de numeros en el txt rif
        vc.getTxtRif().addKeyListener(new KeyAdapter(){
         
            @Override
            public void keyTyped(KeyEvent e) {
                  char c=e.getKeyChar(); 
              
          if(Character.isLetter(c)) { 
              Toolkit tk = Toolkit.getDefaultToolkit();
              tk.beep();
              e.consume();    
              JOptionPane.showMessageDialog(null,"Ingresa Solo Numeros"); 
            }
    }
                });
        vc.getTxtNombre().addKeyListener(new KeyAdapter(){

@Override
public void keyTyped(KeyEvent e) {
                  char c=e.getKeyChar(); 
              
          if(Character.isDigit(c)) { 
              Toolkit tk = Toolkit.getDefaultToolkit();
              tk.beep();
              e.consume();    
              JOptionPane.showMessageDialog(null,"Ingresa Solo Letras"); 
            }
    }

    });
    }
public void ActivarCampos()
    {
       vc.getTxtNombre().setEnabled(true);
       vc.getBtnEliminar().setVisible(true);
       vc.getBtnSalir().setVisible(true);
       vc.getBtnModificar().setVisible(true);
       vc.getCmbTipoCli().setEnabled(true);
       vc.getTxtRif().setEnabled(false);
       vc.getBtnVerificar().setVisible(true);
       vc.getTxtTelefono().setEnabled(true);
       vc.getTxtDir().setEnabled(true);
      }
    private String tipoCliente(int t){
        
         String n="";
        switch (t) {
            case 1:
                n="Urbanizacion";
                break;
            case 2:
                n="Edificio";
                break;
            case 3:
                n="Tienda";
                break;
            default:
                break;
        }
         return n;     
         
    }
          
    public void DesactivarCampos()
    {
       vc.getTxtNombre().setEnabled(false);
       vc.getBtnEliminar().setVisible(false);
       vc.getBtnSalir().setVisible(false);
       vc.getBtnModificar().setVisible(false);
       vc.getCmbTipoCli().setEnabled(false);
       vc.getTxtRif().setEnabled(true);
       vc.getBtnVerificar().setVisible(true);
       vc.getCmbJ().setEnabled(true);
       vc.getTxtTelefono().setEnabled(false);
       vc.getTxtDir().setEnabled(false);
    }
    
    public void Limpiar()
    {
       vc.getTxtRif().setText("");
       vc.getTxtNombre().setText("");
       vc.getBtnVerificar().setText("Verificar");
       vc.getCmbTipoCli().setSelectedIndex(0);
       vc.getTxtTelefono().setText("");
       vc.getTxtDir().setText("");
       vc.getCmbJ().setSelectedIndex(0);
        DesactivarCampos();
    }
public int BuscarCliente()
    {
        String rif=vc.getTxtRif().getText();
        char j = vc.getCmbJ().getSelectedItem().toString().charAt(0);
        int pos=-1;
        
        if(vc.getTxtRif().getText().equals(""))
            pos=-3;
        else  
        {        
         for (int i = 0; i < li.getListaCliente().size(); i++) 
           {
               
               String ri= li.getListaCliente().get(i).getIdCliente();
               if(j==ri.charAt(0) && rif.equals(ri.substring(2))){
                   pos=i;
               }
           }   
         }return pos;
    }
    
    public void clienteEncontrado(int r){
        switch (r) {
            case -3:
                JOptionPane.showMessageDialog(null," Completar Campo" );
                break;
            case -1:
                JOptionPane.showMessageDialog(null," Cliente no Existe" );
                vc.getBtnVerificar().setText("Agregar");
                ActivarCampos();
                vc.getCmbJ().setEnabled(false);
                vc.getBtnModificar().setVisible(false);
                vc.getBtnEliminar().setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Cliente Existe" );
                //  vc.getTxtNombre().getText() = li.getListaCliente().get(pos);
                ActivarCampos();
                MCliente mc=li.getListaCliente().get(r);
                vc.getTxtNombre().setText(mc.getNombreCliente());
                vc.getCmbTipoCli().setSelectedIndex(mc.getIdTipo());
                vc.getTxtTelefono().setText(mc.getTelefono());
                vc.getTxtDir().setText(mc.getDireccion());
                vc.getBtnVerificar().setVisible(false);
                vc.getTxtRif().setEnabled(false);  
                vc.getCmbJ().setEnabled(false);
                break;
        }
    }
    public void Agregar()
    {
        String j=vc.getCmbJ().getSelectedItem().toString();
        String rif=vc.getTxtRif().getText();
         String nombre=vc.getTxtNombre().getText();  
         int tp=vc.getCmbTipoCli().getSelectedIndex();
         String tel=vc.getTxtTelefono().getText();
         String dir=vc.getTxtDir().getText();
   
        
        if(vc.getTxtNombre().getText().equals("")|| tp==0) //and (vc.getCmbTipoCli().getSelectedIndex().equals(0)) )
          JOptionPane.showMessageDialog(null," Completar Campo" );
       
        else
        {
         MCliente mc = new MCliente(j+"-"+rif,nombre,tp,tel,dir);
         int i=li.getListaCliente().size();
         li.getListaCliente().add(i,mc);
        
         JOptionPane.showMessageDialog(null,"Cliente Agregado exitosamente");
         Limpiar();
        }
    }
    
    public void Eliminar(int r)
    {
         
        if(r==-1)
        { JOptionPane.showMessageDialog(null,"Cliente no existe para eliminar");
        Limpiar();
           
        }
        else
        {li.getListaCliente().remove(r);
         JOptionPane.showMessageDialog(null,"Eliminado exitosamente");
         Limpiar();
        
        }
    }
    
    public void Modificar(int r)
    { 
        char j=vc.getCmbJ().getSelectedItem().toString().charAt(0);
        String jl= vc.getCmbJ().getSelectedItem().toString();
        String rif=vc.getTxtRif().getText();
        String nombre=vc.getTxtNombre().getText();  
        int tp=vc.getCmbTipoCli().getSelectedIndex();
        String tel=vc.getTxtTelefono().getText();
         String dir=vc.getTxtDir().getText();
         
        
        if(vc.getTxtNombre().getText().equals("")|| tp==0)
            JOptionPane.showMessageDialog(null," Completar Campo" );
        else{        
           MCliente mc=li.getListaCliente().get(r);
           mc.setNombreCliente(nombre);
           mc.setIdCliente(jl+"-"+rif);
           mc.setIdTipo(tp);
           mc.setTelefono(tel);
           mc.setDireccion(dir);
           
           JOptionPane.showMessageDialog(null,"Modificado exitosamente");
           Limpiar();
        }
    }
    
    @Override
    public void actionPerformed (ActionEvent evt) {
        
     /*Object fuente= evt.getSource();
     if (fuente== vc.getBtnVerificar())
     vc.dispose();
    */
     if(evt.getSource().equals(vc.getBtnVerificar()))
        {
            if(vc.getBtnVerificar().getText().equals("Verificar")){                
                clienteEncontrado(BuscarCliente());}
                 else
                     Agregar();
           
        } 
        
        if(evt.getSource().equals(vc.getBtnEliminar()))
        {
            Eliminar(BuscarCliente());
        }
        
        if(evt.getSource().equals(vc.getBtnModificar()))
        {
            Modificar(BuscarCliente());
        }
        if(evt.getSource().equals(vc.getBtnSalir())){
            vc.dispose();
        }
            
        
    }
}

