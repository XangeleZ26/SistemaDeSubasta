package Modelo;

import Arreglos.ArregloUsuarios;

public class SistemaSubastas {
    private ArregloUsuarios usuariosRegistrados;
    private GeneradorCodigos generador;
    
    //Constructor
    public SistemaSubastas(GeneradorCodigos generador) {
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
    
    
    //Métodos
    public boolean ingresar(String correo, String contrasena) {
        boolean result = false;
        
        
        return result;
    }
    
    
    
    
    
}