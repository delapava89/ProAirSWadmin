/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface OperacionCrudCliente {
   
     public  Boolean registrarPersona(Cliente p);
    public Boolean actualizarPersona( Cliente P);
    public Boolean eliminarPersona(Integer numiden);
    public Cliente buscarPersona(Integer numiiden);
    public ArrayList<Cliente> mostrartodo();

}
