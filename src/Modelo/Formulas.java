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
public class Formulas {
    private Integer idformula;
    private String nombreFormula;
    private String descripFormula;
    private Integer idinsumo;
    private Integer idProducto;
    private float medidas;

    public Formulas() {
    }

    public Formulas(Integer idformula, String nombreFormula, String descripFormula, Integer idinsumo, Integer idProducto, float medidas) {
        this.idformula = idformula;
        this.nombreFormula = nombreFormula;
        this.descripFormula = descripFormula;
        this.idinsumo = idinsumo;
        this.idProducto = idProducto;
        this.medidas = medidas;
    }

    public Integer getIdformula() {
        return idformula;
    }

    public void setIdformula(Integer idformula) {
        this.idformula = idformula;
    }

    public String getNombreFormula() {
        return nombreFormula;
    }

    public void setNombreFormula(String nombreFormula) {
        this.nombreFormula = nombreFormula;
    }

    public String getDescripFormula() {
        return descripFormula;
    }

    public void setDescripFormula(String descripFormula) {
        this.descripFormula = descripFormula;
    }

    public Integer getIdinsumo() {
        return idinsumo;
    }

    public void setIdinsumo(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public float getMedidas() {
        return medidas;
    }

    public void setMedidas(float medidas) {
        this.medidas = medidas;
    }

    @Override
    public String toString() {
        return "Formulas{" + "idformula=" + idformula + ", nombreFormula=" + nombreFormula + ", descripFormula=" + descripFormula + ", idinsumo=" + idinsumo + ", idProducto=" + idProducto + ", medidas=" + medidas + '}';
    }
    
    
    
    
    
    
    
}
