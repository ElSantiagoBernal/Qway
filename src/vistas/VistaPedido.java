/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import bridge.Sandwich;
import cadenaResponsabilidad.Cajero;
import cadenaResponsabilidad.Cocinero;
import cadenaResponsabilidad.Empleado;
import controladores.ControladorDispositivo;
import controladores.ControladorFactura;
import excepciones.BaseNoSeleccionadaException;
import java.awt.Frame;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 *
 * @author andre
 */
public class VistaPedido extends javax.swing.JFrame {

    /**
     * Creates new form VistaPedido
     */
    VistaMenu vistaMenu;

    public VistaPedido(VistaMenu vistaMenu) {
        initComponents();
        setLocationRelativeTo(this);
        this.vistaMenu = vistaMenu;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbPanNormal = new javax.swing.JCheckBox();
        cbPanIntegral = new javax.swing.JCheckBox();
        cbPanGriego = new javax.swing.JCheckBox();
        cbCebolla = new javax.swing.JCheckBox();
        cbPepinillos = new javax.swing.JCheckBox();
        cbLechuga = new javax.swing.JCheckBox();
        cbTomate = new javax.swing.JCheckBox();
        cbSalchicha = new javax.swing.JCheckBox();
        cbCarne = new javax.swing.JCheckBox();
        cbPollo = new javax.swing.JCheckBox();
        cbJamon = new javax.swing.JCheckBox();
        cbRosada = new javax.swing.JCheckBox();
        cbMayonesa = new javax.swing.JCheckBox();
        cbMostaza = new javax.swing.JCheckBox();
        cbBBQ = new javax.swing.JCheckBox();
        cbQueso = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SALSAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BASE DE PAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("VEGETALES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PROTEINAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolver.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolver_Click.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, 30));

        cbPanNormal.setBackground(new java.awt.Color(243, 210, 106));
        cbPanNormal.setForeground(new java.awt.Color(0, 0, 0));
        cbPanNormal.setText("Pan Normal");
        cbPanNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPanNormalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbPanNormalMousePressed(evt);
            }
        });
        jPanel1.add(cbPanNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        cbPanIntegral.setBackground(new java.awt.Color(243, 210, 106));
        cbPanIntegral.setForeground(new java.awt.Color(0, 0, 0));
        cbPanIntegral.setText("Pan Integral");
        cbPanIntegral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPanIntegralMouseClicked(evt);
            }
        });
        jPanel1.add(cbPanIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        cbPanGriego.setBackground(new java.awt.Color(243, 210, 106));
        cbPanGriego.setForeground(new java.awt.Color(0, 0, 0));
        cbPanGriego.setText("Pan Griego");
        cbPanGriego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPanGriegoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbPanGriegoMousePressed(evt);
            }
        });
        jPanel1.add(cbPanGriego, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        cbCebolla.setBackground(new java.awt.Color(243, 210, 106));
        cbCebolla.setForeground(new java.awt.Color(0, 0, 0));
        cbCebolla.setText("Cebolla");
        cbCebolla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCebollaActionPerformed(evt);
            }
        });
        jPanel1.add(cbCebolla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        cbPepinillos.setBackground(new java.awt.Color(243, 210, 106));
        cbPepinillos.setForeground(new java.awt.Color(0, 0, 0));
        cbPepinillos.setText("Pepinillos");
        cbPepinillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPepinillosActionPerformed(evt);
            }
        });
        jPanel1.add(cbPepinillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        cbLechuga.setBackground(new java.awt.Color(243, 210, 106));
        cbLechuga.setForeground(new java.awt.Color(0, 0, 0));
        cbLechuga.setText("Lechuga");
        cbLechuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLechugaActionPerformed(evt);
            }
        });
        jPanel1.add(cbLechuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        cbTomate.setBackground(new java.awt.Color(243, 210, 106));
        cbTomate.setForeground(new java.awt.Color(0, 0, 0));
        cbTomate.setText("Tomate");
        cbTomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTomateActionPerformed(evt);
            }
        });
        jPanel1.add(cbTomate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        cbSalchicha.setBackground(new java.awt.Color(243, 210, 106));
        cbSalchicha.setForeground(new java.awt.Color(0, 0, 0));
        cbSalchicha.setText("Salchicha");
        cbSalchicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalchichaActionPerformed(evt);
            }
        });
        jPanel1.add(cbSalchicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        cbCarne.setBackground(new java.awt.Color(243, 210, 106));
        cbCarne.setForeground(new java.awt.Color(0, 0, 0));
        cbCarne.setText("Carne");
        cbCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarneActionPerformed(evt);
            }
        });
        jPanel1.add(cbCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        cbPollo.setBackground(new java.awt.Color(243, 210, 106));
        cbPollo.setForeground(new java.awt.Color(0, 0, 0));
        cbPollo.setText("Pollo");
        cbPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPolloActionPerformed(evt);
            }
        });
        jPanel1.add(cbPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        cbJamon.setBackground(new java.awt.Color(243, 210, 106));
        cbJamon.setForeground(new java.awt.Color(0, 0, 0));
        cbJamon.setText("Jamón");
        cbJamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJamonActionPerformed(evt);
            }
        });
        jPanel1.add(cbJamon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        cbRosada.setBackground(new java.awt.Color(243, 210, 106));
        cbRosada.setForeground(new java.awt.Color(0, 0, 0));
        cbRosada.setText("Rosada");
        cbRosada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRosadaActionPerformed(evt);
            }
        });
        jPanel1.add(cbRosada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        cbMayonesa.setBackground(new java.awt.Color(243, 210, 106));
        cbMayonesa.setForeground(new java.awt.Color(0, 0, 0));
        cbMayonesa.setText("Mayonesa");
        cbMayonesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMayonesaActionPerformed(evt);
            }
        });
        jPanel1.add(cbMayonesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        cbMostaza.setBackground(new java.awt.Color(243, 210, 106));
        cbMostaza.setForeground(new java.awt.Color(0, 0, 0));
        cbMostaza.setText("Mostaza");
        cbMostaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostazaActionPerformed(evt);
            }
        });
        jPanel1.add(cbMostaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        cbBBQ.setBackground(new java.awt.Color(243, 210, 106));
        cbBBQ.setForeground(new java.awt.Color(0, 0, 0));
        cbBBQ.setText("BBQ");
        cbBBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBBQActionPerformed(evt);
            }
        });
        jPanel1.add(cbBBQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        cbQueso.setBackground(new java.awt.Color(243, 210, 106));
        cbQueso.setForeground(new java.awt.Color(0, 0, 0));
        cbQueso.setText("Queso");
        cbQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuesoActionPerformed(evt);
            }
        });
        jPanel1.add(cbQueso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFondo_Click.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 110, 35));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/QWAY_MENU.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

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

    private void cbCebollaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCebollaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCebollaActionPerformed

    private void cbPepinillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPepinillosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPepinillosActionPerformed

    private void cbLechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLechugaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLechugaActionPerformed

    private void cbSalchichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalchichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSalchichaActionPerformed

    private void cbTomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTomateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTomateActionPerformed

    private void cbCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCarneActionPerformed

    private void cbPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPolloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPolloActionPerformed

    private void cbRosadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRosadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRosadaActionPerformed

    private void cbJamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJamonActionPerformed

    private void cbMayonesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMayonesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMayonesaActionPerformed

    private void cbMostazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMostazaActionPerformed

    private void cbBBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBBQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBBQActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        vistaMenu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int valPan = -1;
        try {
            double valorSandwich = 0;
            Sandwich sandwich = new Sandwich();
            if (cbPanIntegral.isSelected()) {
                sandwich.agregarPanIntegral();
                valorSandwich += 0.5;
                valPan = 0;
            }
            if (cbPanGriego.isSelected()) {
                sandwich.agregarPanGriego();
                valorSandwich += 0.5;
                valPan = 0;
            }
            if (cbPanNormal.isSelected()) {
                sandwich.agregarPanNormal();
                valorSandwich += 0.3;
                valPan = 0;
            }
            if (cbCarne.isSelected()) {
                sandwich.agregarCarne();
                valorSandwich += 0.7;
            }
            if (cbSalchicha.isSelected()) {
                sandwich.agregarSalchicha();
                valorSandwich += 0.3;
            }
            if (cbJamon.isSelected()) {
                sandwich.agregarJamon();
                valorSandwich += 0.3;
            }
            if (cbPollo.isSelected()) {
                sandwich.agregarPollo();
                valorSandwich += 0.5;
            }
            if (cbTomate.isSelected()) {
                sandwich.agregarTomate();
                valorSandwich += 0.2;
            }
            if (cbPepinillos.isSelected()) {
                sandwich.agregarPepinillos();
                valorSandwich += 0.3;
            }
            if (cbLechuga.isSelected()) {
                sandwich.agregarLechuga();
                valorSandwich += 0.2;
            }
            if (cbCebolla.isSelected()) {
                sandwich.agregarCebolla();
                valorSandwich += 0.3;
            }
            if (cbMayonesa.isSelected()) {
                sandwich.agregarMayonesa();
                valorSandwich += 0.5;
            }
            if (cbBBQ.isSelected()) {
                sandwich.agregarBBQ();
                valorSandwich += 0.7;
            }
            if (cbRosada.isSelected()) {
                sandwich.agregarRosada();
                valorSandwich += 0.2;
            }
            if (cbMostaza.isSelected()) {
                sandwich.agregarMostaza();
                valorSandwich += 0.5;
            }
            if (cbQueso.isSelected()) {
                sandwich.agregarQueso();
                valorSandwich += 0.2;
            }
            if (valPan == -1) {
                throw new BaseNoSeleccionadaException();
            }
            vistaMenu.vibrador = 1;
            vistaMenu.sandwich = sandwich;
            vistaMenu.valorSandwich = valorSandwich;
            VistaDispositivo vist = new VistaDispositivo(vistaMenu);
            vist.setVisible(true);
            this.dispose();
        } catch (BaseNoSeleccionadaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cbPanIntegralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPanIntegralMouseClicked
        cbPanIntegral.setSelected(true);
        cbPanGriego.setSelected(false);
        cbPanNormal.setSelected(false);
    }//GEN-LAST:event_cbPanIntegralMouseClicked

    private void cbPanGriegoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPanGriegoMousePressed

    }//GEN-LAST:event_cbPanGriegoMousePressed

    private void cbPanNormalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPanNormalMousePressed

    }//GEN-LAST:event_cbPanNormalMousePressed

    private void cbQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQuesoActionPerformed

    private void cbPanNormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPanNormalMouseClicked
        cbPanIntegral.setSelected(false);
        cbPanGriego.setSelected(false);
        cbPanNormal.setSelected(true);
    }//GEN-LAST:event_cbPanNormalMouseClicked

    private void cbPanGriegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPanGriegoMouseClicked
        cbPanIntegral.setSelected(false);
        cbPanGriego.setSelected(true);
        cbPanNormal.setSelected(false);
    }//GEN-LAST:event_cbPanGriegoMouseClicked

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
//            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaPedido().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JCheckBox cbBBQ;
    private javax.swing.JCheckBox cbCarne;
    private javax.swing.JCheckBox cbCebolla;
    private javax.swing.JCheckBox cbJamon;
    private javax.swing.JCheckBox cbLechuga;
    private javax.swing.JCheckBox cbMayonesa;
    private javax.swing.JCheckBox cbMostaza;
    private javax.swing.JCheckBox cbPanGriego;
    private javax.swing.JCheckBox cbPanIntegral;
    private javax.swing.JCheckBox cbPanNormal;
    private javax.swing.JCheckBox cbPepinillos;
    private javax.swing.JCheckBox cbPollo;
    private javax.swing.JCheckBox cbQueso;
    private javax.swing.JCheckBox cbRosada;
    private javax.swing.JCheckBox cbSalchicha;
    private javax.swing.JCheckBox cbTomate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
