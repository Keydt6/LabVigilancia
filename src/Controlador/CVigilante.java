/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VVigilante;
import java.awt.Toolkit;
import java.awt.event.*;
import Modelo.Listas;
import Modelo.MVigilante;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jesus
 */
public class CVigilante implements ActionListener {
    Listas li;
    VVigilante vg = new VVigilante();
    
    public CVigilante(Listas li) {
        this.li = li;
    vg.setVisible(true);
    vg.setLocationRelativeTo(null);
    vg.AgregarListener(this);
            DesactivarCampos();
            //        Validacion de numeros en el txt codigo
        vg.getTxtCodigo().addKeyListener(new KeyAdapter(){
         
            @Override
            public void keyTyped(KeyEvent e) {
                  char c = e.getKeyChar(); 
              
          if(Character.isLetter(c)) { 
              Toolkit tk = Toolkit.getDefaultToolkit();
              tk.beep();
              e.consume();    
              JOptionPane.showMessageDialog(null,"Ingresa Solo Numeros"); 
            }
    }
                });
        vg.getTxtNombre().addKeyListener(new KeyAdapter(){
        @Override
        public void keyTyped(KeyEvent e) {
                  char c = e.getKeyChar(); 
              
          if(Character.isDigit(c)) { 
              Toolkit tk = Toolkit.getDefaultToolkit();
              tk.beep();
              e.consume();    
              JOptionPane.showMessageDialog(null,"Ingresa Solo Letras"); 
            }
        }
    });
        vg.getTxtApellido().addKeyListener(new KeyAdapter(){
                 @Override
        public void keyTyped(KeyEvent e) {
                  char c = e.getKeyChar(); 
              
          if(Character.isDigit(c)) { 
              Toolkit tk = Toolkit.getDefaultToolkit();
              tk.beep();
              e.consume();    
              JOptionPane.showMessageDialog(null,"Ingresa Solo Letras"); 
            }
        }
    });
   }
    
   public void ActivarCampos(){
        vg.getTxtCodigo().setEnabled(false);
        vg.getTxtNombre().setEnabled(true);
        vg.getTxtApellido().setEnabled(true);
        vg.getTxtCedula().setEnabled(true);
        vg.getTxtDireccion().setEnabled(true);
        vg.getTxtTelf().setEnabled(true);
        vg.getJbtBuscar().setVisible(true);
        vg.getJbtModificar().setVisible(true);
        vg.getJbtSalir().setVisible(true);
        vg.getjbtEliminar().setVisible(true);
    }
    
    public void DesactivarCampos(){
        vg.getTxtCodigo().setEnabled(true);
        vg.getTxtNombre().setEnabled(false);
        vg.getTxtApellido().setEnabled(false);
        vg.getTxtCedula().setEnabled(false);
        vg.getTxtDireccion().setEnabled(false);
        vg.getTxtTelf().setEnabled(false);
        vg.getJbtBuscar().setVisible(true);
        vg.getJbtModificar().setVisible(false);
        vg.getJbtSalir().setVisible(true);
        vg.getjbtEliminar().setVisible(false);
    }
   public void Limpiar(){
       vg.getTxtCodigo().setText("");
       vg.getTxtApellido().setText("");
       vg.getTxtNombre().setText("");
       vg.getTxtCedula().setText("");
       vg.getTxtDireccion().setText("");
       vg.getTxtTelf().setText("");
       vg.getJbtBuscar().setText("Buscar");
       DesactivarCampos();
       }
   public int BuscarVig(){
       String cod = vg.getTxtCodigo().getText();
       int pos = -1;
       
       if(vg.getTxtCodigo().getText().equals("")){
           JOptionPane.showMessageDialog(null, "ingrese el codigo del vigilante");
           pos = -6;
       }
       else
           {   
         String c;
         for (int i = 0; i < li.getListaVigilante().size(); i++) 
           {
               
               c = li.getListaVigilante().get(i).getIdVigilante();
               if(cod.equals(c)){
                   pos=i;
               }
           } 
           }return pos;
           }
   public void vEncontrado(int v){
        switch (v) {
            case -3:
                JOptionPane.showMessageDialog(null," Completar Campo" );
                break;
            case -1:
                JOptionPane.showMessageDialog(null," el vigilante no Existe" );
                vg.getJbtBuscar().setText("Agregar");
                ActivarCampos();
                vg.getJbtModificar().setVisible(false);
                vg.getjbtEliminar().setVisible(false);
                break;
            case -6:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vigilante Existe");
                ActivarCampos();
                 MVigilante mv = li.getListaVigilante().get(v);
                vg.getTxtNombre().setText(mv.getNombre());
                vg.getTxtCedula().setText(mv.getCedula());
                vg.getTxtApellido().setText(mv.getApellido());
                vg.getTxtDireccion().setText(mv.getDireccion());
                vg.getTxtTelf().setText(mv.getTelf());
                break;
        }
   }
  public void Incluir(){
      String cod = vg.getTxtCodigo().getText();
      String n = vg.getTxtNombre().getText();
      String a = vg.getTxtApellido().getText();
      String c = vg.getTxtCedula().getText();
      String d = vg.getTxtDireccion().getText();
      String tlf = vg.getTxtTelf().getText();
      
      if(vg.getTxtNombre().getText().equals(""))
          JOptionPane.showMessageDialog(null, "Introduzca el Nombre");
      else
      {
          MVigilante mv = new MVigilante(n,a,c,cod,d,tlf);
          int i = li.getListaVigilante().size();
          li.getListaVigilante().add(i, mv);
          JOptionPane.showMessageDialog(null,"Vigilante Agregado exitosamente");
          Limpiar();
      }
  }
  
  public void Eliminar(int r){
      
      if(r==-1){ 
          JOptionPane.showMessageDialog(null,"Vigilante no existe para eliminar");
               }
      else{
          li.getListaVigilante().remove(r);
          JOptionPane.showMessageDialog(null,"Eliminado exitosamente");
          Limpiar();
         }
    }
 public void Modificar(int v){
      String cod = vg.getTxtCodigo().getText();
      String n = vg.getTxtNombre().getText();
      String a = vg.getTxtApellido().getText();
      String c = vg.getTxtCedula().getText();
      String d = vg.getTxtDireccion().getText();
      String tlf = vg.getTxtTelf().getText();
      
      if(vg.getTxtNombre().getText().equals(""))
          JOptionPane.showMessageDialog(null, "Complete los datos");
      else{
          MVigilante mv = li.getListaVigilante().get(v);
          mv.setNombre(n);
          mv.setIdVigilante(cod);
          mv.setApellido(a);
          mv.setCedula(c);
          mv.setDireccon(d);
          mv.setTelefono(tlf);
          JOptionPane.showMessageDialog(null,"Modificado exitosamente");
          Limpiar();
      }
 }
 
 
   @Override
    public void actionPerformed(ActionEvent evt){
    
    
        
     if(evt.getSource().equals(vg.getJbtBuscar()))
        {
            if(vg.getJbtBuscar().getText().equals("Buscar")){                
                vEncontrado(BuscarVig());
                }
            else
                Incluir();
        } 
      if(evt.getSource().equals(vg.getjbtEliminar()))
        {
            Eliminar(BuscarVig());
        }
      if(evt.getSource().equals(vg.getJbtModificar()))
        {
            Modificar(BuscarVig());
        }
      if(evt.getSource().equals(vg.getJbtSalir()))
      {
          vg.dispose();
      }
     }
    
}
