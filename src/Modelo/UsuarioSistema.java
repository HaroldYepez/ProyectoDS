/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Harold
 */
public class UsuarioSistema extends Empleado{
    protected String user;
    protected String password;
    protected boolean conexionActiva;
    
    public boolean login(){
        return true;
    }
    
    public boolean logout(){
        return true;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isConexionActiva() {
        return conexionActiva;
    }

    public void setConexionActiva(boolean conexionActiva) {
        this.conexionActiva = conexionActiva;
    }
    
    
    
}
