package Clases;

import Interfaces.IAutentificacionUsuario;

import java.util.Scanner;

public class Sistema implements IAutentificacionUsuario {
    private Scanner teclado ;
    private String usuario;
    private String contrasenia;

    public Sistema() {
        this.teclado = new Scanner(System.in);
        this.usuario = iniciarSesion();
        this.contrasenia = contrasenia;
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
