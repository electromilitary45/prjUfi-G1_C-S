
package prj.proy_cs;
import javax.swing.JOptionPane;
public class Cls_deportista extends cls_usuarioM2{
    
    private int tipo;

    public Cls_deportista() {
        
    }

    
    public Cls_deportista(int tipo, String nombre, String apellido, String cedula, String mail, String telefono, Boolean status) {
        super(nombre, apellido, cedula, mail, telefono, status);
        this.tipo = 1;
    }


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    
}
