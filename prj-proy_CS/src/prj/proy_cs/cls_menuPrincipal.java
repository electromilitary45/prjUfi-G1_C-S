
package prj.proy_cs;

import java.util.LinkedList;
import vistasM1.JF_menuRegistro;

/**
 * 
 * @author Derek
 */
public class cls_menuPrincipal {
    //-------------INSTANCIAS---------------------
//    JF_menu JFM = new JF_menu();//menu principal
    JF_menuRegistro JFMR = new JF_menuRegistro(); // menu de registro
    cls_menuRegistro clsMR = new cls_menuRegistro();
    //--------LINKEDLIST--------------]
    //LinkedList<Cls_clientes> listaUsuarios = new LinkedList<Cls_clientes>();
    
    public void menuP(char opcion){
    
        if(opcion=='A'){ // iniciar menu de registro || Modulo 1
            //JFM.dispose();
            JFMR.setVisible(true);
        }else{
        }
        
    }//fin metodo menuP(){}
    
}//fin clsMenuPrincipal
