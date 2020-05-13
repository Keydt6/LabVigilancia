/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class VCliente extends javax.swing.JFrame {

    /**
     * Creates new form VCliente
     */
    public VCliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        txtRif = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cmbTipoCli = new javax.swing.JComboBox();
        btnVerificar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbJ = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(450, 460));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(510, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cliente");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 110, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Dirección:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 250, 80, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("R.I.F:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 70, 60, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 120, 60, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 210, 60, 20);
        jPanel1.add(txtDir);
        txtDir.setBounds(200, 250, 90, 20);

        txtRif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRifActionPerformed(evt);
            }
        });
        jPanel1.add(txtRif);
        txtRif.setBounds(230, 70, 90, 20);
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(200, 210, 90, 20);

        cmbTipoCli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1.Urbanización", "2.Edificio", "3.Tienda" }));
        jPanel1.add(cmbTipoCli);
        cmbTipoCli.setBounds(200, 170, 90, 20);

        btnVerificar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar);
        btnVerificar.setBounds(340, 70, 90, 23);

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(40, 300, 100, 30);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(200, 300, 90, 30);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSalir.setText("SALIR");
        jPanel1.add(btnSalir);
        btnSalir.setBounds(330, 300, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Tipo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 170, 60, 17);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(200, 120, 90, 20);

        cmbJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J", "V", "E" }));
        jPanel1.add(cmbJ);
        cmbJ.setBounds(160, 70, 50, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtRifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRifActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCliente().setVisible(true);
            }
        });
    }
    
    public void AgregarListener (ActionListener accion) {
        btnVerificar.addActionListener(accion);
        btnModificar.addActionListener(accion);
        btnEliminar.addActionListener(accion);
        btnSalir.addActionListener(accion);
    }
    
    public JButton getBtnVerificar (){
    return btnVerificar; 
    }
    
    public JButton getBtnSalir(){
        return btnSalir;
    }
    
    public JButton getBtnModificar(){
        return btnModificar;
    }
    
    public JButton getBtnEliminar(){
        return btnEliminar;
    }
    public JTextField getTxtRif() {
        return txtRif;
    }
    public JTextField getTxtNombre(){
        return txtNombre;
    }
    public JComboBox<String> getCmbTipoCli() {
        return cmbTipoCli;
    }
    public JTextField getTxtTelefono(){
        return txtTelefono;
    }
    public JTextField getTxtDir(){
        return txtDir;
    }
     public JComboBox<String> getCmbJ() {
        return cmbJ;
    }
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cmbJ;
    private javax.swing.JComboBox cmbTipoCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRif;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
