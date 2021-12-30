//Subasta
package Modelo;

import java.util.ArrayList;

public class Subasta {
    // atributos
    // arraylist usuarios
    private ArrayList<Usuario> usuarios;
    // arraylist productos
    private ArrayList<Producto> productos;
    // arraylist pujas
    private ArrayList<Puja> pujas;
    // arraylist facturas
    private ArrayList<Constancia> constancias;

    // constructor
    public Subasta() {
        this.usuarios = new ArrayList<Usuario>();
        this.productos = new ArrayList<Producto>();
        this.pujas = new ArrayList<Puja>();
        this.constancias = new ArrayList<Constancia>();
    }

    // getters
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Puja> getPujas() {
        return pujas;
    }

    public ArrayList<Constancia> getFacturas() {
        return constancias;
    }

    // setters

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setPujas(ArrayList<Puja> pujas) {
        this.pujas = pujas;
    }

    public void setFacturas(ArrayList<Constancia> constancias) {
        this.constancias = constancias;
    }

    // metodos
    // usuarios
    // añadir usuario
    public boolean añadirUsuario(Usuario usuario) {
        // verificar si existe el usuario
        for (Usuario u : this.usuarios) {
            if (u.getCorreo().equals(usuario.getCorreo())) {
                return false;
            }
        }
        // añadir usuario
        this.usuarios.add(usuario);
        return true;
    }

    // eliminar usuario
    public boolean eliminarUsuario(Usuario usuario) {
        // verificar si existe el usuario
        for (Usuario u : this.usuarios) {
            if (u.getCorreo().equals(usuario.getCorreo())) {
                this.usuarios.remove(u);
                return true;
            }
        }
        return false;
    }

    // mostrar usuarios
    public String mostrarUsuarios() {
        String usuarios = "";
        for (Usuario u : this.usuarios) {
            usuarios += u.toString() + "\n";
        }
        return usuarios;
    }

    // productos (clausuarado por el momento)

//    // mostrar productos
//    public String mostrarProductos() {
//        String productos = "";
//        for (Producto p : this.productos) {
//            productos += p.toString() + "\n";
//        }
//        return productos;
//    }

   
    // eliminar puja
    public boolean eliminarPuja(Puja puja) {
        // verificar si existe la puja
        for (Puja p : this.pujas) {
            if (p.equals(puja)) {
                this.pujas.remove(p);
                return true;
            }
        }
        return false;
    }

    // mostrar pujas
    public String mostrarPujas() {
        String pujas = "";
        for (Puja p : this.pujas) {
            pujas += p.toString() + "\n";
        }
        return pujas;
    }

    // facturas
    // añadir factura
    public void añadirConstancia(Constancia constancias) {
        this.constancias.add(constancias);
    }


    // eliminar factura
    public boolean eliminarConstancia(Constancia constancias) {
        // verificar si existe la factura
        for (Constancia f : this.constancias) {
            if (f.equals(constancias)) {
                this.constancias.remove(f);
                return true;
            }
        }
        return false;
    }

    // mostrar facturas
    public String mostrarConstancias() {
        String facturas = "";
        for (Constancia f : this.constancias) {
            facturas += f.toString() + "\n";
        }
        return facturas;
    }

    // metodos extra

    // buscar usuario
    public Usuario buscarUsuario(String correo) {
        for (Usuario u : this.usuarios) {
            if (u.getCorreo().equals(correo)) {
                return u;
            }
        }
        return null;
    }

    // mostrar pujas de un usuario
    public String mostrarPujasUsuario(Usuario usuario) {
        String pujas = "";
        for (Puja p : this.pujas) {
            if (p.getComprador().equals(usuario)) {
                pujas += p.toString() + "\n";
            }
        }
        return pujas;
    }


}
