/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM2;

import prj.proy_cs.cls_funcionesM2;

/**
 *
 * @author usuario
 */
public class JF_menuRutinas extends javax.swing.JFrame {

        /**
         * Creates new form JF_menuRutinas
         */
        public JF_menuRutinas() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                btn_volver = new javax.swing.JButton();
                btn_agregarRutina = new javax.swing.JLabel();
                btn_editarRutina = new javax.swing.JLabel();
                btn_mostrarRutinas = new javax.swing.JLabel();
                btn_desactivarRutina = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(600, 170));
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(51, 51, 51));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                btn_volver.setText("Volver");
                btn_volver.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_volverActionPerformed(evt);
                        }
                });
                jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

                btn_agregarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_rutinaAgregar.png"))); // NOI18N
                btn_agregarRutina.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_agregarRutinaMouseClicked(evt);
                        }
                });
                jPanel1.add(btn_agregarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

                btn_editarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_rutinaEditar.png"))); // NOI18N
                btn_editarRutina.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_editarRutinaMouseClicked(evt);
                        }
                });
                jPanel1.add(btn_editarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

                btn_mostrarRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_lista128.png"))); // NOI18N
                btn_mostrarRutinas.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_mostrarRutinasMouseClicked(evt);
                        }
                });
                jPanel1.add(btn_mostrarRutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

                btn_desactivarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_rutinaDesactivar.png"))); // NOI18N
                btn_desactivarRutina.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_desactivarRutinaMouseClicked(evt);
                        }
                });
                jPanel1.add(btn_desactivarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

                jLabel1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("AGREGAR RUTINA");
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

                jLabel2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("EDITAR RUTINA");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

                jLabel3.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("MOSTRAR RUTINA");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

                jLabel4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("DESACTIVAR RUTINA");
                jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
            // TODO add your handling code here:
            dispose();
            new JF_menuCatalogo().setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_agregarRutinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarRutinaMouseClicked
            // TODO add your handling code here:
            dispose();

    }//GEN-LAST:event_btn_agregarRutinaMouseClicked

    private void btn_mostrarRutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarRutinasMouseClicked
            // TODO add your handling code here:
           new JF_mostrarRutinas().setVisible(true);
    }//GEN-LAST:event_btn_mostrarRutinasMouseClicked

    private void btn_editarRutinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarRutinaMouseClicked
            // Editar Rutina
            
            dispose();

    }//GEN-LAST:event_btn_editarRutinaMouseClicked

        private void btn_desactivarRutinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_desactivarRutinaMouseClicked
                // TODO add your handling code here:
                dispose();

        }//GEN-LAST:event_btn_desactivarRutinaMouseClicked

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
                        java.util.logging.Logger.getLogger(JF_menuRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(JF_menuRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(JF_menuRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(JF_menuRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new JF_menuRutinas().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel btn_agregarRutina;
        private javax.swing.JLabel btn_desactivarRutina;
        private javax.swing.JLabel btn_editarRutina;
        private javax.swing.JLabel btn_mostrarRutinas;
        private javax.swing.JButton btn_volver;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        // End of variables declaration//GEN-END:variables
}
