//Persona
package Modelo;

public class Persona {

    private String nombre;
    private String apellido;
    private String DNI;
    private String celular;
    private Direccion direccion;
    public Persona(String nombre, String apellido, String DNI, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.celular = celular;
        this.direccion=new Direccion();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    //Getters
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   

}
