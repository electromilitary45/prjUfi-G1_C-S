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
                    + "Tipo: " + tipo
                    + "ESTADO: " + listaClientes.get(indice_user).isStatus());

        } else if (encontroFam != false) {
            JOptionPane.showMessageDialog(null,
                    "-----DATOS DE USUARIO-----\n"
                    + "Nombre: " + listaFamiliares.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaFamiliares.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaFamiliares.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaFamiliares.get(indice_user).getContrasena() + "\n"
                    + "Tipo: " + tipo
                    + "ESTADO: " + listaFamiliares.get(indice_user).isStatus());
        } else if (encontroFaci != false) {
            JOptionPane.showMessageDialog(null,
                    "-----DATOS DE USUARIO-----\n"
                    + "Nombre: " + listaFacilitadores.get(indice_user).getNombre() + "\n"
                    + "Apellido: " + listaFacilitadores.get(indice_user).getApellido() + "\n"
                    + "Usuario: " + listaFacilitadores.get(indice_user).getUsuario() + "\n"
                    + "Contraseña:  " + listaFacilitadores.get(indice_user).getContrasena() + "\n"
                    + "Tipo: " + tipo
                    + "ESTADO: " + listaFacilitadores.get(indice_user).isStatus());
        } else {
            JOptionPane.showMessageDialog(null, "¡Lo sentimos... no se encontró ningún tipo de información!");
        }

    }//fin metodo mostrarUsuarioEspecifico

    /*
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

     
    }*///fin Desactivar
    public void desactivarUsuario(String usuario) {

        boolean desactivado = false; // solo se activa si el usuario fue encontrado y desactivado || se utiliza para mensaje
        boolean encontrado = false;
        //---LISTA CLIENTES--
        for (int x = 0; x < listaClientes.size(); x++) {
            if (listaClientes.get(x).getUsuario().equals(usuario)) {
                encontrado = true;
                if (listaClientes.get(x).isStatus() == false) {

                    JOptionPane.showMessageDialog(null, "Error usuario previamente desactivado");
                } else {
                    listaClientes.get(x).setStatus(false);
                    JOptionPane.showMessageDialog(null, "DESACTIVADO CON EXITO");
                    desactivado = true;
                }

            }
        }//fin clietnes

        //--Lista Familiares--
        for (int x = 0; x < listaFamiliares.size(); x++) {
            if (listaFamiliares.get(x).getUsuario().equals(usuario)) {
                encontrado = true;
                if (listaFamiliares.get(x).isStatus() == false) {

                    JOptionPane.showMessageDialog(null, "Error usuario previamente desactivado");
                } else {
                    listaFamiliares.get(x).setStatus(false);
                    JOptionPane.showMessageDialog(null, "DESACTIVADO CON EXITO");
                    desactivado = true;
                }

            }
        }
        //--Lista Facilitadores--
        for (int x = 0; x < listaFacilitadores.size(); x++) {
            if (listaFacilitadores.get(x).getUsuario().equals(usuario)) {
                encontrado = true;
                if (listaFacilitadores.get(x).isStatus() == false) {

                    JOptionPane.showMessageDialog(null, "Error usuario previamente desactivado");
                } else {
                    listaFacilitadores.get(x).setStatus(false);
                    JOptionPane.showMessageDialog(null, "DESACTIVADO CON EXITO");
                    desactivado = true;
                }

            }
        }
        //--MENSAJE DE NO ENCONTRADO--
        if (desactivado == false && encontrado == false) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }
    
    public void mostrarUsers(){
        if(listaClientes.size()!=0 || listaFacilitadores.size()!=0 || listaFamiliares.size()!=0){
            String s="";
            for (int i = 0; i < listaClientes.size(); i++) {
                String a="Cliente";
                s=s+listaClientes.get(i).getNombre()+"--"+listaClientes.get(i).getApellido()+"--"+listaClientes.get(i).getUsuario()+"--"+listaClientes.get(i).getContrasena()+"--"+a+"\n";
            }
            
            for (int i = 0; i < listaFacilitadores.size(); i++) {
                String a="Facilitador";
                s=s+listaFacilitadores.get(i).getNombre()+"--"+listaFacilitadores.get(i).getApellido()+"--"+listaFacilitadores.get(i).getUsuario()+"--"+listaFacilitadores.get(i).getContrasena()+"--"+a+"\n";
            }
            
            for (int i = 0; i < listaFamiliares.size(); i++) {
                String a="Familitar";
                s=s+listaFamiliares.get(i).getNombre()+"--"+listaFamiliares.get(i).getApellido()+"--"+listaFamiliares.get(i).getUsuario()+"--"+listaFamiliares.get(i).getContrasena()+"--"+a+"\n";
            }
            JOptionPane.showMessageDialog(null, "LISTA DE USUARIOS\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "NO HAY USUARIOS");
        }
        
    
    }//fin mostrarUsuarios(){}
}//fin clasFunciones
