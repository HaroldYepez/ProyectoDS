/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import strategy.Pago;

/**
 *
 * @author Harold
 */
public class Venta {
    
    protected float total;
    protected Cliente cliente;
    protected Vendedor vendedor;
    protected Pago metodoPago;
    
    public boolean pagarVenta(Pago tipoPago){
        return true;
    }
}
