/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmPujar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFrmPujar {
    public Usuario user;
    public frmPujar vista;
    //aqui tambn debemos de usar la clase de "pujador"
    public ControladorFrmPujar(Usuario user){
        this.user=user;
        this.vista=new frmPujar();
        
           this.vista.btnRetro.addActionListener(new ActionListener() {
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
