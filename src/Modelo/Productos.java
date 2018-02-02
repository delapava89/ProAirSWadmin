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
public class Productos {
    private Integer idProducto;
    private Integer idCategoria;
    private String codBarras;
    private String descripcion;
    private String marca;
    private String fabricante;
    private Date fechaFabric;
    private Date fechaRegistro;
    private Integer loteFabric;

    public Productos() {
    }

    public Productos(Integer idProducto, Integer idCategoria, String codBarras, String descripcion, String marca, String fabricante, Date fechaFabric, Date fechaRegistro, Integer loteFabric) {
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.codBarras = codBarras;
        this.descripcion = descripcion;
        this.marca = marca;
        this.fabricante = fabricante;
        this.fechaFabric = fechaFabric;
        this.fechaRegistro = fechaRegistro;
        this.loteFabric = loteFabric;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getFechaFabric() {
        return fechaFabric;
    }

    public void setFechaFabric(Date fechaFabric) {
        this.fechaFabric = fechaFabric;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getLoteFabric() {
        return loteFabric;
    }

    public void setLoteFabric(Integer loteFabric) {
        this.loteFabric = loteFabric;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProducto=" + idProducto + ", idCategoria=" + idCategoria + ", codBarras=" + codBarras + ", descripcion=" + descripcion + ", marca=" + marca + ", fabricante=" + fabricante + ", fechaFabric=" + fechaFabric + ", fechaRegistro=" + fechaRegistro + ", loteFabric=" + loteFabric + '}';
    }
    
    
    
    
}
