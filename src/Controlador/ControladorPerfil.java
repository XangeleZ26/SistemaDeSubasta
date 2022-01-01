/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Aplicacion.Configuracion;
import Arreglos.ArregloUsuarios;
import Modelo.Usuario;
import Vista.frmLogin;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorPerfil {

    private frmPerfil vista;
    private Usuario user;
    private ArregloUsuarios arrUser;

    public ControladorPerfil(frmPerfil vista, Usuario user) {
        this.vista = vista;
        this.user = user;
        this.arrUser = Configuracion.arrUsuarios;
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmLobby controller = new ControladorFrmLobby(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnOpc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpciones controller = new ControladorOpciones(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnCerrarSesion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmLogin controller = new ControladorFrmLogin(new frmLogin());
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] opciones = {"Aceptar", "Cancelar"};
                int opc = JOptionPane.showOptionDialog(null, "¿Esta seguro de eliminar su cuenta?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                if (opc == 0) {
                    Configuracion.arrUsuarios.eliminar(user);
                    JOptionPane.showMessageDialog(null, "Cuenta eliminada con éxito");
                    ControladorFrmLogin controller = new ControladorFrmLogin(new frmLogin());
                    controller.iniciar();
                    vista.dispose();
                }
            }
        });
        this.vista.btnOculto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorFrmAgregarDireccion controller=new ControladorFrmAgregarDireccion(user);
               controller.iniciar();
               vista.dispose();
            }
        });
    }

    public void llenarDatos() {
        this.vista.nombreYApellido.setText(user.getNombre() + " " + user.getApellido());
        this.vista.txtDNI.setText(user.getDNI());
        this.vista.txtCelu.setText(user.getCelular());
        this.vista.txtCorreo.setText(user.getCorreo());
        if (user.getDireccion().getPais() == null) {
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
            
            //esto ocultará la opción de registro de ubicación, porque se supone que ya está hecho
            this.vista.LabelTextoOculto.setVisible(false);
            this.vista.btnOculto.setVisible(false);
        }

    }

    public void iniciar() {
        llenarDatos();
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
