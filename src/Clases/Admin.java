package Clases;

import Interfaces.IAutentificacionUsuario;

public class Admin extends Persona implements IAutentificacionUsuario {
    private String usuario;
    private String contrasenia;

    public Admin(String nombre, String apellido){
        super(nombre, apellido);
        this.usuario="admin";
        this.contrasenia="1234";
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }


    @Override
    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        return false;
    }

    @Override
    public void cerrarSesion() {

    }

    @Override
    public boolean verificarCredenciales(String nombreUsuario, String contrasena) {
        return IAutentificacionUsuario.super.verificarCredenciales(nombreUsuario, contrasena);
    }
}
