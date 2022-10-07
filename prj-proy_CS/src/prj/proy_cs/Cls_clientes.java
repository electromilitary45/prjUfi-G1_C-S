package prj.proy_cs;
import javax.swing.JOptionPane;

public class Cls_clientes extends Cls_usuario {
    //Generación de atributos 
    private int tipo;

    public Cls_clientes() {
    }
    
    //----------Generación constructor LLENO-----------------
    public Cls_clientes(String usuario, String contrasena, String apellido, String nombre, boolean status) {
        super(usuario, contrasena, apellido, nombre, status);
    }
    
    //--------METODOS GETTERS AND SETTERS-------------
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    

    
    
    
}
