
package prj.proy_cs;

import javax.swing.JOptionPane;

public class cls_deporte {
    
    private String nombre;
    private String caracteristicas;
    private Boolean status;

    public cls_deporte(String nombre, String caracteristicas, Boolean status) {
        this.nombre = " ";
        this.caracteristicas = " ";
        this.status = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
