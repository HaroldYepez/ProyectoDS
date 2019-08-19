/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Harold
 */
public class ConexionDB {
    private Connection coneccion;
    private String user;
    private String password;
    private String db="";
    private String host="localhost:8889";
    private String server="jdbc:mysql://"+host+"/"+db;

    public Connection getConeccion() {
        coneccion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            coneccion=DriverManager.getConnection(server, user, password);
        }catch(Exception e){
            System.out.println(String.valueOf(e));    
        }
        return coneccion;
    }
    
    public void conectar(){
        
    }
    
    public ResultSet getTabla(String consulta){
        coneccion=getConeccion();
        ResultSet datos=null;
        Statement st;
        try{
            st=coneccion.createStatement();
            datos=st.executeQuery(consulta);
        }catch(Exception e){
            System.out.print(e.toString());
        }
        return datos;
    }
    
    public void cerrarConeccion(){
        
    }
}
