package Modelo;

public class Contacto {
    private int nCelular;
    private int nTelefono;
    
    //Constructores
    public Contacto(int nCelular, int nTelefono) {
        this.nTelefono = nTelefono;
        this.nCelular = nCelular;
    }

    public Contacto(int nCelular) {
        this.nCelular = nCelular;
    }

    
    //Setters
    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }
    
    
    //Getters
    public int getnTelefono() {
        return nTelefono;
    }

    public int getnCelular() {
        return nCelular;
    }
    
}