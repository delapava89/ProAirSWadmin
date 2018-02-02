/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;

/**
 *
 * @author PERFORMAMCE
 */
public class Imprimir {

    Font fuente = new Font("Arial", Font.PLAIN, 12);
    PrintJob pj;
    Graphics pagina;

    public Imprimir(String nombreArchivo) {
        pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "Factura "+nombreArchivo, null);
    }

    public void imprimir(String Cadena) {
        try {
            pagina = pj.getGraphics();
            pagina.setFont(fuente);
            pagina.setColor(Color.black);
            pagina.drawString(Cadena, 60, 60);
            pagina.dispose();
            pj.end();
        } catch (Exception e) {
            System.out.println("LA IMPRESION HA SIDO CANCELADA..." +e);
        }
    }

}
