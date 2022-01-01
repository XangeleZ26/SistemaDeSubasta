/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Direccion;
import Modelo.Usuario;
import Vista.frmAgregarDireccion;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorFrmAgregarDireccion {
    private Usuario user;
    private frmAgregarDireccion view;
    ControladorFrmAgregarDireccion(Usuario user){
        this.user=user;
        this.view=new frmAgregarDireccion();
        
        this.view.btnRetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frmPerfil vision = new frmPerfil(user);
                ControladorPerfil controller = new ControladorPerfil(vision, user);
                controller.iniciar();
                view.dispose();
            }
        });
        this.view.btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setDireccion(new Direccion(view.txtPais.getText(),view.txtDepa.getText(),view.txtProvin.getText(),view.txtDistrito.getText(),view.txtDirec.getText()));
                JOptionPane.showMessageDialog(null,"Ubicación registrada.");
                 frmPerfil vision = new frmPerfil(user);
                ControladorPerfil controller = new ControladorPerfil(vision, user);
                controller.iniciar();
                view.dispose();
            }
        });
        
    }
      public void iniciar() {
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
}
