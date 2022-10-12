package prj.proy_cs;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class cls_funcionesUsuario {

    //--------BASES DE DATOS LINKEDLIST---------------
    LinkedList<Cls_usuario> listaUsuarios = new LinkedList<Cls_usuario>();

    ///-----------BASES DE DATOS0----------------------
    public void crearUsuario(String nombre, String apellido, int tipo, String usuario, String password) {
        try {
            if (tipo == 1) { // clientes
                Cls_clientes c = new Cls_clientes();
                c.setTipo(tipo);
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setStatus(true);
                c.setUsuario(usuario);
                c.setContrasena(password);
                listaUsuarios.add(c);
            } else if (tipo == 2) { // facilitadores
                Cls_facilitadores faci = new Cls_facilitadores();
                faci.setNombre(nombre);
                faci.setApellido(apellido);
                faci.setStatus(true);
                faci.setUsuario(usuario);
                faci.setTipo(tipo);
                faci.setPago(0);
                faci.setContrasena(password);
                listaUsuarios.add(faci);
            } else {
                Cls_familiares fam = new Cls_familiares();
                fam.setNombre(nombre);
                fam.setApellido(apellido);
                fam.setStatus(true);
                fam.setTipo(tipo);
                fam.setUsuario(usuario);
                fam.setContrasena(password);
                listaUsuarios.add(fam);
            }
            //prueba de que agrega
            //JOptionPane.showMessageDialog(null, listaUsuarios.get(0).getNombre());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n" + e.getMessage());
        }
        /*try {
            JOptionPane.showMessageDialog(null, "Crear nuevo Usuario");
            int x = 1;
            while (x == 1) {
                Cls_clientes c = new Cls_clientes();

                c.setTipo(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el tipo de Usuario\n1.Clientes\n2.Facilitadores\n3.Familiares\n")));
                c.setUsuario(JOptionPane.showInputDialog(null, "Inserte el nombre de su usuario: "));
                c.setContrasena(JOptionPane.showInputDialog(null, "Inserte su contraseña: "));
                c.setNombre(JOptionPane.showInputDialog(null, "Inserte su nombre: "));
                c.setApellido(JOptionPane.showInputDialog(null, "Inserte sus apellidos: "));
                listaUsuarios.add(c);

                x = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea agregar otro usuario? 1.Si 2.No"));
            }
        } catch (NumberFormatException ex01) {
            JOptionPane.showMessageDialog(null, "Error de formato al digitar " + ex01.getMessage());
        } catch (StringIndexOutOfBoundsException ex02) {
            JOptionPane.showMessageDialog(null, "Error, no se ingresó ningún dato " + ex02.getMessage());
        }*/
    }

    public void mostrarUsuariosActivos() {
        for (int x = 0; x < listaUsuarios.size(); x++) {
            if (listaUsuarios.get(x).isStatus()) {
                JOptionPane.showMessageDialog(null, "La lista es: " + listaUsuarios.get(x).getUsuario());
            }
        }
    }

    public void mostrarUsuariosInactivos() {
        for (int x = 0; x < listaUsuarios.size(); x++) {
            if (!listaUsuarios.get(x).isStatus()) {
                JOptionPane.showMessageDialog(null, "La lista es: " + listaUsuarios.get(x).getUsuario());
            }
        }
    }

    public void mostrarUsuarioEspecifico(String usuario) {

        int indice_user = 0;
        boolean encontro = false;

        for (int x = 0; x < listaUsuarios.size(); x++) {

            if (usuario.equals(listaUsuarios.get(x).getUsuario())) {
                indice_user = x;
                encontro = true;

                //usuario.equals(listaUsuarios.get(x).getUsuario())
                //if(listaUsuarios.get(x)){
                //Aqui se debe hacer lo del tipo.
                //String tipo = cliente                
                //String tipo = facilitadores
                //String tipo = familiares
                //}
                
            }//fin if 

        }//fin for
        if (encontro != false) {

            JOptionPane.showMessageDialog(null,
                    "La informacion: " + listaUsuarios.get(indice_user).getNombre() + "\n"
                    + listaUsuarios.get(indice_user).getApellido() + "\n"
                    + listaUsuarios.get(indice_user).getUsuario() + "\n"
                    + listaUsuarios.get(indice_user).getContrasena() + "\n");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la informacion");
        }

    }//fin metodo mostrarUsuarioEspecifico

    public void desactivarUsuario() {
        /*
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el tipo de usuario que desea desactivar:\n1.Clientes\n2.Facilitadores\n3.Familiares"));
        
        String usuario = JOptionPane.showInputDialog(null, "Digite el nombre del usuario que desea desactivar: ");
        for (int x = 0; x < listaUsuarios.size(); x++) {
            if (listaUsuarios.get(x).get() == tipo & listaUsuarios.get(x).getUsuario() == usuario) {
                listaUsuarios.get(x).setStatus(false);
            }
        }

         */
    }//fin Desactivar

}//fin clasFunciones
