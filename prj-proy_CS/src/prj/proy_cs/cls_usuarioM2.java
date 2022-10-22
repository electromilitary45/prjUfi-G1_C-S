
package prj.proy_cs;
import javax.swing.JOptionPane;
public class cls_usuarioM2 extends cls_funcionesUsuarioM2{
    
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String mail;
    private String telefono;
    private Boolean status;

    public cls_usuarioM2() {
        this.nombre = " ";
        this.apellido = " ";
        this.cedula = " ";
        this.mail = " ";
        this.telefono = " ";
        this.status = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
            
        
    
}

