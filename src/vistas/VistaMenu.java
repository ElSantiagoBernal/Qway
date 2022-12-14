/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import bridge.Sandwich;
import controladores.ControladorDispositivo;
import controladores.ControladorFactura;
import java.awt.Frame;

/**
 *
 * @author andre
 */
public class VistaMenu extends javax.swing.JFrame {

    public static int vibrador = 0;
    public static Sandwich sandwich = null;
    public static double valorSandwich = 0;
    /**
     * Creates new form VistaMenu
     */
    ControladorFactura controladorFactura;
    ControladorDispositivo controladorDispositivo;

    public VistaMenu() {
        initComponents();
        setLocationRelativeTo(this);
        controladorFactura = new ControladorFactura();
        controladorDispositivo = new ControladorDispositivo();
    }

    public ControladorFactura getControladorFactura() {
        return controladorFactura;
    }

    public ControladorDispositivo getControladorDispositivo() {
        return controladorDispositivo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSandwich = new javax.swing.JButton();
        btnDispositivos = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 210, 106));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSandwich.setBackground(new java.awt.Color(243, 210, 106));
        btnSandwich.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnSandwich.setForeground(new java.awt.Color(0, 0, 0));
        btnSandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo.png"))); // NOI18N
        btnSandwich.setText("SANDWICH");
        btnSandwich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSandwich.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSandwich.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo_Click.png"))); // NOI18N
        btnSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSandwichActionPerformed(evt);
            }
        });
        jPanel1.add(btnSandwich, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, 35));

        btnDispositivos.setBackground(new java.awt.Color(243, 210, 106));
        btnDispositivos.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnDispositivos.setForeground(new java.awt.Color(0, 0, 0));
        btnDispositivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo.png"))); // NOI18N
        btnDispositivos.setText("DISPOSITIVOS");
        btnDispositivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDispositivos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDispositivos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo_Click.png"))); // NOI18N
        btnDispositivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispositivosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDispositivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, 35));

        btnFacturas.setBackground(new java.awt.Color(243, 210, 106));
        btnFacturas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(0, 0, 0));
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo.png"))); // NOI18N
        btnFacturas.setText("FACTURAS");
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo_Click.png"))); // NOI18N
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, 35));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrarSesion_Click.png"))); // NOI18N
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMinimizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMinimizar_Click.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrar_Click.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/QWAY_CAJA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnDispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispositivosActionPerformed
        this.vibrador = 0;
        VistaDispositivo vistaDispositivo = new VistaDispositivo(this);
        vistaDispositivo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDispositivosActionPerformed

    private void btnSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSandwichActionPerformed
        VistaPedido vistaPedido = new VistaPedido(this);
        vistaPedido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSandwichActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        VistaHome vistaHome = new VistaHome();
        vistaHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        VistaFacuras vistaFacturas = new VistaFacuras(this);
        vistaFacturas.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnFacturasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDispositivos;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSandwich;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
