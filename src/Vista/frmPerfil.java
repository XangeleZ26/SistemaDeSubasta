/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Usuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class frmPerfil extends javax.swing.JFrame {
    private Usuario usuario;
    public frmPerfil(Usuario usuario) {
        initComponents();
        this.usuario=usuario;
        ImageIcon user=new ImageIcon(getClass().getResource("../Imagenes/usuario.png"));
        Icon userZ=new ImageIcon(user.getImage().getScaledInstance(this.ImageUser.getWidth(),this.ImageUser.getHeight(),Image.SCALE_DEFAULT));
        this.ImageUser.setIcon(userZ);
         this.repaint();
         nombreYApellido.setHorizontalAlignment(SwingConstants.CENTER);
         ocultar();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageUser = new javax.swing.JLabel();
        nombreYApellido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelDepa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        labelProvin = new javax.swing.JLabel();
        labelDistrito = new javax.swing.JLabel();
        labelDirecc = new javax.swing.JLabel();
        txtDNI = new javax.swing.JLabel();
        txtCelu = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtContra = new javax.swing.JLabel();
        txtPais = new javax.swing.JLabel();
        txtDepa = new javax.swing.JLabel();
        txtProvin = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JLabel();
        txtDirecc = new javax.swing.JLabel();
        CheckContra = new javax.swing.JCheckBox();
        LabelTextoOculto = new javax.swing.JLabel();
        btnOculto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnOpc = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrarSesion1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageUser.setBackground(new java.awt.Color(255, 255, 255));
        ImageUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 11, 106, 105));

        nombreYApellido.setText("xd");
        jPanel1.add(nombreYApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 127, 393, -1));

        jLabel1.setText("Correo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 192, -1, -1));

        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 212, -1, -1));

        labelDepa.setText("Departamento");
        jPanel1.add(labelDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 253, -1, -1));

        jLabel3.setText("DNI:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 152, -1, -1));

        jLabel4.setText("Número de celular:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 172, -1, -1));

        labelPais.setText("Pais:");
        jPanel1.add(labelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 233, -1, -1));

        labelProvin.setText("Provincia:");
        jPanel1.add(labelProvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 273, -1, -1));

        labelDistrito.setText("Distrito:");
        jPanel1.add(labelDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 293, -1, -1));

        labelDirecc.setText("Dirección:");
        jPanel1.add(labelDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 313, -1, -1));
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 152, 189, -1));
        jPanel1.add(txtCelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 172, 189, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 192, 189, -1));

        txtContra.setText("a");
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 212, 145, -1));
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 233, 189, -1));
        jPanel1.add(txtDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 253, 189, -1));
        jPanel1.add(txtProvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 273, 189, -1));
        jPanel1.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 293, 189, -1));
        jPanel1.add(txtDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 313, 189, -1));

        CheckContra.setText("Mostrar ");
        CheckContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckContraMouseClicked(evt);
            }
        });
        jPanel1.add(CheckContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 208, -1, -1));

        LabelTextoOculto.setText("Aún no ha registrado sus datos de ubicación");
        jPanel1.add(LabelTextoOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 340, -1));

        btnOculto.setText("Agregar ubicación");
        jPanel1.add(btnOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 450, 332));

        btnOpc.setText("Opciones de tarjeta");

        btnEliminar.setText("Eliminar cuenta");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrarSesion1.setText("Cerrar sesión");
        btnCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnOpc)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpc)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrarSesion1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, -1, -1));

        btnSalir.setText("Retroceder");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckContraMouseClicked
       if(CheckContra.isSelected()){
           txtContra.setText(this.usuario.getContraCuenta());
       }else{
           ocultar();
       }
    }//GEN-LAST:event_CheckContraMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesion1ActionPerformed
    private void ocultar(){
        String contraOculta = "⚫";
        for(int i=1;i<this.usuario.getContraCuenta().length();i++){
            contraOculta+="⚫";
        }
        txtContra.setText(contraOculta);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox CheckContra;
    public javax.swing.JLabel ImageUser;
    public javax.swing.JLabel LabelTextoOculto;
    public javax.swing.JButton btnCerrarSesion1;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnOculto;
    public javax.swing.JButton btnOpc;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel labelDepa;
    public javax.swing.JLabel labelDirecc;
    public javax.swing.JLabel labelDistrito;
    public javax.swing.JLabel labelPais;
    public javax.swing.JLabel labelProvin;
    public javax.swing.JLabel nombreYApellido;
    public javax.swing.JLabel txtCelu;
    public javax.swing.JLabel txtContra;
    public javax.swing.JLabel txtCorreo;
    public javax.swing.JLabel txtDNI;
    public javax.swing.JLabel txtDepa;
    public javax.swing.JLabel txtDirecc;
    public javax.swing.JLabel txtDistrito;
    public javax.swing.JLabel txtPais;
    public javax.swing.JLabel txtProvin;
    // End of variables declaration//GEN-END:variables
}
