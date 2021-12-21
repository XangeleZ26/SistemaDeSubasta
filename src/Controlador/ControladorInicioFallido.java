package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Aplicacion.*;
import Modelo.*;


public class ControladorInicioFallido {
    private PantallaInicial pantallaInicial;
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
                pantallaInicial = new PantallaInicial();
                controladorPI = new ControladorPantallaInicial(pantallaInicial, usuarios);
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