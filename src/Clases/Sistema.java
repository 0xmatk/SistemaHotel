package Clases;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sistema  {
    private Scanner teclado ;
    private List<Usuario> usuarios;
    private Hotel hotel;
/// Sacaria esos atributos y colocaria una coleccion de usuarios y el hotel. Para con iniciarseccion te entregue el Usuario utilizado
/// Buscar como hacer limpieza de pantalla




    public Sistema() {
        this.teclado = new Scanner(System.in);
       this.hotel = new Hotel();
       this.usuarios= new LinkedList<>();
    }
///=====================================================================================================================
///<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<SWITCHS/ TAREAS A REALIZAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public void actividadUsuario(Usuario usuario){
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

    public void iniciarSesion() {
        int flag=0;
        Usuario aux= null;
        System.out.printf("===========================================================================================================\n");
        System.out.printf("=======================================Bienvenido a nuestro sistema Hotelero===============================\n");
        System.out.printf("===========================================================================================================\n");

        while(flag==0) {
            System.out.printf("Ingrese su usuario:...");
            String usua = this.teclado.next();
            System.out.printf("Ingrese su contraseña:...");
            String contraseña = this.teclado.next();



            if (usua == null || contraseña == null) {
                System.out.printf("Ingrese nuevamente los parametros pedidos\n");
            } else {
                for (Usuario Usuario : this.usuarios) {
                    if (Usuario.getUsuario().equals(usua) && Usuario.getClave().equals(contraseña)) {
                        aux = Usuario;
                    }

                }
                if (aux == null) {
                    System.out.printf("Su usuario no existe.");
                }
                else{
                    flag=1;
                    this.actividadUsuario(aux);
                }
            }


        }
    }

///=====================================================================================================================




}
