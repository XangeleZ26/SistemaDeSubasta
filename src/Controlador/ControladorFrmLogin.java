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
                if(usuarios.usuarioRegistrado(pantallaInicial.txtCorreo.getText(),pantallaInicial.txtContrasena.getText()) == false){
                    pantallaInicial.dispose();
                    InicioFallido inicioFallido = new InicioFallido();
                    ControladorInicioFallido controladorIF = new ControladorInicioFallido(inicioFallido, usuarios);
                    controladorIF.iniciar();
                }
                else{
                    pantallaInicial.dispose();
                    JOptionPane.showMessageDialog(null, "INGRESASTE XD");
                    
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
