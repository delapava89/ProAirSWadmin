/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface OperacionesCrudProducto {
     public  Boolean registrarProducto(Producto p);
    public Boolean actualizarProducto( Producto P);
    public Boolean eliminarProducto(Integer numiden);
    public Producto buscarProducto(Integer numiiden);
    public ArrayList<Producto> mostrartodo();

}
