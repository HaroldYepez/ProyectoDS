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
public abstract class PermisoGerencia {
    
    protected UsuarioSistema Usuario;
    
    public abstract void permisoGerencia(UsuarioSistema usuario);
}
