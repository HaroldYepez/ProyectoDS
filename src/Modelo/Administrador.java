/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class Administrador extends UsuarioSistema{
    
    public boolean ingresarProducto(String id){
        return true;
    }
    
    public boolean modificarProducto(String id){
        return true;
    }
    
    public boolean modificarStockProducto(String id){
        return true;
    }
    
    public boolean ingresarUsuario(String cedula){
        return true;
    }
    
    public boolean modificarUsuario(String cedula){
        return true;
    }
    
    public boolean changeRol(UsuarioSistema user, String rol){
        return true;
    }
    
    public ArrayList<Producto> consultarProductos(){
        return null;
    }
    
    public ArrayList<UsuarioSistema> consultarusuarios(){
        return null;
    }
    
}
