
package prj.proy_cs;

import javax.swing.JOptionPane;

public class cls_rutina {
    
    private String deporteAsignado;
    private String descripcion;
    private String duracion;
    private Boolean status;

    public cls_rutina(String deporteAsignado, String descripcion, String duracion, Boolean status) {
        this.deporteAsignado = " ";
        this.descripcion = " ";
        this.duracion = " ";
        this.status = true;
    }

    public String getDeporteAsignado() {
        return deporteAsignado;
    }

    public void setDeporteAsignado(String deporteAsignado) {
        this.deporteAsignado = deporteAsignado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
