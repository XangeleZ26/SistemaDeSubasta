package Modelo;

import Arreglos.ArregloUsuarios;

public class Sistema {
    private ArregloUsuarios usuariosRegistrados;
    private GeneradorCodigos generador;
    
    //Constructor
    public Sistema(ArregloUsuarios usuariosRegistrados, GeneradorCodigos generador) {
        this.usuariosRegistrados = usuariosRegistrados;
        this.generador = generador;
    }
    
    
    //Getters
    public ArregloUsuarios getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
    
    public GeneradorCodigos getGenerador() {
        return generador;
    }
    
    public boolean crearSubasta( Producto p) {
        // TODO implement here
        return false;
    }

    public boolean entregarConstancia(Usuario u, Constancia c) {
        // TODO implement here
        return false;
    }
    //Métodos
    public boolean ingresar(String correo, String contrasena) {
        boolean result = false;
        
        
        return result;
    }
    
    
    
    
    
}
