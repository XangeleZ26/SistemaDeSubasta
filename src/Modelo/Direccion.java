package Modelo;

public class Direccion {
    // atributos dirección
    private String pais;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;

    // constructor
    public Direccion(String pais,String Departamento,String Provincia,String Distrito,String direccion) {
       this.pais=pais;
       this.departamento=Departamento;
       this.provincia=Provincia;
       this.distrito=Distrito;
       this.direccion=direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    // getters
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // toString

    @Override
    public String toString() {
        return "Direccion{" + "pais=" + pais + ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", direccion=" + direccion + '}';
    }
   
}