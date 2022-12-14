/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import prj.proy_cs.cls_factura;
import prj.proy_cs.cls_funcionesM2;
import prj.proy_cs.cls_funcionesM3;

/**
 *
 * @author maria
 */
public class JF_modificarFactura extends javax.swing.JFrame {

    /**
     * Creates new form JF_modificarFactura
     */
    public JF_modificarFactura() {
        initComponents();
        setLocationRelativeTo(null);
        llenarcbx();
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
        cbx_niños = new javax.swing.JComboBox<>();
        txt_pago = new javax.swing.JTextField();
        jestado = new javax.swing.JCheckBox();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        txt_pago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jestado.setText("¡Marca la casilla para indicar que se encuentra activo!");
        jestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jestadoActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
        });

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_nombre.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_dinero24.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("¡EDITA TU FACTURA!");

        btn_buscar.setBackground(new java.awt.Color(255, 255, 204));
        btn_buscar.setForeground(new java.awt.Color(0, 51, 51));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_buscarEditarDeporte.png"))); // NOI18N
        btn_buscar.setText("jButton1");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cancelar)
                        .addGap(143, 143, 143)
                        .addComponent(btn_guardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_niños, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pago))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(74, 74, 74)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_buscar))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_niños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_guardar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jestadoActionPerformed

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        dispose();
        JF_menuFacturacion F = new JF_menuFacturacion();
        F.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if ((String) cbx_niños.getSelectedItem() != null && !txt_pago.getText().isBlank() && !txt_pago.getText().isEmpty()) {
            String nino = (String) cbx_niños.getSelectedItem();
            String pago = txt_pago.getText();
            modificarFactura();
        } else {
            JOptionPane.showMessageDialog(null, "DEBE RELLENAR LOS ESCPACIOS");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked

        String nino = (String) cbx_niños.getSelectedItem();
        String pago = txt_pago.getText();
        consultar();
    }//GEN-LAST:event_btn_buscarMouseClicked

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
            java.util.logging.Logger.getLogger(JF_modificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_modificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_modificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_modificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_modificarFactura().setVisible(true);

            }
        });
    }
    //Métodos JF_modificarFactura

    public void modificarFactura() {
        try {
            cls_factura f = new cls_factura();
            DataInputStream entrada = new DataInputStream(new FileInputStream("FACTURAS.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("TEMPORAL.dat"));
            //STRING BUSCAR
            try {
                while (true) {
                    f.setNomDeport(entrada.readUTF());
                    f.setFecha(entrada.readUTF());
                    f.setPago(entrada.readUTF());
                    f.setStatus(entrada.readChar());
                    if (cbx_niños.getSelectedItem().equals(f.getNomDeport())) {       
                        if (jestado.isSelected()){
                           f.setStatus('1'); //ACTIVO
                        } else {
                             f.setStatus('2'); //INACTIVO
                        }  
                        f.setPago(txt_pago.getText());
                    }
                    salida.writeUTF(f.getNomDeport());
                    salida.writeUTF(f.getFecha());
                    salida.writeUTF(f.getPago());
                    salida.writeChar(f.getStatus());
                }
            } catch (EOFException eofe) {
                entrada.close();
                salida.close();
                mover();
                JOptionPane.showMessageDialog(null, "¡Factura modificada correctamente!",
                        "Datos modificados", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                cbx_niños.requestFocus();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    } //Fin método modificar facturas 

    public void limpiar() {
        cbx_niños.setSelectedItem("");
        txt_pago.setText("");
        jestado.setSelected(false);
    }// fin método limpiar

    public void mover() {
        try {
            cls_factura f = new cls_factura();
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "TEMPORAL.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(
                    "FACTURAS.dat"));
            try {
                f.setNomDeport(entrada.readUTF());
                f.setFecha(entrada.readUTF());
                f.setPago(entrada.readUTF());
                f.setStatus(entrada.readChar());
                salida.writeUTF(f.getNomDeport());
                salida.writeUTF(f.getFecha());
                salida.writeUTF(f.getPago());
                salida.writeChar(f.getStatus());
            } catch (EOFException eofe) {
                entrada.close();
                salida.close();
                mover();
                JOptionPane.showMessageDialog(null, "¡Datos fueron modificados correctamente!",
                        "Datos modificados", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    } //Fin método mover

    public void consultar() {
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream(
                    "FACTURAS.dat"));
            try {
                cls_factura f = new cls_factura();
                while (true) {
                    f.setNomDeport(entrada.readUTF());
                    f.setFecha(entrada.readUTF());
                    f.setPago(entrada.readUTF());
                    f.setStatus(entrada.readChar());
                    if (cbx_niños.getSelectedItem().equals(f.getNomDeport())) {       
                        if (f.getStatus()==('1')){
                            jestado.setSelected(true); //ACTIVO
                            
                        } else {
                            jestado.setSelected(false); //INACTIVO
                        }  
                        txt_pago.setText(f.getPago());
                    }
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
    } //Fin método consultar

    private void llenarcbx() {
        String vecNombres[] = new String[99999];

        int cont = 0;
        cls_funcionesM2 FM = new cls_funcionesM2();
        FM.llenarcmbBxninos(vecNombres);

        for (int i = 0; i < vecNombres.length; i++) {
            if (vecNombres[i] != null) {
                cont++;
            }
        }
        String vecNombres2[] = new String[cont];
        cont = 0;
        for (int i = 0; i < vecNombres.length; i++) {
            if (vecNombres[i] != null) {

                vecNombres2[cont] = vecNombres[i];
                cont++;
            }
        }

        cbx_niños.setModel(new DefaultComboBoxModel<>(vecNombres2));

    } //Fin método llenar comboBox

    //Fin métodos JF_modificarFactura

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cbx_niños;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jestado;
    private javax.swing.JTextField txt_pago;
    // End of variables declaration//GEN-END:variables
}
