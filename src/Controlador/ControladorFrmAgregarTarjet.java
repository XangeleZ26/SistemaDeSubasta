/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tarjeta;
import Modelo.Usuario;
import Vista.frmAgregarTarjet;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorFrmAgregarTarjet {
     private Usuario user;
     private frmAgregarTarjet view;
    ControladorFrmAgregarTarjet(Usuario user){
        this.user=user;
        this.view=new frmAgregarTarjet();
        
        this.view.btnRetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpciones controller = new ControladorOpciones(user);
                controller.iniciar();
                view.dispose();
            }
        });
        this.view.btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setTarjeta(new Tarjeta(view.txtNumberTarjet.getText(),view.txtCvv.getText()));
                JOptionPane.showMessageDialog(null,"Tarjeta registrada.");
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
