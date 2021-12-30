//ArregloUsuarios
package Arreglos;

import Modelo.Usuario;


public class ArregloUsuarios {
    private Usuario usuarios[];
    private int indiceUsu;
    
    //Constructor
    public ArregloUsuarios() {
        this.usuarios = new Usuario[5];
        this.indiceUsu = 0;
    }
    
    public ArregloUsuarios(ArregloUsuarios usuarios) { //extra
        this.usuarios = usuarios.getUsuarios();
        this.indiceUsu = usuarios.getIndiceUsu();
    }
    
    
    //Getters
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public int getIndiceUsu() {
        return indiceUsu;
    }
    
    
    
    //Métodos
    public boolean agregarUsuario(Usuario u) {
        boolean result = false;
        if(this.estaLlenoUsu()){
            this.crecerArregloUsu();
        }
        this.usuarios[this.indiceUsu] = u;
        this.indiceUsu++;
        result = true;
        return result;
    }
    public boolean usuarioRegistrado(String correo,String contrasena){
        boolean result=false;
        for(int i=0; i<this.indiceUsu ; i++) {
            if(correo.equalsIgnoreCase(this.usuarios[i].getCorreo())&&contrasena.equalsIgnoreCase(this.usuarios[i].getContraCuenta())){
                    result = true;
            }
        }
        
       return result;
    }
    private boolean estaLlenoUsu() {
        boolean result = false;
        if(this.indiceUsu >=this.usuarios.length){
            result = true;
        }
        return result;
    }
    
    private boolean crecerArregloUsu() {
        boolean result = false;
        Usuario usuariosPlus[] = new Usuario[this.usuarios.length+1];
        for(int i=0; i<this.usuarios.length; i++) {
            usuariosPlus[i] = this.usuarios[i];
        }
        this.usuarios = usuariosPlus;
        result = true;
        return result;
    }

    @Override
    public String toString() {
        String contenido = "";
         for(int i=0;i<this.indiceUsu;i++){
             contenido+=this.usuarios[i]+"\n";
         }
         return contenido;
    }
    
}