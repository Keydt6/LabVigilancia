/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author jose Alejandro
 */
public class VMenuPrincipal2 extends javax.swing.JFrame {
    
    
    //Metodo para agregar un Listener
    public void agregarListener(ActionListener accion) {
        //Agregamos un listener al menu de cliente
        mnuClientes.addActionListener(accion);
        mnuVigilantes.addActionListener(accion);
        
        mnuNuevoCont.addActionListener(accion);
        
        mnuGenerarFact.addActionListener(accion);
        mnuDetPagos.addActionListener(accion);
        
        mnuAsigTurnos.addActionListener(accion);
        
        mnuConsultaVig.addActionListener(accion);
        
        mnuInfo.addActionListener(accion);
        jMenuItem1.addActionListener(accion);
    }
    
    public JMenuItem getMnuCliente() {
        return mnuClientes;
    }
    
    public JMenuItem getMnuVigilante() {
        return mnuVigilantes;
    }
    
    public JMenuItem getMnuNuevoCont(){
        return mnuNuevoCont;
    }
       
    public JMenuItem getMnuFacturacion(){
        return mnuGenerarFact;
    }
    
    public JMenuItem getMnuDetPagos(){
        return mnuDetPagos;
    }

    public JMenuItem getMnuAsigTurnos() {
        return mnuAsigTurnos;
    }
    
    public JMenuItem getMnuConsultaVig(){
        return mnuConsultaVig;
    }

    public JMenu getMnuInfo() {
        return mnuInfo;
    }
    
    public JMenuItem getMnuDlucca(){
        return jMenuItem1;
    }

    /**
     * Creates new form MenuPrincipal2
     */
    public VMenuPrincipal2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuRegistrar = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenuItem();
        mnuVigilantes = new javax.swing.JMenuItem();
        mnuContratacion = new javax.swing.JMenu();
        mnuNuevoCont = new javax.swing.JMenuItem();
        mnuFacturacion = new javax.swing.JMenu();
        mnuGenerarFact = new javax.swing.JMenuItem();
        mnuDetPagos = new javax.swing.JMenuItem();
        mnuServicios = new javax.swing.JMenu();
        mnuAsigTurnos = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuConsultaVig = new javax.swing.JMenuItem();
        mnuInfo = new javax.swing.JMenu();
        mnuDesarrolladores = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-800-450.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mnuRegistrar.setText("Registrar");
        mnuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarActionPerformed(evt);
            }
        });

        mnuClientes.setText("Clientes");
        mnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClientesActionPerformed(evt);
            }
        });
        mnuRegistrar.add(mnuClientes);

        mnuVigilantes.setText("Vigilantes");
        mnuRegistrar.add(mnuVigilantes);

        jMenuBar1.add(mnuRegistrar);

        mnuContratacion.setText("Contratación");

        mnuNuevoCont.setText("Nuevo Contrato");
        mnuNuevoCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoContActionPerformed(evt);
            }
        });
        mnuContratacion.add(mnuNuevoCont);

        jMenuBar1.add(mnuContratacion);

        mnuFacturacion.setText("Facturación");

        mnuGenerarFact.setText("Generar Factura");
        mnuGenerarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGenerarFactActionPerformed(evt);
            }
        });
        mnuFacturacion.add(mnuGenerarFact);

        mnuDetPagos.setText("Detalles de Pago por Cliente");
        mnuDetPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDetPagosActionPerformed(evt);
            }
        });
        mnuFacturacion.add(mnuDetPagos);

        jMenuBar1.add(mnuFacturacion);

        mnuServicios.setText("Servicios");

        mnuAsigTurnos.setText("Asignar Turnos");
        mnuAsigTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsigTurnosActionPerformed(evt);
            }
        });
        mnuServicios.add(mnuAsigTurnos);

        jMenuBar1.add(mnuServicios);

        mnuConsultas.setText("Consultas");

        mnuConsultaVig.setText("Vigilantes");
        mnuConsultas.add(mnuConsultaVig);

        jMenuBar1.add(mnuConsultas);

        mnuInfo.setText("Acerca de Nosotros");

        mnuDesarrolladores.setText("Desarrolladores");
        mnuInfo.add(mnuDesarrolladores);

        jMenuBar1.add(mnuInfo);

        jMenu6.setText("puto d'lucca");

        jMenuItem1.setText("jMenuItem1");
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistrarActionPerformed

    }//GEN-LAST:event_mnuRegistrarActionPerformed

    private void mnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuClientesActionPerformed

    private void mnuNuevoContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuNuevoContActionPerformed

    private void mnuGenerarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGenerarFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuGenerarFactActionPerformed

    private void mnuDetPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDetPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuDetPagosActionPerformed

    private void mnuAsigTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsigTurnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAsigTurnosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenuPrincipal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAsigTurnos;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenuItem mnuConsultaVig;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuContratacion;
    private javax.swing.JMenuItem mnuDesarrolladores;
    private javax.swing.JMenuItem mnuDetPagos;
    private javax.swing.JMenu mnuFacturacion;
    private javax.swing.JMenuItem mnuGenerarFact;
    private javax.swing.JMenu mnuInfo;
    private javax.swing.JMenuItem mnuNuevoCont;
    private javax.swing.JMenu mnuRegistrar;
    private javax.swing.JMenu mnuServicios;
    private javax.swing.JMenuItem mnuVigilantes;
    // End of variables declaration//GEN-END:variables
}
