package prj.proy_cs;
import javax.swing.JOptionPane;

public class Cls_facilitadores extends Cls_usuario {
    //Generación de atributos 
    private  int tipo;
    private double pago;
    
    //--------------CONSTRUCTOR VACIO----------
    public Cls_facilitadores() {
    }
    
    //----------Generación constructor LLENO-----------

    public Cls_facilitadores(String usuario, String contraseña, String apellido, String nombre, boolean status) {
        super(usuario, contraseña, apellido, nombre, status);
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    
    

}
