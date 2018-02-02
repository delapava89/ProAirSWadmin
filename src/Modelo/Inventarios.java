/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Dalia
 */
public class Inventarios {
    private Integer idInventario;
    private Integer idProducto;
    private Integer maxInventario;
    private Integer minInventario;
    private Date fechaRegistro;

    public Inventarios() {
    }

    public Inventarios(Integer idInventario, Integer idProducto, Integer maxInventario, Integer minInventario, Date fechaRegistro) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.maxInventario = maxInventario;
        this.minInventario = minInventario;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getMaxInventario() {
        return maxInventario;
    }

    public void setMaxInventario(Integer maxInventario) {
        this.maxInventario = maxInventario;
    }

    public Integer getMinInventario() {
        return minInventario;
    }

    public void setMinInventario(Integer minInventario) {
        this.minInventario = minInventario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Inventarios{" + "idInventario=" + idInventario + ", idProducto=" + idProducto + ", maxInventario=" + maxInventario + ", minInventario=" + minInventario + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
    
    
    
}
