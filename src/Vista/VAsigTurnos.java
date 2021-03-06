/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class VAsigTurnos extends javax.swing.JFrame {

    /**
     * Creates new form VAsigTurnos
     */
    public VAsigTurnos() {
        initComponents();
    }

    public JButton getBtnAsig() {
        return btnAsig;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JDateChooser getJdcFechaAsig() {
        return jdcFechaAsig;
    }

    public JComboBox<String> getCboClientes() {
        return cboClientes;
    }

    public void AgregarListener(ActionListener accion){
        btnAsig.addActionListener(accion);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAsigTurnos = new javax.swing.JPanel();
        lblAsigTurnos = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        cboClientes = new javax.swing.JComboBox<String>();
        btnAsig = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFechaAsig = new javax.swing.JLabel();
        jspTurnosAsig = new javax.swing.JScrollPane();
        jtbTurnosAsig = new javax.swing.JTable();
        jdcFechaAsig = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar Turnos");
        setName("frmAsigTurnos"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAsigTurnos.setPreferredSize(new java.awt.Dimension(570, 500));
        pnlAsigTurnos.setLayout(null);

        lblAsigTurnos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAsigTurnos.setText("Asignar Turnos");
        pnlAsigTurnos.add(lblAsigTurnos);
        lblAsigTurnos.setBounds(200, 30, 170, 30);

        lblCliente.setText("Cliente");
        pnlAsigTurnos.add(lblCliente);
        lblCliente.setBounds(140, 100, 40, 20);

        cboClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        pnlAsigTurnos.add(cboClientes);
        cboClientes.setBounds(310, 100, 110, 20);

        btnAsig.setText("Asignar");
        pnlAsigTurnos.add(btnAsig);
        btnAsig.setBounds(100, 420, 69, 23);

        btnSalir.setText("Salir");
        pnlAsigTurnos.add(btnSalir);
        btnSalir.setBounds(380, 420, 70, 23);

        lblFechaAsig.setText("Fecha Asignación");
        pnlAsigTurnos.add(lblFechaAsig);
        lblFechaAsig.setBounds(140, 170, 90, 14);

        jtbTurnosAsig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jspTurnosAsig.setViewportView(jtbTurnosAsig);

        pnlAsigTurnos.add(jspTurnosAsig);
        jspTurnosAsig.setBounds(50, 270, 470, 120);
        pnlAsigTurnos.add(jdcFechaAsig);
        jdcFechaAsig.setBounds(340, 170, 81, 20);

        getContentPane().add(pnlAsigTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 501));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VAsigTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAsigTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAsigTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAsigTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAsigTurnos().setVisible(true);
            }
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsig;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboClientes;
    private com.toedter.calendar.JDateChooser jdcFechaAsig;
    private javax.swing.JScrollPane jspTurnosAsig;
    private javax.swing.JTable jtbTurnosAsig;
    private javax.swing.JLabel lblAsigTurnos;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFechaAsig;
    private javax.swing.JPanel pnlAsigTurnos;
    // End of variables declaration//GEN-END:variables
}
