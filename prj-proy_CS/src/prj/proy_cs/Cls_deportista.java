
package prj.proy_cs;
import javax.swing.JOptionPane;
public class Cls_deportista extends cls_funcionesUsuarioM2{
    
    private int tipo;
    private String nombre;
    private String apellido;
    private String cedula;
    private String mail;
    private String telefono;
    private Boolean status;

    public Cls_deportista() {
        this.tipo = 0;
        this.nombre = " ";
        this.apellido = " ";
        this.cedula = " ";
        this.mail = " ";
        this.telefono = " ";
        this.status = true;
    }

    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
