package Clases;

import Interfaces.IAutentificacionUsuario;

import java.util.List;
import java.util.Scanner;

public class Sistema implements IAutentificacionUsuario {
    private Scanner teclado ;
    private List<Persona> usuarios;
    private Hotel hotel;
/// Sacaria esos atributos y colocaria una coleccion de usuarios y el hotel. Para con iniciarseccion te entregue el Usuario utilizado
/// Buscar como hacer limpieza de pantalla




    public Sistema() {
        this.teclado = new Scanner(System.in);
       this.hotel = new Hotel();
    }
///=====================================================================================================================
///<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<SWITCHS/ TAREAS A REALIZAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public void actividadUsuario(Persona usuario){
        if(usuario instanceof Administrador){
            Administrador adm= (Administrador) usuario;
           adm.adminSwitch(this.hotel);
        }else{
            if(usuario instanceof Empleado){
                Empleado emp= (Empleado) usuario;
               emp.empSwitch(this.hotel);
            }else{
                if(usuario instanceof Visitante){
                    Visitante visit= (Visitante) usuario;
                    visit.visitanteSwitch(this.hotel);
                }
            }
        }
    }



///=====================================================================================================================



    @Override
    public boolean iniciarSesion(String nombreUsuario, String contrasena) {

        if(verificarCredenciales(nombreUsuario, contrasena) == true){


        }else{
            System.out.println("Usuario y contraseña Incorrectos, Intente nuevamente");
        }

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
