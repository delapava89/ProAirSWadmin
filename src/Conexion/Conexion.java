/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERFORMAMCE
 */
public class Conexion {
    private static final String USER ="root";
    private static final String PASSWORD = "0000";
    private static final String URL = "jdbc:mysql://localhost:3306/proairdb";
    private static final String DRIVER ="com.mysql.jdbc.Driver" ;
    private Connection conexion;
    
    public Conexion (){
    
}
   public Connection crearConexion (){
       
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL,USER, PASSWORD);
            return conexion;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion ;
   }     
   
    
      public Conexion cerrarConexion (){
          conexion = null ;
          return (Conexion) conexion ;
      }
}
