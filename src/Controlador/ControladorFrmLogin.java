//ControladorPanatallaInicial
package Controlador;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import Aplicacion.*;
import Arreglos.ArregloUsuarios;
import Modelo.*;
import Vista.InicioFallido;
import Vista.frmLogin;
import Vista.RegistroUsuario;

public class ControladorFrmLogin {
       private frmLogin pantallaInicial;
    private ArregloUsuarios usuarios;
    
    public ControladorFrmLogin(frmLogin pantallaInicial) {
        this.pantallaInicial = pantallaInicial;
        this.usuarios = Configuracion.arrUsuarios;
        
        this.pantallaInicial.btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usuarios.usuarioRegistrado(pantallaInicial.txtCorreo.getText(),String.valueOf(pantallaInicial.txtContrasena.getPassword())) == false){
                    InicioFallido inicioFallido = new InicioFallido();
                    ControladorInicioFallido controladorIF = new ControladorInicioFallido(inicioFallido, usuarios);
                    controladorIF.iniciar();
                    pantallaInicial.dispose();
                }
                else{ 
                    JOptionPane.showMessageDialog(null, "INGRESASTE XD");
                    Usuario user=usuarios.encontrarUsuario(pantallaInicial.txtCorreo.getText(),String.valueOf(pantallaInicial.txtContrasena.getPassword()));
                    ControladorFrmLobby controller =new ControladorFrmLobby(user);
                    controller.iniciar();
                    pantallaInicial.dispose();
                }
            }
        });
       this.pantallaInicial.btnRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorRegistroUsuario controller=new ControladorRegistroUsuario(new RegistroUsuario());
               controller.iniciar();
               pantallaInicial.dispose();
            }
        });
        
        
        
       this.pantallaInicial.btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void iniciar() {
        pantallaInicial.setLocationRelativeTo(null);
        pantallaInicial.setVisible(true);
    }

}   
