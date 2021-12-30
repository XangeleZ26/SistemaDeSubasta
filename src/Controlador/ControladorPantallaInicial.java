//ControladorPanatallaInicial
package Controlador;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import Aplicacion.*;
import Arreglos.ArregloUsuarios;
import Modelo.*;
import Vista.InicioFallido;
import Vista.PantallaLogin;
import Vista.RegistroUsuario;

public class ControladorPantallaInicial {
    private PantallaLogin pantallaInicial;
    private ArregloUsuarios usuarios;
    private Sistema subasta;
    
    private InicioFallido inicioFallido;
    private ControladorInicioFallido controladorIF;
    
    public ControladorPantallaInicial(PantallaLogin pantallaInicial) {
        this.pantallaInicial = pantallaInicial;
        this.usuarios = Configuracion.arrUsuarios;
        
        this.pantallaInicial.btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usuarioRegistrado() == false){
                    pantallaInicial.dispose();
                    inicioFallido = new InicioFallido();
                    controladorIF = new ControladorInicioFallido(inicioFallido, usuarios);
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
    
    public boolean usuarioRegistrado() {
        boolean result = false;
        String correo = pantallaInicial.txtCorreo.getText();
        String contrasena = pantallaInicial.txtContrasena.getText();
        for(int i=0; i<usuarios.getUsuarios().length ; i++) {
            if(correo.compareTo(usuarios.getUsuarios()[0].getCorreo())==0){
                if(contrasena.compareTo(usuarios.getUsuarios()[0].getContraCuenta())==0){
                    result = true;
                }
            }
        }
        return result;
    }
    
}   
