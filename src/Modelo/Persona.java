package Modelo;

public abstract class Persona {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private int DNI;
    private Ubicacion ubicacion;
    private Contacto contacto;

    public Persona(String nombre, String aPaterno, String aMaterno, int DNI, Ubicacion ubicacion, Contacto contacto) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.DNI = DNI;
        this.ubicacion = ubicacion;
        this.contacto = contacto;
    }
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getaPaterno() {
        return aPaterno;
    }
    
    public String getaMaterno() {
        return aMaterno;
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    
    public Contacto getContacto() {
        return contacto;
    }
    
}