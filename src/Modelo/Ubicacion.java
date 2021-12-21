package Modelo;

public class Ubicacion {
    private String pais;
    private String provincia;
    private String distrito;
    private String dirección;
    
    //Constructores   
    public Ubicacion(String pais, String provincia, String distrito, String dirección) {
        this.pais = pais;
        this.provincia = provincia;
        this.distrito = distrito;
        this.dirección = dirección;
    }
    
    public Ubicacion(String pais, String provincia, String distrito) {
        this.pais = pais;
        this.provincia = provincia;
        this.distrito = distrito;
    }
    
    public Ubicacion(String pais, String provincia) {
        this.pais = pais;
        this.provincia = provincia;
    }
    
    public Ubicacion(String pais) {
        this.pais = pais;
    }
    
    
    //Setters
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
    //Getters
    public String getPais() {
        return pais;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    public String getDistrito() {
        return distrito;
    }
    
    public String getDirección() {
        return dirección;
    }
    
}