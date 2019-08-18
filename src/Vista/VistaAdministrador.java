/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Producto;
import Modelo.UsuarioSistema;
import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class VistaAdministrador {
    
    public void showSceneAdministrador(){
        
    }
    public Producto obtenerProducto(){
        //obtiene los datos de los textbox y crea el objeto producto
        Producto prod = new Producto();
//        prod.setId(id);
//        prod.setCategoria(categoria);
//        prod.setDescripcion(descripcion);
//        prod.setEstado(true);
//        prod.setNombre(nombre);
//        prod.setPrecio(0);
        
        return prod;
    }
    public void mostrarProductoEditar(Producto prod){
        //mostrar los datos del producto en pantalla
        //guarda los cambios
    }
    public void mostrarProductoStock(Producto prod){
        //mostrar los datos del producto (solo el stock) en pantalla
        //guarda los cambios
    }
    
    public UsuarioSistema obtenerUsuario(){
        //obtiene los datos de los textbox y crea el objeto UsuarioSistema
        UsuarioSistema usuSis = new UsuarioSistema();
//        usuSis.setUser(user);
//        usuSis.setPassword(password);
        return usuSis;
    }
    
    public void mostrarUsuarioEditar(UsuarioSistema usuSis){
        //mostrar los datos del usuario en pantalla
        //guarda los cambios
    }
    public void mostrarProductos(ArrayList<Producto> productos){
        //mostrar los productos en pantalla
        
    }
    public void mostrarUsuarios(ArrayList<UsuarioSistema> usuarios){
        //mostrar los usuarios en pantalla
        
    }
}
