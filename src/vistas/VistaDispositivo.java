/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import bridge.NotificadorPedido;
import cadenaResponsabilidad.Cajero;
import cadenaResponsabilidad.Cocinero;
import com.sun.awt.AWTUtilities;
import controladores.ControladorDispositivo;
import controladores.ControladorFactura;
import excepciones.DispositivoActivoException;
import excepciones.DispositivoInactivoException;
import factory.Factoria;
import factory.Factura;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import modelo.Contenedor;
import modelo.Pedido;

/**
 *
 * @author Santiago
 */
public class VistaDispositivo extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form VistaDispositivo
     */
    VistaMenu vistaMenu;
    JButton[][] botones;

    public VistaDispositivo(VistaMenu vistaMenu) {
        initComponents();
        setLocationRelativeTo(this);
        this.vistaMenu = vistaMenu;
        botones = new JButton[vistaMenu.getControladorDispositivo().obtenerFilas()][vistaMenu.getControladorDispositivo().obtenerColumnas()];
        cargarBotones();
    }

    private void cargarBotones() {
        int ancho = 60;
        int alto = 60;
        int separado = 40;
        int texto = 1;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                Contenedor contenedor = vistaMenu.getControladorDispositivo().obtenerNotificador(i, j);
                validarEspaciosBotones(texto, i, j, ancho, alto, separado);
                if (contenedor.getEstado().equals(Contenedor.INACTIVO)) {
                    botones[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/QWAY_MATRIZ.png")));
                    botones[i][j].setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/QWAY_MATRIZ_CLIK.png")));
                } else {
                    botones[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/QWAY_MATRIZ_ACT.png")));
                    botones[i][j].setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/QWAY_MATRIZ_ACTCLICK.png")));

                }
                botones[i][j].setText(String.valueOf(texto));
                botones[i][j].setHorizontalTextPosition(SwingConstants.CENTER);
                botones[i][j].setVerticalTextPosition(SwingConstants.CENTER);
                botones[i][j].setForeground(Color.green);
                botones[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                botones[i][j].addActionListener(this);
                pnlDispositivos.add(botones[i][j]);
                texto++;
            }
        }
        pnlDispositivos.repaint();
    }

    private void validarEspaciosBotones(int texto, int i, int j, int ancho, int alto, int separado) {
        switch (texto) {
            case 1:
                botones[i][j].setBounds(
                        (j * ancho + separado),
                        (i * alto + separado),
                        ancho, alto);
                break;
            case 2:
                botones[i][j].setBounds(
                        ((j + 1) * ancho + separado),
                        (i * alto + separado),
                        ancho, alto);
                break;
            case 3:
                botones[i][j].setBounds(
                        ((j + 2) * ancho + separado),
                        (i * alto + separado),
                        ancho, alto);
                break;
            case 4:
                botones[i][j].setBounds(
                        ((j + 3) * ancho + separado),
                        (i * alto + separado),
                        ancho, alto);
                break;
            case 5:
                botones[i][j].setBounds(
                        (j * ancho + separado),
                        ((i + 1) * alto + separado),
                        ancho, alto);
                break;
            case 6:
                botones[i][j].setBounds(
                        ((j + 1) * ancho + separado),
                        ((i + 1) * alto + separado),
                        ancho, alto);
                break;
            case 7:
                botones[i][j].setBounds(
                        ((j + 2) * ancho + separado),
                        ((i + 1) * alto + separado),
                        ancho, alto);
                break;
            case 8:
                botones[i][j].setBounds(
                        ((j + 3) * ancho + separado),
                        ((i + 1) * alto + separado),
                        ancho, alto);
                break;
            case 9:
                botones[i][j].setBounds(
                        (j * ancho + separado),
                        ((i + 2) * alto + separado),
                        ancho, alto);
                break;
            case 10:
                botones[i][j].setBounds(
                        ((j + 1) * ancho + separado),
                        ((i + 2) * alto + separado),
                        ancho, alto);
                break;
            case 11:
                botones[i][j].setBounds(
                        ((j + 2) * ancho + separado),
                        ((i + 2) * alto + separado),
                        ancho, alto);
                break;
            case 12:
                botones[i][j].setBounds(
                        ((j + 3) * ancho + separado),
                        ((i + 2) * alto + separado),
                        ancho, alto);
                break;
            case 13:
                botones[i][j].setBounds(
                        (j * ancho + separado),
                        ((i + 3) * alto + separado),
                        ancho, alto);
                break;
            case 14:
                botones[i][j].setBounds(
                        ((j + 1) * ancho + separado),
                        ((i + 3) * alto + separado),
                        ancho, alto);
                break;
            case 15:
                botones[i][j].setBounds(
                        ((j + 2) * ancho + separado),
                        ((i + 3) * alto + separado),
                        ancho, alto);
                break;
            case 16:
                botones[i][j].setBounds(
                        ((j + 3) * ancho + separado),
                        ((i + 3) * alto + separado),
                        ancho, alto);
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDispositivos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlDispositivos.setBackground(new java.awt.Color(243, 210, 106));
        pnlDispositivos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlDispositivosMouseDragged(evt);
            }
        });
        pnlDispositivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDispositivosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDispositivosMousePressed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolver.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolver_Click.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDispositivosLayout = new javax.swing.GroupLayout(pnlDispositivos);
        pnlDispositivos.setLayout(pnlDispositivosLayout);
        pnlDispositivosLayout.setHorizontalGroup(
            pnlDispositivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDispositivosLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        pnlDispositivosLayout.setVerticalGroup(
            pnlDispositivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDispositivosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDispositivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDispositivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vistaMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pnlDispositivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDispositivosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlDispositivosMouseClicked
    int xx, xy;
    private void pnlDispositivosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDispositivosMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlDispositivosMousePressed

    private void pnlDispositivosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDispositivosMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlDispositivosMouseDragged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaDispositivo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlDispositivos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            for (int i = 0; i < botones.length; i++) {
                for (int j = 0; j < botones[i].length; j++) {
                    if (ae.getSource().equals(botones[i][j])) {
                        NotificadorPedido notificador = vistaMenu.getControladorDispositivo().obtenerNotificador(i, j);
                        if (vistaMenu.vibrador == 0) {
                            if (notificador.getEstado().equals(Contenedor.ACTIVO)) {
                                VistaVibrador vist = new VistaVibrador(vistaMenu, i, j);
                                vist.setVisible(true);
                                this.dispose();
                            } else {
                                throw new DispositivoInactivoException();
                            }
                        } else if (vistaMenu.vibrador == 1) {
                            if (notificador.getEstado().equals(Contenedor.INACTIVO)) {
                                Pedido pedido = new Pedido(notificador.getCodigo(), vistaMenu.sandwich);
                                Cajero cajeroX = new Cajero("Cajero", "1234", "Andrés", "Ocampo", "4223", "9374738");
                                Cocinero cocinerox = new Cocinero("Cocinero", "3333", "Didier", "Nose", "3334", "4545");
                                cajeroX.setNextHandler(cocinerox);
                                Factura fact = new Factoria().createFactura("Cliente Normal");
                                String cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente");
                                fact.setCedulaCliente(cedula);
                                fact.setImporte(vistaMenu.valorSandwich);
                                fact.setPedido(pedido);
                                int id = vistaMenu.getControladorFactura().cantidadFacturas();
                                System.out.println(id);
                                id++;
                                fact.setId(id);
                                String tipoCliente = mensajeCliente();
                                cajeroX.evaluarOcurrencia("Generar Factura", id, fact.getImporteCliente(), cedula, pedido, tipoCliente);
                                notificador.setCodigoPedido(id);
                                notificador.setEstado(Contenedor.ACTIVO);
                                VistaInfoFactura vistaInfoFactura = new VistaInfoFactura(vistaMenu, fact);
                                vistaInfoFactura.setVisible(true);
                                this.dispose();
                            } else {
                                throw new DispositivoActivoException();
                            }
                        }
                    }
                }
            }
        } catch (DispositivoInactivoException | DispositivoActivoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public String mensajeCliente() {
        String[] x = {"Cliente Normal", "Cliente Habitual"};
        int variable = JOptionPane.showOptionDialog(null, "Seleccione el tipo de cliente", "Tipo Cliente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, x, x[0]);
        if (variable == 0) {
            return "Cliente normal";
        } else {
            return "Cliente habitual";
        }
    }
}
