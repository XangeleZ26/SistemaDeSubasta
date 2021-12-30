//Usuario
package Modelo;

public class Usuario extends Persona{

    private String correo;
    private String contraCuenta;
    private String codVerificacion;
    private boolean activarUbicacion;
    
    private Objeto objetos[];
    private int indiceObj;
    private Producto productos[];
    private int indiceProd;
    private Tarjeta tarjeta;
    
    //Constructor
    public Usuario(String nombre,String apellido,String DNI,String celular,String correo,String contrasena,String codVerificacion) {
        super(nombre,apellido,DNI,celular);
        this.correo = correo;
        this.contraCuenta = contrasena;
        this.codVerificacion = codVerificacion;
        this.objetos = new Objeto[1];
        this.indiceObj = 0;
        this.productos = new Producto[1];
        this.indiceProd = 0;
        this.activarUbicacion=false;
    }
    public Usuario(String nombre,String apellido,String DNI,String celular,String correo,String contrasena,String codVerificacion,Tarjeta tarjet) {
        super(nombre,apellido,DNI,celular);
        this.correo = correo;
        this.contraCuenta = contrasena;
        this.codVerificacion = codVerificacion;
        this.objetos = new Objeto[1];
        this.indiceObj = 0;
        this.productos = new Producto[1];
        this.indiceProd = 0;
        this.tarjeta=tarjet;
        this.activarUbicacion=false;
    }

    public boolean isActivarUbicacion() {
        return activarUbicacion;
    }

    //Getters
    public void setActivarUbicacion(boolean activarUbicacion) {
        this.activarUbicacion = activarUbicacion;
    }

    public String getContraCuenta() {
        return contraCuenta;
    }
    
    public String getCodVerificacion() {
        return codVerificacion;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public Objeto[] getObjetos() {
        return objetos;
    }
    
    public Producto[] getProductos() {
        return productos;
    }
    
    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    
    //Metodos
    public boolean agregarObjeto(Objeto o) {
        boolean result = false;
        if(this.arregloLlenoObj()){
            this.crecerArregloObj();
        }
        this.objetos[this.indiceObj] = o;
        this.indiceObj++;
        result = true;
        return result;
    }
    
    private boolean arregloLlenoObj() {
        boolean result = false;
        if(this.indiceObj >= this.objetos.length) {
            result = true;
        }
        return result;
    }
    
    private boolean crecerArregloObj() {
        boolean result = false;
        Objeto objetosPlus[] = new Objeto[this.objetos.length+1];
        for(int i=0; i<this.objetos.length; i++) {
            objetosPlus[i] = this.objetos[i];
        }
        this.objetos = objetosPlus;
        result = true;
        return result;
    }
    
    public boolean agregarProducto(Objeto o, float precioInicial, float aumento) {
        boolean result = false;
        Producto prod = new Producto(o, precioInicial, aumento);
        if(this.arregloLlenoProd()){
            this.crecerArregloProd();
        }
        this.productos[this.indiceProd] = prod;
        this.indiceProd++;
        result = true;
        return result;
    }
    
    private boolean arregloLlenoProd() {
        boolean result = false;
        if(this.indiceProd >= this.productos.length) {
            result = true;
        }
        return result;
    }
    
    private boolean crecerArregloProd() {
        boolean result = false;
        Producto productosPlus[] = new Producto[this.productos.length+1];
        for(int i=0; i<this.productos.length; i++) {
            productosPlus[i] = this.productos[i];
        }
        this.productos = productosPlus;
        result = true;
        return result;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", contraCuenta=" + contraCuenta + ", codVerificacion=" + codVerificacion + ", objetos=" + objetos + ", indiceObj=" + indiceObj + ", productos=" + productos + ", indiceProd=" + indiceProd + ", tarjeta=" + tarjeta + '}';
    }
    
    
}  