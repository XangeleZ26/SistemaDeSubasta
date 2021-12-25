package Modelo;

import Arreglos.ArregloUsuarios;

public class GeneradorCodigos {
    private String codigo;
    private ArregloUsuarios usuarios;
    
    
    //Constructor
    public GeneradorCodigos(ArregloUsuarios usuarios) {
        this.codigo = codigo;
        this.usuarios = new ArregloUsuarios(usuarios);
    }
    
    public GeneradorCodigos() {
        
    }
    
    //Getters
    public String getCodigo() {
        return codigo;
    }
    
    
    //Métodos
    public String generar() {
        this.codigo = "";
        do{
            for(int i=0; i<9; i++) {
                if(this.generarRandom() < 5){
                    int random = this.generarRandom();
                    if(random < 2){
                        switch(this.generarRandom()){
                            case 0:
                            case 1: this.codigo += "A";
                                break;
                            case 2:
                            case 3: this.codigo += "B";
                                break;
                            case 4:
                            case 5: this.codigo += "C";
                                break;
                            case 6:
                            case 7: this.codigo += "D";
                                break;
                            case 8:
                            case 9: this.codigo += "E";
                                break;
                        }
                    }
                    else if(random >= 2 && random < 4) {
                        switch(this.generarRandom()){
                            case 0:
                            case 1: this.codigo += "F";
                                break;
                            case 2:
                            case 3: this.codigo += "G";
                                break;
                            case 4:
                            case 5: this.codigo += "H";
                                break;
                            case 6:
                            case 7: this.codigo += "I";
                                break;
                            case 8:
                            case 9: this.codigo += "J";
                                break;
                        }
                    }
                    else if(random >= 4 && random < 6) {
                        switch(this.generarRandom()){
                            case 0:
                            case 1: this.codigo += "K";
                                break;
                            case 2:
                            case 3: this.codigo += "L";
                                break;
                            case 4:
                            case 5: this.codigo += "M";
                                break;
                            case 6:
                            case 7: this.codigo += "N";
                                break;
                            case 8:
                            case 9: this.codigo += "O";
                                break;
                        }
                    }
                    else if(random >= 6 && random <8) {
                        switch(this.generarRandom()){
                            case 0:
                            case 1: this.codigo += "P";
                                break;
                            case 2:
                            case 3: this.codigo += "Q";
                                break;
                            case 4:
                            case 5: this.codigo += "R";
                                break;
                            case 6:
                            case 7: this.codigo += "S";
                                break;
                            case 8:
                            case 9: this.codigo += "T";
                                break;
                        }
                    }
                    else{
                        switch(this.generarRandom()){
                            case 0:
                            case 1: this.codigo += "U";
                                break;
                            case 2:
                            case 3: this.codigo += "V";
                                break;
                            case 4:
                            case 5: this.codigo += "W";
                                break;
                            case 6:
                            case 7: this.codigo += "X";
                                break;
                            case 8:
                            case 9: this.codigo += "Y";
                                break;
                        }
                    }
                }
                else{
                    this.codigo += String.format("%c", this.generarRandom() + 48);
                }

            }
            return codigo;
        }while(this.codigoExiste());
    }
    
    private int generarRandom() {
        int random;
        random = (int)(Math.random() * 10);
        return random;
    }
    
    private boolean codigoExiste() {
        boolean result = false;
        for(int i=0; i<this.usuarios.getIndiceUsu(); i++) {
            if(this.codigo == this.usuarios.getUsuarios()[i].getCodVerificacion()) {
                result = true;
            }
        }
        return result;
    }
    
}