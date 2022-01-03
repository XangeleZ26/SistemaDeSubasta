/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmDatosSubasta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFrmDatosSubasta {

    //vamos a tener que tener como atributo a la subasta escogida
    public Usuario user;
    public frmDatosSubasta vista;

    public ControladorFrmDatosSubasta(Usuario user) {
        this.user = user;
        this.vista = new frmDatosSubasta();

        this.vista.btnRetroceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ControladorFrmLobby.ingregoXUltima == true) {
                    ControladorFrmLobby controller = new ControladorFrmLobby(user);
                    controller.iniciar();
                    vista.dispose();
                } else {
                    ControladorSubastasActivas controller = new ControladorSubastasActivas(user);
                    controller.iniciar();
                    vista.dispose();
                }
            }
        });
        this.vista.btnPujar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmPujar controller = new ControladorFrmPujar(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnHPujas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmHPujas controller = new ControladorFrmHPujas(user);
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
