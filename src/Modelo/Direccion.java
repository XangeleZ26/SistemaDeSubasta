/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GIGABYTE
 */
public class Direccion {
    // atributos dirección
    private String calle;
    private String numero;
    private String distrito;
    private String provincia;
    private String departamento;
    private String pais;
    private String codigoPostal;
    private String referencia;

    // constructor
    public Direccion(String calle, String numero, String distrito, String provincia, String departamento, String pais,
            String codigoPostal, String referencia) {
        this.calle = calle;
        this.numero = numero;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.referencia = referencia;
    }

    // getters
    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getReferencia() {
        return referencia;
    }

    // setters

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    // toString

    @Override

    public String toString() {
        return "Dirección{" + "calle=" + calle + ", numero=" + numero + ", distrito=" + distrito + ", provincia="
                + provincia + ", departamento=" + departamento + ", pais=" + pais + ", codigoPostal=" + codigoPostal
                + ", referencia=" + referencia + '}';
    }

}
