/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;

/**
 *
 * @author PERFORMAMCE
 */
public interface GestionProductoInterface {
    public Boolean validarIngreso (String usuario,String pass);
    public Boolean registrarProducto(Producto p);
    public Boolean buscarProducto();
    
}
