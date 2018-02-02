/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class AccesoAproAir {
 private String Usuario;
 private String textUsuario;
 private String passWord;

    public AccesoAproAir(String Usuario, String textUsuario, String passWord) {
        this.Usuario = Usuario;
        this.textUsuario = textUsuario;
        this.passWord = passWord;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getTextUsuario() {
        return textUsuario;
    }

    public void setTextUsuario(String textUsuario) {
        this.textUsuario = textUsuario;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "AccesoAproAir{" + "Usuario=" + Usuario + ", textUsuario=" + textUsuario + ", passWord=" + passWord + '}';
    }
 
 
 
}
