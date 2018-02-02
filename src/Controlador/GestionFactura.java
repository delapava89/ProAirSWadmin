/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Vista.FacturaGUI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERFORMAMCE
 */
public class GestionFactura implements OperacionCrudFactura{

    private Conexion co;
    
    public GestionFactura() {
    }

    public Integer ultimoId (){
        int id=0;
        co = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = co.crearConexion().prepareStatement("select max(idfactura) from proairdb.factura");
            ps.execute();
            rs = ps.getResultSet();
            while(rs.next()){
            id = rs.getInt(1);
            }
            return id;
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    @Override
    public Boolean registrarFactura(FacturaGUI f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean actualizarFactura(FacturaGUI f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public Boolean eliminarFcatura(FacturaGUI f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FacturaGUI buscarFactura(int idfactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<FacturaGUI> mostrarFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
