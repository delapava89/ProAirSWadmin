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
public class DetalleInventario {
    private Integer idDetinvent;
    private Integer idInventario;
    private Integer idProducto;
    private Date fechaMovimiento;
    private String descripcionMovim;
    private float cantItem;
    private float costoUnit;
    private float costoTotal;
    private String tipoMovimiento;
    private float cantRest;

    public DetalleInventario() {
    }

    public DetalleInventario(Integer idDetinvent, Integer idInventario, Integer idProducto, Date fechaMovimiento, String descripcionMovim, float cantItem, float costoUnit, float costoTotal, String tipoMovimiento, float cantRest) {
        this.idDetinvent = idDetinvent;
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.fechaMovimiento = fechaMovimiento;
        this.descripcionMovim = descripcionMovim;
        this.cantItem = cantItem;
        this.costoUnit = costoUnit;
        this.costoTotal = costoTotal;
        this.tipoMovimiento = tipoMovimiento;
        this.cantRest = cantRest;
    }

    public Integer getIdDetinvent() {
        return idDetinvent;
    }

    public void setIdDetinvent(Integer idDetinvent) {
        this.idDetinvent = idDetinvent;
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

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getDescripcionMovim() {
        return descripcionMovim;
    }

    public void setDescripcionMovim(String descripcionMovim) {
        this.descripcionMovim = descripcionMovim;
    }

    public float getCantItem() {
        return cantItem;
    }

    public void setCantItem(float cantItem) {
        this.cantItem = cantItem;
    }

    public float getCostoUnit() {
        return costoUnit;
    }

    public void setCostoUnit(float costoUnit) {
        this.costoUnit = costoUnit;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public float getCantRest() {
        return cantRest;
    }

    public void setCantRest(float cantRest) {
        this.cantRest = cantRest;
    }

    @Override
    public String toString() {
        return "DetalleInventario{" + "idDetinvent=" + idDetinvent + ", idInventario=" + idInventario + ", idProducto=" + idProducto + ", fechaMovimiento=" + fechaMovimiento + ", descripcionMovim=" + descripcionMovim + ", cantItem=" + cantItem + ", costoUnit=" + costoUnit + ", costoTotal=" + costoTotal + ", tipoMovimiento=" + tipoMovimiento + ", cantRest=" + cantRest + '}';
    }
    
    
    
    
    
    
    
}
