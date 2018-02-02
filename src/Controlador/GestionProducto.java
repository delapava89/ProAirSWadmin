/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Producto;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class GestionProducto implements OperacionesCrudProducto{
   private static ArrayList<Producto> registroProducto;

    public GestionProducto() {
        
        registroProducto = new ArrayList<>();
    }

   
   
   
   
    @Override
    public Boolean registrarProducto(Producto p) {
        return registroProducto .add(p);
    }

    @Override
    public Boolean actualizarProducto(Producto P) {
       for (int i = 0; i<registroProducto.size();i++){
         if(registroProducto.get(i).getCodigoproducto().equals(P.getCodigoproducto())) {
             registroProducto.set(i, P);
             return true;
         }  
        }
       return false;
    }

    @Override
    public Boolean eliminarProducto(Integer numiden) {
       for (int i = 0 ; i< registroProducto.size();i++){
           Object Codigoproducto = null;
            if (Objects.equals( registroProducto.get(i).getCodigoproducto(),Codigoproducto )){
                 registroProducto.remove(i);
                return true;
            }
        }
       return false;
    }

    @Override
    public Producto buscarProducto(Integer numiiden) {
        for (Producto P :registroProducto ) {
            Object Codigoproducto = null;
         if(P.getCodigoproducto().equals(Codigoproducto)) {
             return P;
         }  
            
        }
       return null;  

    }

    @Override
    public ArrayList<Producto> mostrartodo() {
         return registroProducto;

    }
 
}
