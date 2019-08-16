/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Harold
 */
public class Pedido {
    protected boolean estado;
    protected int id;
    protected String tipoPedido;
    protected Date fechapedido;
    protected ArrayList<Producto> producto;
    
    public boolean agragarpedido(){
        return true;
    }
    
    public boolean modificarpedido(){
        return true;
    }
    
    public boolean eliminarPedido(){
        return true;
    }
}
