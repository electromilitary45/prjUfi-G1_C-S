/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    //----------------------METODOS-----------------------------
    public void agregarUsuarios(String nombre, String apellido, String cedula, String mail, String numtel, int tipo,String nombreNino) {
        
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
    
    public static void menuListarUsuarios(){
         boolean exit = false;
        do{
            String opcion=JOptionPane.showInputDialog("***Listado de Usuarios***\n"
                    +"1-Consultar lista |Deportistas|\n"
                    +"2-Consultar lista |Padres-Madres de familia|\n"
                    +"0-Salir del sistema\n");
            switch(opcion){
                case 0:
                    exit=true;
                    break;
                case 1:
                 mostrarUsuariosDeportistas();
                    break;  
                case 2:
                 mostrarUsuariosPadresMadres();
                    break; 
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida, Intentelo nuevamente","Listado de usuarios",JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while(!exit);
        
    }
    //Fin Menú ListarUsuarios
    
    //Inicio método listar Usuarios 

    public void mostrarUsuariosDeportistas() {

        if (listaDeportistas.size() == 0) {
            JOptionPane.showMessageDialog(null, "NADA PARA MOSTRAR");
        } else {
            String s = "";
            for (int i = 0; i < listaDeportistas.size(); i++) {  
                if(set.Status==true){
                    a="Activo/a";
                    return a;
                }else{
                    i="Inactivo/a";
                    return i;
                }
                JOptionPane.showMessageDialog( "------Deportista------"+"\n" +
                    +"Nombre: "+ s +listaDeportistas.get(i).getNombre()+"\n"
                    +"Apellidos: "+ s +listaDeportistas.get(i).getApellido()+"\n"
                    +"Teléfono:"+ s +listaDeportistas.get(i).getTelefono()+"\n"
                    +"Cédula: "+ s +listaDeportistas.get(i).getCedula()+"\n"
                    +"Mail: "+ s +listaDeportistas.get(i).getMail()+"\n"
                    +"Status:"+s+listaDeportistas.get(i).getStatus()+"\n");       
            }             
        }   
        JOptionPane.showMessageDialog(null, s);
    }
    public void mostrarUsuariosPadresMadres(){
        if (listaPadres.size()==0) {
            JOptionPane.showMessageDialog(null, "NADA PARA MOSTRAR");
        } else {
            String s = "";
            for (int i = 0; i < listaPadres.size(); i++) {
                if(set.Status==true){
                    a="Activo/a";
                    return a;
                }else{
                    i="Inactivo/a";
                    return i;  
                }
                JOptionPane.showMessageDialog( "------Padres/Madres------"+"\n" +
                    +"Nombre" + s+ listaPadres.get(i).getNombre() + " Padre de: "+ listaPadres.get(i).getNombre()+"\n"
                    +"Apellidos: "+ s +listaPadres.get(i).getApellido()+"\n"
                    +"Teléfono:"+ s +listaPadres.get(i).getTelefono()+"\n"
                    +"Cédula: "+ s +listaPadres.get(i).getCedula()+"\n"
                    +"Mail: "+ s +listaPadres.get(i).getMail()+"\n"
                    +"Nombre niño"+s +listaPadres.get(i).getnombreNino()+"\n"
                    +"Status:"+s+listaPadres.get(i).getStatus()+"\n");            
            }   
            JOptionPane.showMessageDialog(null, s);
        }  
    }
    //fin Listar Usuarios
    
    
    public void buscarUserJF(String vecDatos[],String cedula){//este metodo solo sirve para el JF_editarUsuario
        
        
        for (int i = 0; i < listaPadres.size(); i++) {
            if(listaPadres.get(i).getCedula().equals(cedula)){
                vecDatos[0]=listaPadres.get(i).getNombre();
                vecDatos[1]=listaPadres.get(i).getApellido();
                vecDatos[2]=listaPadres.get(i).getCedula();
                vecDatos[3]=listaPadres.get(i).getMail();
                vecDatos[4]=listaPadres.get(i).getTelefono();
                vecDatos[5]="2";
                vecDatos[6]=listaPadres.get(i).getNomNino();
                
            }
        }
        for (int i = 0; i < listaDeportistas.size(); i++) {
            if(listaDeportistas.get(i).getCedula().equals(cedula)){
                vecDatos[0]=listaDeportistas.get(i).getNombre();
                vecDatos[1]=listaDeportistas.get(i).getApellido();
                vecDatos[2]=listaDeportistas.get(i).getCedula();
                vecDatos[3]=listaDeportistas.get(i).getMail();
                vecDatos[4]=listaDeportistas.get(i).getTelefono();
                vecDatos[5]="1";
                
            }
        }
    }
    
    public void editarUsuario(String cedulaVieja, String cedulaNueva, String nombre, String apellido, String mail, String numtel,int tipo,String nombreNino){}//fin editarUSuario
    
    public void llenarcmbBxninos(String vecNombre[]) {
        
        for (int i = 0; i < listaDeportistas.size(); i++) {
            vecNombre[i]=listaDeportistas.get(i).getNombre()+" "+listaDeportistas.get(i).getApellido();
        }
        
        
    }//fin llenarcbxninos
    
    public void desactivarUsuario(String cedula){}//fin cedula
}//fin cls_funcionesM2()
