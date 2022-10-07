package prj.proy_cs;
import javax.swing.JOptionPane;

public class Cls_familiares extends Cls_usuario {
    //Generación de atributos
    private int tipo;

    public Cls_familiares() {
    }
    
    //Generación constructor 

    public Cls_familiares(String usuario, String contraseña, String apellido, String nombre, boolean status) {
        super(usuario, contraseña, apellido, nombre, status);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    

}
