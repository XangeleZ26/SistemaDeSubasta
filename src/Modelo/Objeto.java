package Modelo;

public class Objeto {
    private String nombre;
    private String descripcion;
    private String condicion;
    private Categoria categorias[];
    private int indiceCat;

    
    //Constructor
    public Objeto(String nombre, String descripcion, String condicion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.condicion = condicion;
        this.categorias = new Categoria[1];
        this.indiceCat = 0;
    }
    
    
    //Getters
    public Categoria[] getCategorias() {
        return categorias;
    }
    
    
    //Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getCondicion() {
        return condicion;
    }
    
    //Metodos
    public boolean agregarCategoria(Categoria c) {
        boolean result = false;
        if(this.arregloLlenoCat()){
            this.crecerArregloCat();
        }
        this.categorias[this.indiceCat] = c;
        this.indiceCat++;
        result = true;
        return result;
    }
    
    private boolean arregloLlenoCat() {
        boolean result = false;
        if(this.indiceCat >= this.categorias.length) {
            result = true;
        }
        return result;
    }
    
    private boolean crecerArregloCat() {
        boolean result = false;
        Categoria categoriasPlus[] = new Categoria[this.categorias.length+1];
        for(int i=0; i<this.categorias.length; i++) {
            categoriasPlus[i] = this.categorias[i];
        }
        this.categorias = categoriasPlus;
        result = true;
        return result;
    }
    
}