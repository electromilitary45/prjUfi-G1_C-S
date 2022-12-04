/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prj.proy_cs;

import java.awt.Color;


import vistasM1.JF_menuRegistro;
import vistasM2.JF_menuCatalogo;
import vistasM3.JF_cajas;
import vistasM3.JF_menuFacturacion;

/**
 *
 * @author Derek
 */
public class JF_menu extends javax.swing.JFrame {
    //----------------INSTANCIAS----------
    
    
    /**
     * Creates new form JF_menu
     */
    public JF_menu() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelP = new javax.swing.JPanel();
        linea1 = new javax.swing.JPanel();
        linea2 = new javax.swing.JPanel();
        ico_UFide = new javax.swing.JLabel();
        ico_deportes = new javax.swing.JLabel();
        ico_registro = new javax.swing.JLabel();
        lbl_registro = new javax.swing.JLabel();
        ico_catalogo = new javax.swing.JLabel();
        lbl_catalogo = new javax.swing.JLabel();
        ico_facturacion = new javax.swing.JLabel();
        lbl_facturacion = new javax.swing.JLabel();
        ico_cajas = new javax.swing.JLabel();
        lbl_cajas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 170));
        setName("ESCUELA"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelP.setBackground(new java.awt.Color(51, 51, 51));
        panelP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linea1.setBackground(new java.awt.Color(255, 255, 51));
        panelP.add(linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 470, 10));

        linea2.setBackground(new java.awt.Color(255, 255, 51));
        panelP.add(linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 10, 400));

        ico_UFide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_fide2.png"))); // NOI18N
        panelP.add(ico_UFide, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 90));

        ico_deportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_deportes.png"))); // NOI18N
        panelP.add(ico_deportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 70, 70));

        ico_registro.setBackground(new java.awt.Color(255, 255, 0));
        ico_registro.setForeground(new java.awt.Color(204, 204, 204));
        ico_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_registro.png"))); // NOI18N
        ico_registro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ico_registroFocusGained(evt);
            }
        });
        ico_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_registroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ico_registroMouseEntered(evt);
            }
        });
        panelP.add(ico_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lbl_registro.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_registro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registro.setText("REGISTRO");
        panelP.add(lbl_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        ico_catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_catalogo.png"))); // NOI18N
        ico_catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_catalogoMouseClicked(evt);
            }
        });
        panelP.add(ico_catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        lbl_catalogo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_catalogo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_catalogo.setText("CATALOGO");
        panelP.add(lbl_catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        ico_facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_facturacion.png"))); // NOI18N
        ico_facturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_facturacionMouseClicked(evt);
            }
        });
        panelP.add(ico_facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lbl_facturacion.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_facturacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_facturacion.setText("FACTURACION");
        panelP.add(lbl_facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        ico_cajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_cajas2.png"))); // NOI18N
        ico_cajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_cajasMouseClicked(evt);
            }
        });
        panelP.add(ico_cajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        lbl_cajas.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_cajas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cajas.setText("CAJAS");
        panelP.add(lbl_cajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("SALIR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panelP.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        getContentPane().add(panelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ico_cajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_cajasMouseClicked
        // TODO add your handling code here:
        dispose();
        JF_cajas JF = new JF_cajas();
        JF.setVisible(true);
    }//GEN-LAST:event_ico_cajasMouseClicked

    private void ico_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_registroMouseClicked
        // TODO add your handling code here:
        /*cls_menuPrincipal clsMP = new cls_menuPrincipal();
        char op='A';
        clsMP.menuP(op);*/
        dispose();
        JF_menuRegistro JF = new JF_menuRegistro();
        JF.setVisible(true);
        
    }//GEN-LAST:event_ico_registroMouseClicked

    private void ico_registroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ico_registroFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ico_registroFocusGained

    private void ico_registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_registroMouseEntered
        // TODO add your handling code here:
        ico_registro.setBackground(Color.YELLOW);
        ico_registro.setOpaque(true);
    }//GEN-LAST:event_ico_registroMouseEntered

    private void ico_catalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_catalogoMouseClicked
        // TODO add your handling code here:
        JF_menuCatalogo JF = new JF_menuCatalogo();
        dispose();
        JF.setVisible(true);
        
    }//GEN-LAST:event_ico_catalogoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void ico_facturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_facturacionMouseClicked
        // TODO add your handling code here:\
        dispose();
        new JF_menuFacturacion().setVisible(true);
    }//GEN-LAST:event_ico_facturacionMouseClicked

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
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new JF_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ico_UFide;
    private javax.swing.JLabel ico_cajas;
    private javax.swing.JLabel ico_catalogo;
    private javax.swing.JLabel ico_deportes;
    private javax.swing.JLabel ico_facturacion;
    private javax.swing.JLabel ico_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_cajas;
    private javax.swing.JLabel lbl_catalogo;
    private javax.swing.JLabel lbl_facturacion;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JPanel linea1;
    private javax.swing.JPanel linea2;
    private javax.swing.JPanel panelP;
    // End of variables declaration//GEN-END:variables
}
