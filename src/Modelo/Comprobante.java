/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Currency;
import java.util.Date;

/**
 *
 * @author Harold
 */
public class Comprobante {
    protected String detalle;
    protected Date fechaEmision;
    protected Currency total;
    
    public boolean generarPDF(){
        return true;
    }
}
