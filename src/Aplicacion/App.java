package Aplicacion;

import Arreglos.ArregloUsuarios;
import Modelo.*;
import Controlador.*;
import Vista.PantallaLogin;

public class App {
    public static void main(String [] Args) {
        //PRUEBAS DE LAS CLASES:
        Ubicacion ubicacion = new Ubicacion("Perú", "Lima", "Breña", "Av. Arica");
        //Contstructor llamado: (String pais, String provincia, String distrito, String dirección)
        
        Contacto contacto = new Contacto(982526109, 1548274);
        //Constructor llamado: (int nCelular, int nTelefono)
        
        Tarjeta tarjeta = new Tarjeta(51246587, 123, 350f, 1.5f, true);
        //Constructor llamado: (int numero, int CVV, float saldo, float costoTransaccion, boolean estado)
        
        Usuario usuario = new Usuario("JuanSAH", "juanSaHua154@gmail.com", "hamburguesa123", "AM1JKR45H", "Juan", "Salinaz", "Huaroto", 72429856, ubicacion, contacto, tarjeta);
        //Contstructor llamado: (String ID, String correo, String contraCuenta, String codVerificacion, String nombre, String aPaterno, String aMaterno, int DNI, Ubicacion ubicacion, Contacto contacto, Tarjeta tarjeta)
        
        Objeto objeto1 = new Objeto("Caja de lapiceros", "Una caja de lapiceros marca pilot punta fina de color azul", "OPTIMA");
        Objeto objeto2 = new Objeto("Caja de colores", "Una caja de colores mara artesco con 12 colores cada una", "OPTIMA");
        //Constructor llamado: (String nombre, String descripcion, String condicion)
        
        Categoria categoria1 = new Categoria("1001A", "Utiles");
        Categoria categoria2 = new Categoria("3001S", "Lapiceros");
        Categoria categoria3 = new Categoria("4001J", "Lapiz de color");
        //Constructor llamado: (String codigo, String nombre)
        
        objeto1.agregarCategoria(categoria1);
        objeto1.agregarCategoria(categoria2);
        objeto2.agregarCategoria(categoria1);
        objeto2.agregarCategoria(categoria3);
        
        usuario.agregarObjeto(objeto1);
        usuario.agregarObjeto(objeto2);
        
        usuario.agregarProducto(objeto1, 5.5f, 2.5f);
        usuario.agregarProducto(objeto2, 3.7f, 1.1f);
        
        ArregloUsuarios usuarios = new ArregloUsuarios();
        usuarios.agregarUsuario(usuario);
        
        GeneradorCodigos codigo = new GeneradorCodigos(usuarios);
        codigo.generar();
        System.out.println(codigo.getCodigo());
        codigo.generar();
        System.out.println(codigo.getCodigo());
        //El codigo nunca será se repetirá
        
        SistemaSubastas sistema = new SistemaSubastas(usuarios, codigo);
        sistema.getGenerador().generar();
        System.out.println(sistema.getGenerador().getCodigo());
        
        
        PantallaLogin pantallaInicial = new PantallaLogin();
        ControladorPantallaInicial controlador = new ControladorPantallaInicial(pantallaInicial, usuarios);
        controlador.iniciar();
        
    }
}