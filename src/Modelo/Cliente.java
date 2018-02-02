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
public class Cliente {
  private Integer numiden;
  private String primNombre;
  private String segNombre;
  private String primer_apellido;
  private String segundo_apellido;
  private String direccion;
  private Integer telefono;

    public Cliente() {
    }

    public Cliente(Integer numiden, String primNombre, String segNombre, String primer_apellido, String segundo_apellido, String direccion, Integer telefono) {
        this.numiden = numiden;
        this.primNombre = primNombre;
        this.segNombre = segNombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getNumiden() {
        return numiden;
    }

    public void setNumiden(Integer numiden) {
        this.numiden = numiden;
    }

    public String getPrimNombre() {
        return primNombre;
    }

    public void setPrimNombre(String primNombre) {
        this.primNombre = primNombre;
    }

    public String getSegNombre() {
        return segNombre;
    }

    public void setSegNombre(String segNombre) {
        this.segNombre = segNombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "numiden=" + numiden + ", primNombre=" + primNombre + ", segNombre=" + segNombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }


    
    
}
