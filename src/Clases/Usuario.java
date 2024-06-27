package Clases;

import Interfaces.IAdministrarEstadia;

public abstract class Usuario extends Persona{
    protected String usuario;
    protected String clave;


    public Usuario(){

    }

    public Usuario(String nombre, String apellido, String usuario, String clave) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
