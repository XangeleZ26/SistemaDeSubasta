//Tarjeta
package Modelo;

public class Tarjeta {
    private String numero=null;
    private String CVV;

    
    //Constructores
    public Tarjeta(String numero, String CVV) {
        this.numero = numero;
        this.CVV = CVV;
    }
    public Tarjeta(){
        
    }

    //Getters
    public String getNumero() {
        return numero;
    }
    
    public String getCVV() {
        return CVV;
    }
    
    //Metodos
//    public void cancelarTarjeta() {
//        this.estado = false;
//    }
//    
//    public void activarTarjeta() {
//        this.estado = true;
//    }
//    
//    private boolean tarjetaActiva() {
//        boolean result = false;
//        if(this.getEstado()){
//            result = true;
//        }
//        return result;
//    }
//    
//    public boolean pagar(float precio) {
//        boolean result = false;
//        if(tarjetaActiva()&&(precio>0f)&&(this.saldo>=precio)){
//            this.saldo -= precio;
//            result = true;
//        }
//        return result;
//    }
//    
//    public boolean recargar(float dinero) {
//        boolean result = false;
//        if(tarjetaActiva()&&(dinero>0f)) {
//            this.saldo += dinero;
//            result = true;
//        }
//        return result;
//    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
    
}