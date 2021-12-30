//ControladorInicioFallido
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Aplicacion.*;
import Arreglos.ArregloUsuarios;
import Modelo.*;
import Vista.InicioFallido;
import Vista.frmLogin;


public class ControladorInicioFallido {
    private frmLogin pantallaInicial;
    private InicioFallido inicioFallido;
    private ControladorFrmLogin controladorPI;
    private ArregloUsuarios usuarios;
    
    public ControladorInicioFallido(InicioFallido inicioFallido, ArregloUsuarios usuarios) {
        this.inicioFallido = inicioFallido;
        this.usuarios = usuarios;
        
        this.inicioFallido.btnOK.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                inicioFallido.dispose();
                pantallaInicial = new frmLogin();
                controladorPI = new ControladorFrmLogin(pantallaInicial);
                controladorPI.iniciar();
            }
        });
    }
    
    public void cerrar() {
        inicioFallido.dispose();
    }
    
    public void iniciar() {
        inicioFallido.setLocationRelativeTo(null);
        inicioFallido.setVisible(true);
    }
    
}   
