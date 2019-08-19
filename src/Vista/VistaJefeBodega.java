/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.Envio;
import Modelo.Producto;
import Modelo.RepartidorBodega;
import Modelo.Ruta;
import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class VistaJefeBodega {
    
    public ArrayList<Envio> loadEnvios(){
        return null;
    }
    
    public void showSceneJefeBodega(){
        
    }
    
    public void mostrarProductos(ArrayList<Producto> productos){
        //mostrar los productos en pantalla
        
    }
    
    public Ruta obtenerRuta(){
        Ruta ruta = new Ruta();
        //ruta.setDireccion(direccion);
        return ruta;
    }
    
    public void mostrarRepartidor(RepartidorBodega rep){
        //muestra al repartidor y la ruta asignados
    }
}
