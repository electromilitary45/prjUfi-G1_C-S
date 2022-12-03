/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj.proy_cs;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class cls_funcionesM3 {
    //LISTA DE PAGOS:
    protected static ArrayList<cls_factura> listaPagos = new ArrayList<cls_factura>();

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

    //---Desactivar Reserva----
    public void desactivarFactura(String nombre) {
        /*
        boolean desactivado = false; // solo se activa si el deporte fue encontrado y desactivado || se utiliza para mensaje
        boolean encontrado = false;
        //---LISTA RUTINAS--
        for (int x = 0; x < lista.size(); x++) {
            if (lista.get(x).getNombreFactura().equals(nombre)) {
                encontrado = true;
                lista.get(x).setStatus(false);
                JOptionPane.showMessageDialog(null, "FACTURA DESACTIVADA CON EXITO");
            }
            if (lista.get(x).getNombreFactura().equals(nombre) == false) {
                JOptionPane.showMessageDialog(null, "FACTURA NO REGISTRADA");
                desactivado = false;
                encontrado = false;
            }
        }
         */
    }
    
    public void agregarPago(String nomDeport, String fecha, String pago) {
        
        cls_factura F = new cls_factura();
        F.setNomDeport(nomDeport);
        F.setFecha(fecha);
        F.setPago(pago);
        listaPagos.add(F);
    }
    
    public void listaPagos(){
        if (listaPagos.size() != 0) {
            //-----Pagos
            int cont=0;
            String dp = "";
            for (int i = 0; i < listaPagos.size(); i++) {
                //dp = dp + listaPagos.get(i).getNomDeport()+ "--" + listaPagos.get(i).getFecha()+ "--" + listaPagos.get(i).getPago() +"\n";
                cont = cont + Integer.parseInt(listaPagos.get(i).getPago());
            }
            //JOptionPane.showMessageDialog(null, "--Lista Deportistas--\n" + dp);
            JOptionPane.showMessageDialog(null, "--Sumatoria de Pagos--\n" + cont);
        }
    }
   ///Funciones para vista JF_modificarFactura (se encuentran instanciadas en dicho formulario)
    /*
    1-public void modificarFactura()   
    2-public void mover() 
    3-public void consultar()
    4-public void limpiar()
    5-private void llenarcbx()
    */

}// fin cls_funcionesM3{}
