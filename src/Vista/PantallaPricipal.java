/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Descripcion;

/**
 *
 * @author LENOVO
 */
public class PantallaPricipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPricipal
     */
    public PantallaPricipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JLabel jLabel1fondo = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1Imagenprin1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2IImagenpanprin2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1imagenprin3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1imaprin4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1ImagenHoriz = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1ImagprinHoriz = new javax.swing.JLabel();
        javax.swing.JMenuBar jMenuBar1Salir = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1salir = new javax.swing.JMenu();
        javax.swing.JMenu jMenu2descripcion = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem1Inventario = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem2factura = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1fondo.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG-20171023-WA0022.jpg"))); // NOI18N
        getContentPane().add(jLabel1fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 930, -1));

        jLabel1Imagenprin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images (1).jpg"))); // NOI18N
        jLabel1Imagenprin1.setText("jLabel1");
        getContentPane().add(jLabel1Imagenprin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, -40, 290, 220));

        jLabel2IImagenpanprin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceite.png"))); // NOI18N
        jLabel2IImagenpanprin2.setText("jLabel2");
        getContentPane().add(jLabel2IImagenpanprin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, 250, 240));

        jLabel1imagenprin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aromas.jpg"))); // NOI18N
        jLabel1imagenprin3.setText("jLabel1");
        getContentPane().add(jLabel1imagenprin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -6, 250, 180));

        jLabel1imaprin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asdasdasd.png"))); // NOI18N
        jLabel1imaprin4.setText("jLabel1");
        getContentPane().add(jLabel1imaprin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 170));

        jLabel1ImagenHoriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/petalos.png"))); // NOI18N
        jLabel1ImagenHoriz.setText("jLabel1");
        getContentPane().add(jLabel1ImagenHoriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 150, 280, 260));

        jLabel1ImagprinHoriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spa.jpg"))); // NOI18N
        jLabel1ImagprinHoriz.setText("jLabel1");
        getContentPane().add(jLabel1ImagprinHoriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 210, 300));

        jMenu1salir.setText("SALIR");
        jMenuBar1Salir.add(jMenu1salir);

        jMenu2descripcion.setText("DESCRIPCION DEL PRODUCTO");
        jMenu2descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2descripcionMouseClicked(evt);
            }
        });

        jMenuItem1Inventario.setText("INVENTARIO");
        jMenuItem1Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1InventarioActionPerformed(evt);
            }
        });
        jMenu2descripcion.add(jMenuItem1Inventario);

        jMenuItem2factura.setText("Factura");
        jMenuItem2factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2facturaActionPerformed(evt);
            }
        });
        jMenu2descripcion.add(jMenuItem2factura);

        jMenuBar1Salir.add(jMenu2descripcion);

        setJMenuBar(jMenuBar1Salir);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1InventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1InventarioActionPerformed

    private void jMenuItem2facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2facturaActionPerformed
        FacturaGUI f = new FacturaGUI();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2facturaActionPerformed

    private void jMenu2descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2descripcionMouseClicked
        DescripcionProducto dp = new DescripcionProducto();
        dp.setVisible(true);
    }//GEN-LAST:event_jMenu2descripcionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
