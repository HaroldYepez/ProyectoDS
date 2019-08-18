/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import Modelo.Inventario;

/**
 *
 * @author Harold
 */
public class Administrador extends UsuarioSistema{
    
    public boolean ingresarProducto(Producto prod){
        //ingresa el producto en la base de datos
        
        return true;
    }
    
    public Producto modificarProducto(String id){
        //Producto prod = carga el prooducto de la base de datos
        
        return null;
    }
    
    
    
    public Producto modificarStockProducto(String id){
        //Producto prod = carga el prooducto de la base de datos
        return null;
    }
    
    public boolean ingresarUsuario(UsuarioSistema Usuario){
         //ingresa el usuario en la base de datos
        return true;
    }
    
    public UsuarioSistema modificarUsuario(String cedula){
        //UsuarioSistema = carga el usuario de la base de datos
        return null;
    }
    
    public boolean changeRol(UsuarioSistema user, String rol){
        //ni idea
        return true;
    }
    
    public ArrayList<Producto> consultarProductos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        //carga en la lista los productos desde la base de datos
        return productos;
    }
    
    public ArrayList<UsuarioSistema> consultarUsuarios(){
        ArrayList<UsuarioSistema> usuarios = new ArrayList<UsuarioSistema>();
        //carga en la lista los usuarios desde la base de datos
        return usuarios;
    }
    
}
