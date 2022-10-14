package prj.proy_cs;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class cls_funcionesUsuario {

    //--------BASES DE DATOS LINKEDLIST---------------
    public static LinkedList<Cls_clientes> listaClientes = new LinkedList<Cls_clientes>();
    public static LinkedList<Cls_facilitadores> listaFacilitadores = new LinkedList<Cls_facilitadores>();
    public static LinkedList<Cls_familiares> listaFamiliares = new LinkedList<Cls_familiares>();

    ///-----------METODOS CRUD----------------------
    public void crearUsuario(String nombre, String apellido, int tipo, String usuario, String password) {

        try {
            if (tipo == 1) { // ---------clientes-----------
                Cls_clientes c = new Cls_clientes();
                c.setTipo(tipo);
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setStatus(true);
                c.setUsuario(usuario);
                c.setContrasena(password);
                listaClientes.add(c); // se debe cambiar(MAJO)
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
                listaFacilitadores.add(faci);//se debe cambiar (MAJO)
                JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO!");
            } else {//---------familiares---------
                Cls_familiares fam = new Cls_familiares();
                fam.setNombre(nombre);
                fam.setApellido(apellido);
                fam.setStatus(true);
                fam.setTipo(tipo);
                fam.setUsuario(usuario);
                fam.setContrasena(password);
                listaFamiliares.add(fam);//sedebe cambiar (MAJO)
                JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n" + e.getMessage());
        }
    }//fin crearUsuario(){}

    public void mostrarUsuarioEspecifico(String usuario) {

        int indice_user = 0;
        boolean encontroC = false;
        boolean encontroFaci = false;
        boolean encontroFam = false;
        //Tipo de Usuarios
        String tipo = "";

        //--------------------Clientes--------------------//
        for (int x = 0; x < listaClientes.size(); x++) {

            if (usuario.equals(listaClientes.get(x).getUsuario())) {
                tipo = "Cliente";
                indice_user = x;
                encontroC = true;
            }
        }//fin for clientes
        //--------------------Familiares--------------------//
        for (int x = 0; x < listaFamiliares.size(); x++) {

            if (usuario.equals(listaFamiliares.get(x).getUsuario())) {
                tipo = "Familiar";
                indice_user = x;
                encontroFam = true;
            }
        }//fin for familiares
        //--------------------Facilitadores--------------------//
        for (int x = 0; x < listaFacilitadores.size(); x++) {

            if (usuario.equals(listaFacilitadores.get(x).getUsuario())) {
                tipo = "Facilitadores";
                indice_user = x;
                encontroFaci = true;
            }
        } //fin for facilitadores
        if (encontroC != false) {
            JOptionPane.showMessageDialog(null,
                    "-----DATOS DE USUARIO-----\n"
                    + "Nombre: " + listaClientes.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaClientes.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaClientes.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaClientes.get(indice_user).getContrasena() + "\n"
                    + "Tipo: " + tipo);

        } else if (encontroFam != false) {
            JOptionPane.showMessageDialog(null,
                    "-----DATOS DE USUARIO-----\n"
                    + "Nombre: " + listaFamiliares.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaFamiliares.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaFamiliares.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaFamiliares.get(indice_user).getContrasena() + "\n"
                    + "Tipo: " + tipo);
        } else if (encontroFaci != false) {
            JOptionPane.showMessageDialog(null,
                    "-----DATOS DE USUARIO-----\n"
                    + "Nombre: " + listaFacilitadores.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaFacilitadores.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaFacilitadores.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaFacilitadores.get(indice_user).getContrasena() + "\n"
                    + "Tipo: " + tipo);
        } else {
            JOptionPane.showMessageDialog(null, "¡Lo sentimos... no se encontró ningún tipo de información!");
        }

    }//fin metodo mostrarUsuarioEspecifico

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

    public void desactivarUsuario(String usuario) {
        /* 
        
        SE tiene que hacer como el metodo de 'buscar un usuario determinado' todo se hace con el usuario (SEBASTIAN)
        Se debe encontrar el usuario en los diferentes LinkedList
        
        String usuario = JOptionPane.showInputDialog(null, "Digite el nombre del usuario que desea desactivar: ");
        for (int x = 0; x < listaUsuarios.size(); x++) {
            if (listaUsuarios.get(x).get() == tipo & listaUsuarios.get(x).getUsuario() == usuario) {
                listaUsuarios.get(x).setStatus(false);
            }
        }

         */
    }//fin Desactivar

}//fin clasFunciones
