/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Administrador;
import Modelo.Producto;
import Modelo.UsuarioSistema;
import Vista.VistaAdministrador;
import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class CtrlAdministrador {
    protected Administrador administrador;
    protected VistaAdministrador vistaAdministrador;
    
    public void controladorAdministrador(){
        administrador = new Administrador();
        vistaAdministrador = new VistaAdministrador();
    }
    public boolean guardarProducto(){
        Producto prod = vistaAdministrador.obtenerProducto();
        boolean valor = administrador.ingresarProducto(prod);
        return valor;
    }
    
    public boolean editarProducto(String id){
        Producto prod = administrador.modificarProducto(id);
        vistaAdministrador.mostrarProductoEditar(prod);
        return true;
    }
    
    public boolean editarStockProducto(String id){
        Producto prod = administrador.modificarStockProducto(id);
        vistaAdministrador.mostrarProductoEditar(prod);
        return true;
    }
    
    public boolean guardarUsuario(){
        UsuarioSistema usuSis = vistaAdministrador.obtenerUsuario();
        boolean valor = administrador.ingresarUsuario(usuSis);
        return valor;
    }
    
    public boolean editarUsuario(String cedula){
        UsuarioSistema usuSis = administrador.modificarUsuario(cedula);
        vistaAdministrador.mostrarUsuarioEditar(usuSis);
        return true;
    }
    
    public void consultarProductos(){
        ArrayList<Producto> productos = administrador.consultarProductos();
        vistaAdministrador.mostrarProductos(productos);
    }
    
    public void consultarUsuarios(){
        ArrayList<UsuarioSistema> usuarios = administrador.consultarUsuarios();
        vistaAdministrador.mostrarUsuarios(usuarios);
    }
}
