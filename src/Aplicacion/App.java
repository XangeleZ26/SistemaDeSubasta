//Aplicación
package Aplicacion;

import Arreglos.ArregloUsuarios;
import Modelo.*;
import Controlador.*;
import Vista.frmLogin;

public class App {
    public static void main(String [] Args) {
        //PRUEBAS DE LAS CLASES:


        Tarjeta tarjeta = new Tarjeta("51246587", "123");
        //Constructor llamado: (int numero, int CVV)
        
        Usuario usuario = new Usuario("Angel","Villanueva","12345678","123456789","xd","123","XXXX",tarjeta);
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
        objeto2.agregarCategoria(categoria3);
        
        usuario.agregarObjeto(objeto1);
        usuario.agregarObjeto(objeto2);
        
        usuario.agregarProducto(objeto1, 5.5f, 2.5f);
        usuario.agregarProducto(objeto2, 3.7f, 1.1f);
        
        Configuracion.arrUsuarios.agregarUsuario(usuario);
        
        
        GeneradorCodigos codigo = new GeneradorCodigos(); //GeneradorCodigo no hace falta que tenga como parámetro a usuarios (según lo que veo hasta ahora)
        codigo.generar();
        System.out.println(codigo.getCodigo());
        codigo.generar();
        System.out.println(codigo.getCodigo());
        //El codigo nunca será se repetirá
        
//        SistemaSubastas sistema = new SistemaSubastas(usuarios, codigo); CLAUSURADO POR MIENTRAS xd
//        sistema.getGenerador().generar();
//        System.out.println(sistema.getGenerador().getCodigo());
        
        
        frmLogin pantallaInicial = new frmLogin();
        //aqui tambien colocar el constructor de SistemaSubastas
        ControladorFrmLogin controlador = new ControladorFrmLogin(pantallaInicial);
        controlador.iniciar();
        System.out.println(usuario);
        System.out.println("CODIGO DE VERIFICACION PARA REGISTRO DE USUARIO: XXXX");
    }

}