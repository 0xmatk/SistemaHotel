package Clases;

import Interfaces.IAutentificacionUsuario;

public class Admin extends Persona implements IAutentificacionUsuario {
    private String usuario;
    private String contrasenia;
    public Admin(){
        this.usuario="admin";
        this.contrasenia="1234";
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }



}
