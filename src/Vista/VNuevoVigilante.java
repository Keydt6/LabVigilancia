/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jose Alejandro
 */
public class VNuevoVigilante extends javax.swing.JFrame {

    /**
     * Creates new form VNuevoVigilante
     */
    public VNuevoVigilante() {
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

        pnlVigilantes = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblVigilantes = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtDirecion = new javax.swing.JTextField();
        jbtEliminar = new javax.swing.JButton();
        lblTelf = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        jbtEliminar1 = new javax.swing.JButton();

        setName("Nuevo Vigilante"); // NOI18N

        pnlVigilantes.setPreferredSize(new java.awt.Dimension(450, 460));
        pnlVigilantes.setLayout(null);

        lblCedula.setText("Cedula");
        pnlVigilantes.add(lblCedula);
        lblCedula.setBounds(60, 190, 90, 20);

        lblVigilantes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVigilantes.setText("Nuevo Vigilante");
        pnlVigilantes.add(lblVigilantes);
        lblVigilantes.setBounds(160, 10, 150, 50);

        lblCodigo.setText("Código");
        pnlVigilantes.add(lblCodigo);
        lblCodigo.setBounds(60, 70, 90, 20);
        pnlVigilantes.add(txtCodigo);
        txtCodigo.setBounds(190, 70, 90, 20);

        lblNombre.setText("Nombre");
        pnlVigilantes.add(lblNombre);
        lblNombre.setBounds(60, 110, 90, 20);
        pnlVigilantes.add(txtNombre);
        txtNombre.setBounds(190, 110, 90, 20);

        lblApellido.setText("Apellido");
        pnlVigilantes.add(lblApellido);
        lblApellido.setBounds(60, 150, 90, 20);
        pnlVigilantes.add(txtApellido);
        txtApellido.setBounds(190, 150, 90, 20);

        lblDireccion.setText("Dirección");
        pnlVigilantes.add(lblDireccion);
        lblDireccion.setBounds(60, 230, 90, 20);
        pnlVigilantes.add(txtCedula);
        txtCedula.setBounds(190, 190, 90, 20);
        pnlVigilantes.add(txtDirecion);
        txtDirecion.setBounds(190, 230, 90, 20);

        jbtEliminar.setText("Cancelar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });
        pnlVigilantes.add(jbtEliminar);
        jbtEliminar.setBounds(260, 340, 100, 40);

        lblTelf.setText("Telefono");
        pnlVigilantes.add(lblTelf);
        lblTelf.setBounds(60, 270, 90, 20);
        pnlVigilantes.add(txtTelf);
        txtTelf.setBounds(190, 270, 90, 20);

        jbtEliminar1.setText("Añadir");
        jbtEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminar1ActionPerformed(evt);
            }
        });
        pnlVigilantes.add(jbtEliminar1);
        jbtEliminar1.setBounds(40, 340, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtEliminarActionPerformed

    private void jbtEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(VNuevoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VNuevoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VNuevoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VNuevoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VNuevoVigilante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtEliminar1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JLabel lblVigilantes;
    private javax.swing.JPanel pnlVigilantes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
