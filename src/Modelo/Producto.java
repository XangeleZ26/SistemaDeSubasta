//Producto
package Modelo;

public class Producto extends Objeto {
    private float precioInicial;
    private float aumento;
    
    
    //Constructores
    public Producto(float precioInicial, float aumento, String nombre, String descripcion, String condicion) {
        super(nombre, descripcion, condicion);
        this.precioInicial = precioInicial;
        this.aumento = aumento;
    }
    
    public Producto(Objeto o, float precioInicial, float aumento) {
        super(o.getNombre(), o.getDescripcion(), o.getCondicion());
        this.precioInicial = precioInicial;
        this.aumento = aumento;
    }
    
    
    //Getters
    public float getPrecioInicial() {
        return precioInicial;
    }
    
    public float getAumento() {
        return aumento;
    }
}