/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.JefeBodega;
import Modelo.Producto;
import Modelo.Ruta;
import Vista.VistaJefeBodega;
import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class CtrlJefeBodega {
    protected JefeBodega jefeBodega;
    protected VistaJefeBodega vistaJefeBodega;
    
    public void controladorJefeBodega(){
        
    }
    public void consultarProductos(){
        ArrayList<Producto> productos = jefeBodega.consultarProductos();
        vistaJefeBodega.mostrarProductos(productos);
    }
    
    public boolean guardarRuta(){
        Ruta ruta = vistaJefeBodega.obtenerRuta();
        boolean valor = jefeBodega.crearRuta(ruta);
        return valor;
    }
}
