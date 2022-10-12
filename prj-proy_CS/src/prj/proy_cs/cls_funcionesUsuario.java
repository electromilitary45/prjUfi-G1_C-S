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
        /*
        Solamente se debe cambiar la lista dependiendo que tipo de usuario se guarde (MAJO)
        */
        try {
            if (tipo == 1) { // ---------clientes-----------
                Cls_clientes c = new Cls_clientes();
                c.setTipo(tipo);
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setStatus(true);
                c.setUsuario(usuario);
                c.setContrasena(password);
                listaUsuarios.add(c); // se debe cambiar(MAJO)
                JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO!");
            } else if (tipo == 2) { // -----facilitadores---------
                Cls_facilitadores faci = new Cls_facilitadores();
                faci.setNombre(nombre);
                faci.setApellido(apellido);
                faci.setStatus(true);
                faci.setUsuario(usuario);
                faci.setTipo(tipo);
                faci.setPago(0);
                faci.setContrasena(password);
                listaUsuarios.add(faci);//se debe cambiar (MAJO)
                JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO!");
            } else {//---------familiares---------
                Cls_familiares fam = new Cls_familiares();
                fam.setNombre(nombre);
                fam.setApellido(apellido);
                fam.setStatus(true);
                fam.setTipo(tipo);
                fam.setUsuario(usuario);
                fam.setContrasena(password);
                listaUsuarios.add(fam);//sedebe cambiar (MAJO)
                JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO!");
            }
            
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
        /*(Majo)
        ->CREAR 3 variables booelanas de y eliminar la existente
        - encontroC
        - encontroFaci
        - encontroFam
        ->Se deben crear 3 for con la misma estructura para buscar la persona pero con las diferentes listas
        ->para dar la respeusta se debe utilizar la misma estructura per dependiendo si encontro cliente/familiar/facilitador se utilizan respeustas diferentes
        */

        for (int x = 0; x < listaUsuarios.size(); x++) {
            
            if (usuario.equals(listaUsuarios.get(x).getUsuario())) {
                indice_user = x;
                encontro = true;
                
                //String tipo="";
                //usuario.equals(listaUsuarios.get(x).getUsuario())
                //if(listaUsuarios.get(x).getTipo ==1){
                // tipo=cliente
                //}
                //Aqui se debe hacer lo del tipo.
                //String tipo = cliente                
                //String tipo = facilitadores
                //String tipo = familiares
                //}
            }//fin if 

        }//fin for
        if (encontro != false) {

            JOptionPane.showMessageDialog(null,
                    "-----DATOS DE USUARIO-----\n"
                    + "Nombre: " + listaUsuarios.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaUsuarios.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaUsuarios.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaUsuarios.get(indice_user).getContrasena() + "\n");
                    //agregar tipo (dependiendo del tipo no se puede dar el numero se debe convertir con alguna sentencia que el numero se comvierta en una palabra)(MAJO)
                    //no se puede poner un dato quemado (MAJO)
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la informacion");
        }

    }//fin metodo mostrarUsuarioEspecifico

    public void desactivarUsuario(String usuario) {
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
