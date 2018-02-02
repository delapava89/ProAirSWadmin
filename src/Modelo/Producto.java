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
public class Producto {
 private Integer codigoproducto;
 private String nombre;
 private Integer cantidad;
 private Double valorunitario;
 private Double subtotal;
 private Double descuento;

    public Producto() {
    }

    public Producto(Integer codigoproducto, String nombre, Integer cantidad, Double valorunitario, Double subtotal, Double descuento) {
        this.codigoproducto = codigoproducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorunitario = valorunitario;
        this.subtotal = subtotal;
        this.descuento = descuento;
    }

    public Integer getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(Integer codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(Double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    
    
    @Override
    public String toString() {
        return "Producto{" + "codigoproducto=" + codigoproducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", valorunitario=" + valorunitario + ", subtotal=" + subtotal + '}';
    }
 
 
}
