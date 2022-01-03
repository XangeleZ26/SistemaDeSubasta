/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmHistoPujasParticipaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorFrmHistoPujasParticipaciones {
    private Usuario user;
    private frmHistoPujasParticipaciones vista;
    
    public ControladorFrmHistoPujasParticipaciones(Usuario user){
        this.user=user;
        this.vista=new frmHistoPujasParticipaciones();
        
        this.vista.btnRetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorMisParticipaciones controller = new ControladorMisParticipaciones(user);
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
