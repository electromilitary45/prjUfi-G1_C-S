
package prj.proy_cs;

import java.util.LinkedList;
import javax.swing.JOptionPane;
public class cls_funcionesUsuario {
    
    LinkedList<> listaUsuarios=new LinkedList<>();
   
    public void crearUsuario(){
        try{
            JOptionPane.showMessageDialog(null,"Crear nuevo Usuario");
            int x=1;
            while(x==1){
                Cls_usuario u=new Cls_usuario();
                u.setTipo(Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el tipo de Usuario\n1.Clientes\n2.Facilitadores\n3.Familiares\n")));
                u.setUsuario(JOptionPane.showInputDialog(null,"Inserte el nombre de su usuario: "));
                u.setContrasena(JOptionPane.showInputDialog(null,"Inserte su contraseña: "));
                u.setNombre(JOptionPane.showInputDialog(null,"Inserte su nombre: "));
                u.setApellido(JOptionPane.showInputDialog(null,"Inserte sus apellidos: "));
                listaUsuarios.add(u);
                x=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea agregar otro usuario? 1.Si 2.No"));
            }
        }catch(NumberFormatException ex01){
            JOptionPane.showMessageDialog(null,"Error de formato al digitar "+ex01.getMessage());
        }catch(StringIndexOutOfBoundsException ex02){
            JOptionPane.showMessageDialog(null,"Error, no se ingresó ningún dato "+ex02.getMessage());
        }
    }
    
    public void mostrarUsuariosActivos(){
        for(int x=0;x<listaUsuarios.size();x++){
            if(listaUsuarios.get(x).isActivo()){
                JOptionPane.showMessageDialog(null,"La lista es: "+listaUsuarios.get(x).getUsuario());
            }
        }
    }
    
    public void mostrarUsuariosInactivos(){
        for(int x=0;x<listaUsuarios.size();x++){
            if(!listaUsuarios.get(x).isActivo()){
                JOptionPane.showMessageDialog(null,"La lista es: "+listaUsuarios.get(x).getUsuario());
            }
        }
    }
    
    public void desactivarUsuario(){
        int tipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el tipo de usuario que desea desactivar:\n1.Clientes\n2.Facilitadores\n3.Familiares"));
        String usuario=JOptionPane.showInputDialog(null,"Digite el nombre del usuario que desea desactivar: ");
        for(int x=0;x<listaUsuarios.size();x++){
            if(listaUsuarios.get(x).getTipo()==tipo & listaUsuarios.get(x).getUsuario()==usuario){
                listaUsuarios.get(x).setActivo(false);
            }
        }
    }
}
