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
public class Insumos {
   private Integer idInsumo;
   private String nombreInsumo;
   private Integer idProveedor;
   private Integer idFormula;
   private Date fechaVencimiento;
   private float contenido;

    public Insumos() {
    }

    public Insumos(Integer idInsumo, String nombreInsumo, Integer idProveedor, Integer idFormula, Date fechaVencimiento, float contenido) {
        this.idInsumo = idInsumo;
        this.nombreInsumo = nombreInsumo;
        this.idProveedor = idProveedor;
        this.idFormula = idFormula;
        this.fechaVencimiento = fechaVencimiento;
        this.contenido = contenido;
    }

    public Integer getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(Integer idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(Integer idFormula) {
        this.idFormula = idFormula;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public float getContenido() {
        return contenido;
    }

    public void setContenido(float contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Insumos{" + "idInsumo=" + idInsumo + ", nombreInsumo=" + nombreInsumo + ", idProveedor=" + idProveedor + ", idFormula=" + idFormula + ", fechaVencimiento=" + fechaVencimiento + ", contenido=" + contenido + '}';
    }
   
   
    
   
    
}
