/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj.proy_cs;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class cls_funcionesM3 {

    /*----IMPORTANTE-----
        EL ARCHIVO SE LLAMA => 'FACTURAS.dat'
     */
    //----------------------METODOS MODULO 3------------------------
    //--agregarReserva--
    public void agregarReserva(String pago, String nombreDepor) {
        try {
            cls_factura f = new cls_factura();
            
            //--datos
            f.setNomDeport(nombreDepor);
            String timeStamp = new SimpleDateFormat("dd/MM/YY").format(Calendar.getInstance().getTime());
            f.setFecha(timeStamp);
            f.setPago(pago);
            f.setStatus('1');   //'1' =activo || '0'=desactivo
            
            //se guarda en el archivo
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("FACTURAS.dat", true));
           
            salida.writeUTF(f.getNomDeport());
            salida.writeUTF(f.getFecha());
            salida.writeUTF(f.getPago());
            salida.writeChar(f.getStatus());
           
            salida.close();
            
            JOptionPane.showMessageDialog(null, "FACTURA CREADO");
        } catch (IOException ex01) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
        }
    }//fin agregarReserva(){}
    
}// fin cls_funcionesM3{}
