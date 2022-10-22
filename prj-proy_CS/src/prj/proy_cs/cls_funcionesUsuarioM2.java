
package prj.proy_cs;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class cls_funcionesUsuarioM2 {
    
    public static ArrayList<Cls_deportista> listaDeportistas = new ArrayList<Cls_deportista>();
    public static ArrayList<Cls_padreFamilia> listaFamiliares = new ArrayList<Cls_padreFamilia>();
    
    public void crearUsuario(String nombre, String apellido, String cedula, String mail, String telefono){
        try{
            int tipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el tipo de ususario. 1.deportista 2.familiar"));
            if(tipo == 1){
                Cls_deportista d = new Cls_deportista();
                d.setNombre(nombre);
                d.setApellido(apellido);
                d.setCedula(cedula);
                d.setMail(mail);
                d.setTelefono(telefono);
                d.setStatus(true);
            }
            if(tipo == 2){
                Cls_padreFamilia f=new Cls_padreFamilia();
                f.setNombre(nombre);
                f.setApellido(apellido);
                f.setCedula(cedula);
                f.setMail(mail);
                f.setTelefono(telefono);
                f.setStatus(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error\n" + e.getMessage());
        }
    }
}

