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
public class LocalDeEmpresa {
    protected String idLocal;
    protected String direccion;
    protected String telefono;
    protected Inventario inventario;
    
    public boolean updateInventario(){
        return true;
    }
}
