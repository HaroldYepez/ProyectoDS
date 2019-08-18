/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Administrador;
import Modelo.Producto;
import Vista.VistaAdministrador;

/**
 *
 * @author Harold
 */
public class CtrlAdministrador {
    protected Administrador administrador;
    protected VistaAdministrador vistaAdministrador;
    
    public void controladorAdministracion(){
        
    }
    public void guadarProducto(){
        Producto prod = vistaAdministrador.obtenerProducto();
        administrador.ingresarProducto(prod);
    }
}
