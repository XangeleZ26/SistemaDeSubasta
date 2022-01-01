/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Aplicacion.Configuracion;
import Arreglos.ArregloUsuarios;
import Modelo.Usuario;
import Vista.frmOpciones;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorOpciones {

    private Usuario user;
    private frmOpciones vista;

    public ControladorOpciones(Usuario user) {
        this.user = user;
        this.vista = new frmOpciones(this.user);

        this.vista.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmPerfil vision = new frmPerfil(user);
                ControladorPerfil controller = new ControladorPerfil(vision, user);
                controller.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnTarjet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public void mostrarTarj() {
        if (this.user.getTarjeta().getNumero() == null) {
            this.vista.LabelCVV.setVisible(false);
            this.vista.LabelNumeroTarj.setVisible(false);
            this.vista.txtCVV.setText("");
            this.vista.txtNumeroTarj.setText("");
            this.vista.txtCVV.setVisible(false);
            this.vista.txtNumeroTarj.setVisible(false);
            this.vista.btnTarjet.setText("Agregar tarjeta");
        } else {
            this.vista.LabelNoTarjet1.setVisible(false);
            this.vista.LabelNoTarjet2.setVisible(false);
            this.vista.LabelNoTarjet3.setVisible(false);
            this.vista.txtCVV.setText(this.user.getTarjeta().getCVV());
            this.vista.txtNumeroTarj.setText(this.user.getTarjeta().getNumero());
            this.vista.txtCVV.setVisible(false);
            this.vista.txtNumeroTarj.setVisible(false);
        }
    }

    public void iniciar() {
        mostrarTarj();
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
