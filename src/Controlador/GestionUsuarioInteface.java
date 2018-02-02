/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author PERFORMAMCE
 */
public interface GestionUsuarioInteface {
    public Boolean validacionIngreso (String usuario, String pass);
    public Boolean registrarUsuario();
    public Boolean buscarUsuario ();
    
    
    
}
