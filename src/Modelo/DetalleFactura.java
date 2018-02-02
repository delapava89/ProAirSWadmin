/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dalia
 */
public class DetalleFactura {
    private Integer idDetallFactura;
    private Integer Factura_idFactura;
    private Integer producto_idProducto;
    private String nombre;
    private Integer cant;
    private double precioUnit;
    private double subTotal;

    public DetalleFactura() {
    }

    public DetalleFactura(Integer idDetallFactura, Integer Factura_idFactura, Integer producto_idProducto, Integer cant, double precioUnit, double subTotal) {
        this.idDetallFactura = idDetallFactura;
        this.Factura_idFactura = Factura_idFactura;
        this.producto_idProducto = producto_idProducto;
        this.cant = cant;
        this.precioUnit = precioUnit;
        this.subTotal = subTotal;
    }

    public Integer getIdDetallFactura() {
        return idDetallFactura;
    }

    public void setIdDetallFactura(Integer idDetallFactura) {
        this.idDetallFactura = idDetallFactura;
    }

    public Integer getFactura_idFactura() {
        return Factura_idFactura;
    }

    public void setFactura_idFactura(Integer Factura_idFactura) {
        this.Factura_idFactura = Factura_idFactura;
    }

    public Integer getProducto_idProducto() {
        return producto_idProducto;
    }

    public void setProducto_idProducto(Integer producto_idProducto) {
        this.producto_idProducto = producto_idProducto;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public String toString() {
        return "DetalleFactura{" + "idDetallFactura=" + idDetallFactura + ", Factura_idFactura=" + Factura_idFactura + ", producto_idProducto=" + producto_idProducto + ", cant=" + cant + ", precioUnit=" + precioUnit + ", subTotal=" + subTotal + '}';
    }
    
    
    
}
