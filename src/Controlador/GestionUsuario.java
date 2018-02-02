/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERFORMAMCE
 */
public class GestionUsuario  implements GestionUsuarioInteface {
    private Conexion co;
    
    public GestionUsuario (){
        
    }

    @Override
    public Boolean validacionIngreso(String usuario, String pass) {
        co = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = co.crearConexion().prepareStatement("Select usuario, constra from proairdb.usuario where usuario=? and constra =?");
            ps.setString(1, usuario);
            ps.setString(2, pass);
            ps.execute();
            rs = ps.getResultSet();
            return rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
            
        
    }

    @Override
    public Boolean registrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean buscarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
