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
import Singleton.ConexionDB;
import java.sql.SQLException;

public class ProyectoDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionDB conec=new ConexionDB();
        conec.getConeccion();
        conec.getTabla("select * from empleado");
    }
    
}
