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
      public boolean eliminar(Usuario user) { 
        boolean result = false;
        int marcador = 0;

        for (int i = 0; i < this.indiceUsu; i++) {
            if (this.usuarios[i]==user) {
                marcador = i; 
                result = true;
            };
        }

        if (result == true) {
            if (marcador == this.indiceUsu - 1) {
                this.usuarios[marcador] = null; 
            } 
            else {
                for (int i = marcador; i < this.indiceUsu - 1; i++) {
                    this.usuarios[i] = this.usuarios[i + 1];
                }
                this.usuarios[this.indiceUsu-1] = null;
            }

            this.indiceUsu--;
        }
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
    public Usuario encontrarUsuario(String correo,String contrasena){
         int xd=0;
        for(int i=0; i<this.indiceUsu ; i++) {
            if(correo.equalsIgnoreCase(this.usuarios[i].getCorreo())&&contrasena.equalsIgnoreCase(this.usuarios[i].getContraCuenta())){
                   xd=i;
            }
        }
        return this.usuarios[xd];
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