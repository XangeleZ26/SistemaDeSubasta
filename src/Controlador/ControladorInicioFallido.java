package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Aplicacion.*;
import Arreglos.ArregloUsuarios;
import Modelo.*;
import Vista.InicioFallido;
import Vista.PantallaLogin;


public class ControladorInicioFallido {
    private PantallaLogin pantallaInicial;
    private InicioFallido inicioFallido;
    private ControladorPantallaInicial controladorPI;
    private ArregloUsuarios usuarios;
    
    public ControladorInicioFallido(InicioFallido inicioFallido, ArregloUsuarios usuarios) {
        this.inicioFallido = inicioFallido;
        this.usuarios = usuarios;
        
        this.inicioFallido.btnOK.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                inicioFallido.dispose();
                pantallaInicial = new PantallaLogin();
                controladorPI = new ControladorPantallaInicial(pantallaInicial);
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
