package prj.proy_cs;

import javax.swing.JOptionPane;


public class Cls_usuario {
    //Generación de atributos
    private int tipo;
    private String usuario;
    private String contrasena;        
    private String apellido;
    private String nombre;
    private boolean activo;
    
    Cls_usuario(){
        this.tipo=0;
        this.usuario="";
        this.contrasena="";
        this.nombre="";
        this.apellido="";
        this.activo=true;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

}
