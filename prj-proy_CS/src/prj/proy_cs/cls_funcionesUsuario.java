/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj.proy_cs;

import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class cls_funcionesUsuario {
    
    //---
    protected LinkedList listaUsuario = new LinkedList();
    
    public void crearUsuario(){
        
        
        
        Cls_clientes clsC = new Cls_clientes();
        
        //clsC.setApellido(nombre);
        
        listaUsuario.add(clsC);
        
        
    }//derek
    
    public void mostrarUsaurio(){}
    
    public void desactivarUsuario(){
        
    }
    
    
    
}
