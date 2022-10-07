package prj.proy_cs;
import javax.swing.JOptionPane;

public class Cls_clientes extends Cls_usuario {
    //Generación de atributos 
    private final int tipo=2;

    public Cls_clientes() {
    }
    //Generación constructor
    

    public Cls_clientes(String usuario, String contraseña, String apellido, String nombre, boolean status) {
        super(usuario, contraseña, apellido, nombre, status);
    }
    
    
}
