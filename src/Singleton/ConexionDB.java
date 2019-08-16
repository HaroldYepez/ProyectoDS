/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.sql.Connection;

/**
 *
 * @author Harold
 */
public class ConexionDB {
    private Connection coneccion;

    public Connection getConeccion() {
        return coneccion;
    }
    
    public void conectar(){
        
    }
    
    public void cerrarConeccion(){
        
    }
}
