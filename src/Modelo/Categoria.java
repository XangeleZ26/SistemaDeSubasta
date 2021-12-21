package Modelo;

public class Categoria {
    private String codigo;
    private String nombre;
    
    
    //Constructor
    public Categoria(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //Getters
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
}