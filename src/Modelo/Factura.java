/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Currency;

/**
 *
 * @author Harold
 */
public class Factura extends Comprobante{
    protected int idFactura;
    protected Currency subtotal;
    protected Currency iva;
}
