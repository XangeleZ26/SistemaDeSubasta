/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmMisParticipaciones;
import Vista.frmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMisParticipaciones {
    private frmMisParticipaciones vista;
    private Usuario user;
    
    public ControladorMisParticipaciones(Usuario user){
        this.vista=new frmMisParticipaciones();
        this.user=user;
        
        this.vista.btnRetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmLobby controller = new ControladorFrmLobby(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnModifSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmOpcSubastas controller = new ControladorFrmOpcSubastas(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnVerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmVerDatosPremio controller = new ControladorFrmVerDatosPremio(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.BtnConstancias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmHConstancias controller = new ControladorFrmHConstancias(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnVerPujas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorFrmHistoPujasParticipaciones controller = new ControladorFrmHistoPujasParticipaciones(user);
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
