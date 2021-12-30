/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmLobby;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFrmLobby {

    private frmLobby vista;
    private Usuario user;

    public ControladorFrmLobby(Usuario user) {
        this.vista = new frmLobby();
        this.user = user;
        vista.btnPerfil.setText(this.user.getNombre());
    
        
        this.vista.btnParticipaciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aaaa");
            }
        });

        this.vista.btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frmPerfil perfil = new frmPerfil(user);
                ControladorPerfil controller = new ControladorPerfil(perfil, user);
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
