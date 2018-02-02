/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PERFORMAMCE
 */
public class Usuario {
    private Integer id_usuario;
    private String usuario;
    private String contra;

    public Usuario(Integer id_usuario, String usuario, String contra) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contra = contra;
    }
    
    public Usuario(){
        
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
}
