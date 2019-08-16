/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Harold
 */
public class Inventario {
    
    protected int cantidadInicial;
    protected int cantidadDisponible;
    
    public Producto buscarProducto(String id){
        return null;
    }
    
    public boolean agregarProducto(){
        return true;
    }
    
    public boolean eliminarProducto(String id){
        return true;
    }
    
    public boolean modificarProducto(String id){
        return true;
    }
    
    public Producto filtrarBusqueda(String nombre,String descripcion,String categoria){
        return null;
    }
}
