package prj.proy_cs;

import javax.swing.JOptionPane;


public class Cls_usuario {
    //Generación de atributos
    
    private String usuario;
    private String contrasena;        
    private String apellido;
    private String nombre;
    private boolean status;

    public Cls_usuario() {
    }
    
    public Cls_usuario(String usuario, String contrasena, String apellido, String nombre, boolean status) {
        this.usuario = "";
        this.contrasena = "";
        this.apellido = "";
        this.nombre = "";
        this.status = true;
    }
   
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    

}
