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
public class Vendedor extends UsuarioSistema{
    
    public boolean agragarCleinte(){
        return true;
    }
    
    public boolean editarCliente(Cliente c){
        return true;
    }
    
    public ArrayList<EnvioADomicilo> listaEntregas(){
        return null;
    }
    
    public boolean ingresarCotizacion(Cotizacion c){
        return true;
    }
    
    public boolean editarCotizacion(Cotizacion c){
        return true;
    }
    
    public boolean ingresarPedido(Pedido p){
        return true;
    }
    
    public boolean ingresarNotaCredito(Pedido p){
        return true;
    }
    
    public ArrayList<Cliente> consultarClientes(){
        return null;
    }
    
    public ArrayList<Producto> consultarProductos(){
        return null;
    }
}
