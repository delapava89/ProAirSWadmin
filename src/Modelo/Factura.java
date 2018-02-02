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
public class Factura {
    private Integer idFactura;
    private Integer idCliente;
    private Date fechaFactura;
    private String tipoPago;
    private Double valorTotal;
    private Double subTotal;
    private Double valorIva;
    private Integer cantidadItems;
    public Factura() {
    }

    public Factura(Integer idFactura, Integer idCliente, Date fechaFactura, String tipoPago, Double valorTotal, Double subTotal, Double valorIva, Integer cantidadItems) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.fechaFactura = fechaFactura;
        this.tipoPago = tipoPago;
        this.valorTotal = valorTotal;
        this.subTotal = subTotal;
        this.valorIva = valorIva;
        this.cantidadItems = cantidadItems;
    }

    
    
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getValorIva() {
        return valorIva;
    }

    public void setValorIva(Double valorIva) {
        this.valorIva = valorIva;
    }

    public Integer getCantidadItems() {
        return cantidadItems;
    }

    public void setCantidadItems(Integer cantidadItems) {
        this.cantidadItems = cantidadItems;
    }

    
    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", idCliente=" + idCliente + ", fechaFactura=" + fechaFactura + ", tipoPago=" + tipoPago + '}';
    }
    
    
    
    
    
    
    
}
