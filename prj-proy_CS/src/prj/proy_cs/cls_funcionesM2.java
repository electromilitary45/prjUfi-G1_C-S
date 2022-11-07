package prj.proy_cs;

//-----------------IMPORTS-----------------
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Derek
 */
public class cls_funcionesM2 {

    //--------------LISTAS--------------
    protected static ArrayList<Cls_deportista> listaDeportistas = new ArrayList<Cls_deportista>();
    protected static ArrayList<Cls_padreFamilia> listaPadres = new ArrayList<Cls_padreFamilia>();
    protected static ArrayList<cls_deporte> listaDeportes = new ArrayList<cls_deporte>();
    protected static ArrayList<cls_rutina> listaRutinas = new ArrayList<cls_rutina>();

    //----------------------METODOS M2P1-----------------------------
    public void agregarUsuarios(String nombre, String apellido, String cedula, String mail, String numtel, int tipo, String nombreNino) {

        //-------INSTANCIAS------------
        Cls_deportista DP = new Cls_deportista();// deportistas
        Cls_padreFamilia PF = new Cls_padreFamilia();//padre

        if (tipo == 1) {
            DP.setNombre(nombre);
            DP.setApellido(apellido);
            DP.setCedula(cedula);
            DP.setMail(mail);
            DP.setTelefono(numtel);
            DP.setStatus(true);
            listaDeportistas.add(DP);
        } else {
            PF.setNombre(nombre);
            PF.setApellido(apellido);
            PF.setCedula(cedula);
            PF.setMail(mail);
            PF.setTelefono(numtel);
            PF.setNomNino(nombreNino);
            PF.setStatus(true);
            listaPadres.add(PF);
        }
    }//fin agregarUsusarios

    //Inicio Menú ListarUsuarios
    public void mostrarUsuarios() {
        char op = ' ';

        op = JOptionPane.showInputDialog("***Mostrar Usuarios***\n"
                + "\nA-Imprimir Deportistas"
                + "\nB-Imprimir Padres"
                + "\nC-Imprimir Deportistas y padres ").toUpperCase().charAt(0);

        switch (op) {
            case 'A':
                if (listaDeportistas.size() != 0) {
                    String s = "";
                    for (int i = 0; i < listaDeportistas.size(); i++) {
                        s = s + listaDeportistas.get(i).getNombre() + "--" + listaDeportistas.get(i).getApellido() + "--" + listaDeportistas.get(i).getCedula() + "--" + listaDeportistas.get(i).getMail() + "--" + listaDeportistas.get(i).getTelefono() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "--Lista Deportistas--\n" + s);
                } else {
                    JOptionPane.showMessageDialog(null, "NO ESXITEN DATOS A MOSTRAR");
                }

                break;
            case 'B':
                if (listaPadres.size() != 0) {

                    String p = "";
                    for (int i = 0; i < listaPadres.size(); i++) {
                        p = p + listaPadres.get(i).getNombre() + "--" + listaPadres.get(i).getApellido() + "--" + listaPadres.get(i).getCedula() + "--" + listaPadres.get(i).getMail() + "--" + listaPadres.get(i).getTelefono() + "--" + listaPadres.get(i).getNomNino() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "--Lista Padres--\n" + p);
                } else {
                    JOptionPane.showMessageDialog(null, "NO ESXITEN DATOS A MOSTRAR");
                }
                break;
            case 'C':

                if (listaDeportistas.size() != 0 || listaPadres.size() != 0) {
                    //-----deportistas
                    String dp = "";
                    for (int i = 0; i < listaDeportistas.size(); i++) {
                        dp = dp + listaDeportistas.get(i).getNombre() + "--" + listaDeportistas.get(i).getApellido() + "--" + listaDeportistas.get(i).getCedula() + "--" + listaDeportistas.get(i).getMail() + "--" + listaDeportistas.get(i).getTelefono() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "--Lista Deportistas--\n" + dp);
                    //-----padres
                    String pd = "";
                    for (int i = 0; i < listaPadres.size(); i++) {
                        pd = pd + listaPadres.get(i).getNombre() + "--" + listaPadres.get(i).getApellido() + "--" + listaPadres.get(i).getCedula() + "--" + listaPadres.get(i).getMail() + "--" + listaPadres.get(i).getTelefono() + "--" + listaPadres.get(i).getNomNino() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "--Lista Padres--\n" + pd);
                } else {
                    JOptionPane.showMessageDialog(null, "NO ESXITEN DATOS A MOSTRAR");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida, Intentelo nuevamente", "Mostrar usuarios", JOptionPane.WARNING_MESSAGE);
                break;

        }
    }

    //Fin Menú ListarUsuarios
    public void buscarUserJF(String vecDatos[], String cedula) {//este metodo solo sirve para el JF_editarUsuario

        for (int i = 0; i < listaPadres.size(); i++) {
            if (listaPadres.get(i).getCedula().equals(cedula)) {
                vecDatos[0] = listaPadres.get(i).getNombre();
                vecDatos[1] = listaPadres.get(i).getApellido();
                vecDatos[2] = listaPadres.get(i).getCedula();
                vecDatos[3] = listaPadres.get(i).getMail();
                vecDatos[4] = listaPadres.get(i).getTelefono();
                vecDatos[5] = "2";
                vecDatos[6] = listaPadres.get(i).getNomNino();
            }
        }
        for (int i = 0; i < listaDeportistas.size(); i++) {
            if (listaDeportistas.get(i).getCedula().equals(cedula)) {
                vecDatos[0] = listaDeportistas.get(i).getNombre();
                vecDatos[1] = listaDeportistas.get(i).getApellido();
                vecDatos[2] = listaDeportistas.get(i).getCedula();
                vecDatos[3] = listaDeportistas.get(i).getMail();
                vecDatos[4] = listaDeportistas.get(i).getTelefono();
                vecDatos[5] = "1";

            }
        }
    }

    public void editarUsuario(String cedulaVieja, String cedulaNueva, String nombre, String apellido, String mail, String numtel, int tipo, String nombreNino) {
        
    }//fin editarUSuario

    public void llenarcmbBxninos(String vecNombre[]) {

        for (int i = 0; i < listaDeportistas.size(); i++) {
            vecNombre[i] = listaDeportistas.get(i).getNombre() + " " + listaDeportistas.get(i).getApellido();
        }

    }//fin llenarcbxninos

    public void desactivarUsuario(String cedula) {
        
    }//fin cedula
    
    //---------------------METODOS M2P2----------------------
    
    public String mostrarDeportes(String s){
        if(listaDeportes.size()!=0){
            
            
            for (int i = 0; i < listaDeportes.size(); i++) {
                String a="";
                if(listaDeportes.get(i).getStatus()==true){
                    a="Activo"; 
                }else{
                    a="Inactivo";
                }
                s=s+listaDeportes.get(i).getNombre()+"--"+listaDeportes.get(i).getCaracteristicas()+a+"\n";
            }
            return s;
        }
        s="No hay datos";
        return s;
    }
}//fin cls_funcionesM2()
