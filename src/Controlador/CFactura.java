
package Controlador;
import Vista.VFactura;
import java.awt.event.*;

public class CFactura implements ActionListener {
    
    VFactura vf = new VFactura();
    
  public CFactura(){
      vf.setVisible(true);
      vf.setLocationRelativeTo(null);
      vf.AgregarListener(this);
  }
 @Override

    public void actionPerformed (ActionEvent evt) {
        
     Object fuente= evt.getSource();
     if (fuente == vf.getBtnVerificar())
     vf.dispose();
    
        
    }
}



