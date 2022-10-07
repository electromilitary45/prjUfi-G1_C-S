package prj.proy_cs;
import javax.swing.JOptionPane;

public class Cls_facilitadores extends Cls_usuario {
    //Generación de atributos 
    private final int tipo=3;
    private double pago;
    
    public Cls_facilitadores() {
    }
    
    //Generación constructor
    public Cls_facilitadores(String usuario, String contraseña, String apellido, String nombre) {
        super(usuario, contraseña, apellido, nombre);
    }

    public Cls_facilitadores(double pago) {
        this.pago = pago;
    }
    

}
