package prj.proy_cs;
import javax.swing.JOptionPane;

public class Cls_familiares extends Cls_usuario {
    //Generación de atributos
    private final int tipo=1;

    public Cls_familiares() {
    }
    
    //Generación constructor 
    public Cls_familiares(String usuario, String contraseña, String apellido, String nombre){
        super(usuario, contraseña, apellido, nombre);
    }
    

}
