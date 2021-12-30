//Tarjeta
package Modelo;

public class Tarjeta {
    private int numero;
    private int CVV;
    private float saldo;
    private float costoTransaccion;
    private boolean estado;
    
    //Constructores
    public Tarjeta(int numero, int CVV, float saldo, float costoTransaccion, boolean estado) {
        this.numero = numero;
        this.CVV = CVV;
        this.saldo = saldo;
        this.costoTransaccion = costoTransaccion;
        this.estado = estado;
    }

    public Tarjeta(int numero, int CVV, float saldo) {
        this.numero = numero;
        this.CVV = CVV;
        this.saldo = saldo;
        this.costoTransaccion = 0f;
        this.estado = true;
    }
    
    
    //Getters
    public int getNumero() {
        return numero;
    }
    
    public int getCVV() {
        return CVV;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public float getCostoTransaccion() {
        return costoTransaccion;
    }
    
    public boolean getEstado() {
        return estado;
    }
    
    
    //Metodos
    public void cancelarTarjeta() {
        this.estado = false;
    }
    
    public void activarTarjeta() {
        this.estado = true;
    }
    
    private boolean tarjetaActiva() {
        boolean result = false;
        if(this.getEstado()){
            result = true;
        }
        return result;
    }
    
    public boolean pagar(float precio) {
        boolean result = false;
        if(tarjetaActiva()&&(precio>0f)&&(this.saldo>=precio)){
            this.saldo -= precio;
            result = true;
        }
        return result;
    }
    
    public boolean recargar(float dinero) {
        boolean result = false;
        if(tarjetaActiva()&&(dinero>0f)) {
            this.saldo += dinero;
            result = true;
        }
        return result;
    }
    
}