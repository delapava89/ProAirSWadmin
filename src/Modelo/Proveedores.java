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

    
public class Proveedores{
    private Integer idProveedor;
    private Integer numIdent;
    private String razonSocial;

    public Proveedores() {
    }

    public Proveedores(Integer idProveedor, Integer numIdent, String razonSocial) {
        this.idProveedor = idProveedor;
        this.numIdent = numIdent;
        this.razonSocial = razonSocial;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(Integer numIdent) {
        this.numIdent = numIdent;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedor=" + idProveedor + ", numIdent=" + numIdent + ", razonSocial=" + razonSocial + '}';
    }
   
    
    
    
}
