/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Usuario;

/**
 *
 * @author GIGABYTE
 */
public class frmOpciones extends javax.swing.JFrame {

    private Usuario user;

    public frmOpciones(Usuario user) {
        initComponents();
        this.user = user;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        CheckVerTarjet = new javax.swing.JCheckBox();
        btnTarjet = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCVV = new javax.swing.JLabel();
        LabelCVV = new javax.swing.JLabel();
        LabelNumeroTarj = new javax.swing.JLabel();
        txtNumeroTarj = new javax.swing.JLabel();
        LabelNoTarjet1 = new javax.swing.JLabel();
        LabelNoTarjet3 = new javax.swing.JLabel();
        LabelNoTarjet2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        CheckVerTarjet.setText("Ver tarjeta activa");
        CheckVerTarjet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckVerTarjetMouseClicked(evt);
            }
        });
        CheckVerTarjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckVerTarjetActionPerformed(evt);
            }
        });
        jPanel1.add(CheckVerTarjet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        btnTarjet.setText("Cambiar tarjeta");
        btnTarjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetActionPerformed(evt);
            }
        });
        jPanel1.add(btnTarjet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCVV.setText("xd");
        jPanel2.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 140, -1));

        LabelCVV.setText("CVV:");
        jPanel2.add(LabelCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        LabelNumeroTarj.setText("Número de tarjeta:");
        jPanel2.add(LabelNumeroTarj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtNumeroTarj.setText("xd");
        jPanel2.add(txtNumeroTarj, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 160, -1));

        LabelNoTarjet1.setText("Usted no tiene ninguna tarjeta activa!");
        jPanel2.add(LabelNoTarjet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 10));

        LabelNoTarjet3.setText("participar de las grandes subastas!");
        jPanel2.add(LabelNoTarjet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, -1));

        LabelNoTarjet2.setText("Agregue una tarjeta para que pueda");
        jPanel2.add(LabelNoTarjet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 300, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckVerTarjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckVerTarjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckVerTarjetActionPerformed

    private void btnTarjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTarjetActionPerformed

    private void CheckVerTarjetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckVerTarjetMouseClicked
        if (CheckVerTarjet.isSelected()) {
            if (this.user.getTarjeta().getNumero() == null) {
                CheckVerTarjet.enableInputMethods(false);
            } else {
                txtCVV.setVisible(true);
                txtNumeroTarj.setVisible(true);
            }
        } else {
            if (this.user.getTarjeta().getNumero() == null) {
                CheckVerTarjet.enableInputMethods(false);
            } else {
                txtCVV.setVisible(false);
                txtNumeroTarj.setVisible(false);
            }
        }
    }//GEN-LAST:event_CheckVerTarjetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox CheckVerTarjet;
    public javax.swing.JLabel LabelCVV;
    public javax.swing.JLabel LabelNoTarjet1;
    public javax.swing.JLabel LabelNoTarjet2;
    public javax.swing.JLabel LabelNoTarjet3;
    public javax.swing.JLabel LabelNumeroTarj;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnTarjet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel txtCVV;
    public javax.swing.JLabel txtNumeroTarj;
    // End of variables declaration//GEN-END:variables
}
