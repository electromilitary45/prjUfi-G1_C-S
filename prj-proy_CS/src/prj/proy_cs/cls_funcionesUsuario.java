package prj.proy_cs;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class cls_funcionesUsuario {

    //--------BASES DE DATOS LINKEDLIST---------------
    public static LinkedList<Cls_usuario> listaUsuarios = new LinkedList<Cls_usuario>(); // esta se debe eliminar
    public static LinkedList<Cls_clientes> listaClientes = new LinkedList<Cls_clientes>();
    public static LinkedList<Cls_facilitadores> listaFacilitadores = new LinkedList<Cls_facilitadores>();
    public static LinkedList<Cls_familiares> listaFamiliares = new LinkedList<Cls_familiares>();

    ///-----------METODOS CRUD----------------------
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
    }//fin crearUsuario(){}

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
                    "DATOS DE USUARIO \n"
                    + "Nombre: " + listaUsuarios.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaUsuarios.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaUsuarios.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaUsuarios.get(indice_user).getContrasena() + "\n");
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
