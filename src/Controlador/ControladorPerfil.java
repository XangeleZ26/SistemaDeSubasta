/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPerfil {

    private frmPerfil vista;
    private Usuario user;

    public ControladorPerfil(frmPerfil vista, Usuario user) {
        this.vista = vista;
        this.user = user;

        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              ControladorFrmLobby controller=new ControladorFrmLobby(user);
              controller.iniciar();
              vista.dispose();
            }
        });
    }

    public void llenarDatos() {
        this.vista.nombreYApellido.setText(user.getNombre()+" "+user.getApellido());
        this.vista.txtDNI.setText(user.getDNI());
        this.vista.txtCelu.setText(user.getCelular());
        this.vista.txtCorreo.setText(user.getCorreo());
        if (user.isActivarUbicacion()==false) {
            this.vista.labelDepa.setVisible(false);
            this.vista.labelDirecc.setVisible(false);
            this.vista.labelDistrito.setVisible(false);
            this.vista.labelPais.setVisible(false);
            this.vista.labelProvin.setVisible(false);

            this.vista.txtDepa.setVisible(false);
            this.vista.txtDirecc.setVisible(false);
            this.vista.txtDistrito.setVisible(false);
            this.vista.txtPais.setVisible(false);
            this.vista.txtProvin.setVisible(false);
        } else {
            this.vista.txtDepa.setText(user.getDireccion().getDepartamento());
            this.vista.txtDirecc.setText(user.getDireccion().getDireccion());
            this.vista.txtDistrito.setText(user.getDireccion().getDistrito());
            this.vista.txtPais.setText(user.getDireccion().getPais());
            this.vista.txtProvin.setText(user.getDireccion().getProvincia());
        }

    }

    public void iniciar() {
        llenarDatos();
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
