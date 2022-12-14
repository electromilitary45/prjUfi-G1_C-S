/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM3;

import prj.proy_cs.JF_menu;

/**
 *
 * @author Derek
 */
public class JF_menuFacturacion extends javax.swing.JFrame {

    /**
     * Creates new form JF_menuFacturacion
     */
    public JF_menuFacturacion() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_agregarFactura = new javax.swing.JLabel();
        btn_editarFactura = new javax.swing.JLabel();
        btn_desactivarFactura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 170));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("RETROCEDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_agregarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_rutinaAgregar.png"))); // NOI18N
        btn_agregarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarFacturaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_agregarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btn_editarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_rutinaEditar.png"))); // NOI18N
        btn_editarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarFacturaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_editarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        btn_desactivarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_rutinaDesactivar.png"))); // NOI18N
        btn_desactivarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_desactivarFacturaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_desactivarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR FACTURA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESACTIVAR FACTURA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EDITAR FACTURA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarFacturaMouseClicked
        // TODO add your handling code here:
        new JF_agregarFactura().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_agregarFacturaMouseClicked

    private void btn_editarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarFacturaMouseClicked
        // TODO add your handling code here:
        new JF_modificarFactura().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_editarFacturaMouseClicked

    private void btn_desactivarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_desactivarFacturaMouseClicked
        // TODO add your handling code here:
        dispose();
        new JF_desactivarFactura().setVisible(true);
    }//GEN-LAST:event_btn_desactivarFacturaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new JF_menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_menuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_menuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_menuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_menuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_menuFacturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_agregarFactura;
    private javax.swing.JLabel btn_desactivarFactura;
    private javax.swing.JLabel btn_editarFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
