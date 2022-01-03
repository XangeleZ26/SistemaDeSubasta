/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmSubastasActivas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorSubastasActivas {
    public frmSubastasActivas vista;
    public Usuario user;
    public ControladorSubastasActivas(Usuario user){
        this.vista=new frmSubastasActivas();
        this.user=user;
        this.vista.btnRetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ControladorFrmLobby controller=new ControladorFrmLobby(user);
             controller.iniciar();
             vista.dispose();
            }
        }); 
        this.vista.btnDatosSubasta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ControladorFrmDatosSubasta controller=new ControladorFrmDatosSubasta(user);
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
