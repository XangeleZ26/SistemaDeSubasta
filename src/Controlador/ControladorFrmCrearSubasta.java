/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmCrearSubasta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFrmCrearSubasta {
    private Usuario user;
    private frmCrearSubasta vista;
    
    public ControladorFrmCrearSubasta(Usuario user){
        this.user=user;
        this.vista=new frmCrearSubasta();
        
        this.vista.btnRetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmLobby controller=new ControladorFrmLobby(user);
              controller.iniciar();
              vista.dispose();
            }
        });
    }
        public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
