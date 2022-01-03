/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmOpcSubastas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorFrmOpcSubastas {
    public Usuario user;
    public frmOpcSubastas vista;
    
    public ControladorFrmOpcSubastas(Usuario user){
        this.user=user;
        this.vista=new frmOpcSubastas();
        
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
