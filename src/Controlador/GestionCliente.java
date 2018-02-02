/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class GestionCliente implements OperacionCrudCliente {

    private static ArrayList<Cliente> registroPersona;
    private Conexion conectar;

    public GestionCliente() {
        registroPersona = new ArrayList<>();
        
    }

    @Override
    public Boolean registrarPersona(Cliente p) {
        conectar = new Conexion();
        PreparedStatement ps;
        try {
            ps = conectar.crearConexion().prepareStatement("INSERT INTO `proairdb`.`cliente` (`numero_id`, `primernombcli`, `segundonomb`, `pri_apellido`, `seg_apellido`, `direccion`, `Telefono`) VALUES (?, ?, ?, ?, ?, ?, ?);");
            ps.setInt(1, p.getNumiden());
            ps.setString(2, p.getPrimNombre());
            ps.setString(3, p.getSegNombre());
            ps.setString(4, p.getPrimer_apellido());
            ps.setString(5, p.getSegundo_apellido());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getTelefono());
            ps.execute();
            ps.close();
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Boolean actualizarPersona(Cliente p) {
        for (int i = 0; i<registroPersona.size();i++){
         if(registroPersona.get(i).getNumiden().equals(p.getNumiden())) {
             registroPersona.set(i, p);
             return true;
         }  
        }
       return false; 
    }

    @Override 
    public Boolean eliminarPersona(Integer numiden) {
        for (int i = 0 ; i<registroPersona.size();i++){
            if (Objects.equals(registroPersona.get(i).getNumiden(), numiden)){
                registroPersona.remove(i);
                return true;
            }
        }
       return false; 
    }

    @Override
    public Cliente buscarPersona(Integer numiiden) {
        conectar = new Conexion();
        PreparedStatement ps;
        Cliente c;
        ResultSet rs;
        try {
            ps = conectar.crearConexion().prepareStatement("select * from proairdb.cliente where numero_id=?");
            ps.setInt(1, numiiden);
            ps.execute();
            c = new Cliente();
            rs = ps.getResultSet();
            while(rs.next()){
            c.setNumiden(rs.getInt(1));
            c.setPrimNombre(rs.getString(2));
            c.setSegNombre(rs.getString(3));
            c.setPrimer_apellido(rs.getString(4));
            c.setSegundo_apellido(rs.getString(5));
            c.setDireccion(rs.getString(6));
            c.setTelefono(rs.getInt(7));
            return c;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> mostrartodo() {
        return registroPersona;
         
    }
}
