package Controlador;

import Aplicacion.Configuracion;
import Arreglos.ArregloUsuarios;
import Modelo.Usuario;
import Vista.PantallaLogin;
import Vista.RegistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistroUsuario {
    
    private RegistroUsuario registroDeUsuarios;
    private ArregloUsuarios users;
    public ControladorRegistroUsuario(RegistroUsuario registroDeUsuarios){
        this.registroDeUsuarios=registroDeUsuarios;
        this.users=Configuracion.arrUsuarios;
        
        
        this.registroDeUsuarios.btnRegistrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            try{
                String nombre=registroDeUsuarios.TFnombres.getText();
                String apellido=registroDeUsuarios.TFapellidos.getText();
                String DNI=registroDeUsuarios.TFdni.getText();
                String correo=registroDeUsuarios.TFcorreo.getText();
                String contra=String.valueOf(registroDeUsuarios.TFcontrasena.getPassword());
                String confirmcontra=String.valueOf(registroDeUsuarios.TFverificarContrasena.getPassword());
                String celular=registroDeUsuarios.TFcelular.getText();
                String codverificacion=registroDeUsuarios.TFcodigoVerificacion.getText();
                if(!confirmcontra.equals(contra)){
                    registroDeUsuarios.ERROR.setText("Contraseñas no coinciden");
                    JOptionPane.showMessageDialog(registroDeUsuarios, "Contraseñas incorrectas");
                }else{
                    //comprobamos codigo de verificación
                    if(codverificacion.equals("XXXX")){
                        Usuario u= new Usuario(nombre,apellido,DNI,celular,correo,contra,codverificacion);
                        Configuracion.arrUsuarios.agregarUsuario(u);
                        
                        System.out.println(Configuracion.arrUsuarios); //esto es para que me imprima todos los usuarios creados
                        
//                        subasta1.añadirUsuario(u);  ESTÁ RELACIONADO CON LA CLASE "Subasta" de Valeria 
//(Estoy con la duda de cuál será la clase que predomine entre SistemaSubastas y Subasta)
//La clase Subasta está relacionado con varias clases que no existen en el diagrama, por ello no estoy considerando la clase Subasta, debido a que posiblemente sea eliminado
//                        System.out.println(subasta1.mostrarUsuarios());
                        limpiar();
                        JOptionPane.showMessageDialog(registroDeUsuarios, "Registro EXITOSO");
                        registroDeUsuarios.ERROR.setText("");
                    }else{
                        registroDeUsuarios.ERROR.setText("Codigo de verificación erroneo");
                        JOptionPane.showMessageDialog(registroDeUsuarios, "Codigo de verificación erroneo");
                    }        
                }
 
            }catch(Exception error){
                limpiar();
                registroDeUsuarios.ERROR.setText(error.getMessage());
                }
            }
        });
        this.registroDeUsuarios.btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
             PantallaLogin view=new PantallaLogin();
            ControladorPantallaInicial controller=new ControladorPantallaInicial(view);
            registroDeUsuarios.dispose();
            controller.iniciar();
            }
        });

    }
    public void iniciar(){
        registroDeUsuarios.setLocationRelativeTo(null);
        registroDeUsuarios.setVisible(true);
    }

    public void limpiar(){
        registroDeUsuarios.TFnombres.setText("");
        registroDeUsuarios.TFapellidos.setText("");
        registroDeUsuarios.TFdni.setText("");
        registroDeUsuarios.TFapellidos.setText("");
        registroDeUsuarios.TFcelular.setText("");
        registroDeUsuarios.TFcorreo.setText("");
        registroDeUsuarios.TFcontrasena.setText("");
        registroDeUsuarios.TFverificarContrasena.setText("");
        registroDeUsuarios.TFcodigoVerificacion.setText("");
                
    }
}