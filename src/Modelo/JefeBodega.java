/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author Harold
 */
public class JefeBodega {
    
    protected Map<Ruta,ArrayList<Envio>> rutaEntrega;
    protected Queue<RepartidorBodega> colaRepartidores;
    protected Envio envio;    
    
    public ArrayList<Producto> consultarProductos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        //carga en la lista los productos desde la base de datos
        return productos;
        
    }
    
    public boolean crearRuta(Ruta ruta){
        //guarda la ruta en la base de datos
        return true;
    }
    
    public boolean notificarEntregaRealizada(){
        return true;
    }
    
    public boolean asignarRuta(RepartidorBodega repartidor){
        return true;
    }
}
