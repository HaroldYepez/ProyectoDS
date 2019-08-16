/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Modelo.UsuarioSistema;

/**
 *
 * @author Harold
 */
public class PermisoDecorator extends PermisoGerencia{
    
    public void permisoGerencia(UsuarioSistema usuario){
        
    }
    
    public boolean asignarPermiso(){
        return true;
    }
}
