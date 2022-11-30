/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj.proy_cs;

/**
 *
 * @author Derek
 */
public class cls_factura {
    private String nomDeport;
    private String fecha;
    private int  pago;
    private char status; //STATUS = '1' =>ACTIVO || STATUS='0' => INACTIVO

    public cls_factura() {
        this.nomDeport="";
        this.fecha="";
        this.pago=0;
        this.status='1';
    }

    public String getNomDeport() {
        return nomDeport;
    }

    public void setNomDeport(String nomDeport) {
        this.nomDeport = nomDeport;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

   

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

}
