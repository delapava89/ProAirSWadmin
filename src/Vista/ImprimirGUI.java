/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Imprimir;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PERFORMAMCE
 */
public class ImprimirGUI extends JFrame {

    private String texto;
    private JTextField txtCampo;
    private JButton btnImprimir;
    private Imprimir imp;
    private JPanel principalPanel;
    private JPanel etiqPanel;
    private JPanel otroPanel;
    private JLabel informacion;

    public ImprimirGUI() {
        inicializar();
       
    }

    private void inicializar() {
        principalPanel = new JPanel(new BorderLayout());
        etiqPanel = new JPanel(new FlowLayout());
        otroPanel = new JPanel(new FlowLayout());
        informacion = new JLabel("ESCRIBA ALGO EN EL CAMPO Y HAGA CLIC EN IMPRIMIR...");
        txtCampo = new JTextField(30);
        btnImprimir = new JButton("IMPRIMIR");
        otroPanel.add(txtCampo);
        otroPanel.add(btnImprimir);
        etiqPanel.add(informacion);
        txtCampo.setToolTipText("ESCRIBA ALGO AQUÍ...");
        btnImprimir.setToolTipText("CLIC AQUI PARA IMPRIMIR...");
        principalPanel.add(etiqPanel, BorderLayout.NORTH);
        principalPanel.add(otroPanel, BorderLayout.CENTER);
        getContentPane().add(principalPanel);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnImprimirAcciones();

    }

    private void imprimirFactura(){
        texto = String.valueOf(txtCampo.getText());
            if (!texto.equals("")) {
                imp = new Imprimir();
                imp.imprimir(texto);
            } else {
                System.out.println("NO SE IMPRIME NADA EN BLANCO...");
            }
            txtCampo.requestFocus();
            txtCampo.select(0, texto.length());
    }
    
    private void btnImprimirAcciones() {
        btnImprimir.addActionListener((ActionEvent evt) -> {
            imprimirFactura();
        });
    }


}
