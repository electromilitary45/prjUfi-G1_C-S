package prj.proy_cs;

import javax.swing.JOptionPane;


public class Cls_usuario {
    //Generación de atributos
    private String usuario;
    private String contraseña;        
    private String apellido;
    private String nombre;
    
    public Cls_usuario (){
    }
    //Generación de constructores

    public Cls_usuario(String usuario, String contraseña, String apellido, String nombre) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    //Generación getters - setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        usuario=JOptionPane.showInputDialog("Ingrese su usuario:");
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        contraseña=JOptionPane.showInputDialog("Ingrese su contraseña:");
        this.contraseña = contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido=JOptionPane.showInputDialog("Ingrese su apellido:");
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
        this.nombre = nombre;
    }

}
