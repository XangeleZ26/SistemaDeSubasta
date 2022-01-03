
package Controlador;

import Modelo.Usuario;
import Vista.frmVerDatosPremio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorFrmVerDatosPremio {
    public Usuario user;
    public frmVerDatosPremio vista;
    
    public ControladorFrmVerDatosPremio(Usuario user){
        this.user=user;
        this.vista=new frmVerDatosPremio();
        
        this.vista.btnRetroceder.addActionListener(new ActionListener() {
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
