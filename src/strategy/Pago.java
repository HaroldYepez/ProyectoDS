/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import Modelo.Venta;

/**
 *
 * @author Harold
 */
public interface Pago {
    
    public boolean pagarPedido(Venta venta);
}
