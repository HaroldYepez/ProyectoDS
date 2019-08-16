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
public class PagoEfectivo implements Pago{
    
    protected float totalDinero;
    
    public float calculoVuelto(){
        return 0f;
    }
    
    @Override
    public boolean pagarPedido(Venta venta) {
        return true;
    }
}
