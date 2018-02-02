/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FacturaGUI;
import java.util.ArrayList;

/**
 *
 * @author PERFORMAMCE
 */
public interface OperacionCrudFactura {
    public Boolean registrarFactura(FacturaGUI f);
    public Boolean actualizarFactura(FacturaGUI f);
    public Boolean eliminarFcatura(FacturaGUI f);
    public FacturaGUI buscarFactura(int idfactura);
    public ArrayList<FacturaGUI> mostrarFactura ();
    
}
