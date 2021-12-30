//Puja
package Modelo;

public class Puja {
    // atributos
    private Usuario comprador;
    // se usará para identificar al producto por el que se puja
    private int codProducto;
    // puja en si
    private double precio;
    // fecha en la que se realiza la puja
    private String fecha;
    // hora en la que se realiza la puja
    private String hora;

    // constructor
    public Puja(Usuario comprador, int codProducto, double precio, String fecha, String hora) {
        this.comprador = comprador;
        this.codProducto = codProducto;
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    // getters
    public Usuario getComprador() {
        return comprador;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    // setters

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    // toString

    @Override

    public String toString() {
        return "Puja{" +
                "comprador=" + comprador +
                ", codProducto=" + codProducto +
                ", precio=" + precio +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
