package Clases;

import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarReserva;
import Interfaces.IAltaBajaModificacion;

import java.util.Date;
import java.util.Scanner;


public class Admin extends Persona implements IAdministrarReserva, IAdministrarEstadia, IAltaBajaModificacion {
    private String usuario;
    private String contrasenia;

    public Admin(String nombre, String apellido) {
        super(nombre, apellido);
        this.usuario = "admin";
        this.contrasenia = "1234";
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    ///=================================================================================================================
    public void adminSwitch(Hotel hotel) {
        Scanner teclado;
        teclado = new Scanner();

        ///Ver si hay que agregar alguna opcion que pueda hacer el Admin

        System.out.println("1- Visualizar informacion del hotel \n" +
                "2- Editar informacion del hotel\n" +
                "3-Eliminar informacion del hotel\n" +
                "4-Crear informacion del hotel\n");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.adminSwitchVisualizar();
                break;

            case 2:
                this.adminSwitchEditar();
                break;

            case 3:
                adminSwitchEliminar();
                break;
            case 4:
                adminSwitchCrear();


        }
    }

    private void adminSwitchVisualizar() {
        Scanner teclado = new Scanner();
        System.out.println("1- Visualizar Habitaciones del hotel \n" +
                "2- Visualizar empleados\n" +
                "3-visualizar Estadias\n" +
                "4-Visualizar Reservas\n" +
                "5- Visualizar Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Metodo de llamado a lista de habitaciones y mostrar
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y mostrar
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y mostrar
                break;
            case 4:
                /// Metodo de llamado a lista de Reservas y mostrar
                break;
            case 5:
                /// Metodo de llamado a lista de Visitantes y mostrar
                break;
        }
    }


    private void adminSwitchEditar() {

        Scanner teclado = new Scanner();

        System.out.println("1- Editar Habitaciones del hotel \n" +
                "2- Editar empleados\n" +
                "3-Editar Estadias\n" +
                "4-Editar Reservas\n" +
                "5- Editar Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                editSwitchHabitaciones();
                break;
            case 2:
                editSwitchEmpleados();
                break;
            case 3:
                editSwitchEstadias();
                break;
            case 4:
                ///editSwitchReservas();
                break;
            case 5:
                ///editSwitchVisitantes();
                break;
        }
    }

    private void adminSwitchEliminar() {

        Scanner teclado = new Scanner();
        System.out.println("1- Eliminar Habitaciones del hotel \n" +
                "2- Eliminar empleados\n" +
                "3-Eliminar Estadias\n" +
                "4-Eliminar Reservas\n" +
                "5- Eliminar Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Metodo de llamado a lista de habitaciones y luego poder Eliminar
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y luego poder Eliminar
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y luego poder Eliminar
                break;
            case 4:
                /// Metodo de llamado a lista de Reservas y luego poder Eliminar
                break;
            case 5:
                /// Metodo de llamado a lista de Visitantes y luego poder Eliminar
                break;
        }
    }

    private void adminSwitchCrear() {

        Scanner teclado = new Scanner();
        System.out.println("1- Crear Habitaciones del hotel \n" +
                "2- Crear empleados\n" +
                "3-Crear Estadias\n" +
                "4-Crear Reservas\n" +
                "5- Crear Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Metodo de llamado a lista de habitaciones y luego poder Crear
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y luego poder Crear
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y luego poder Crear
                break;
            case 4:
                /// Metodo de llamado a lista de Reservas y luego poder Crear
                break;
            case 5:
                /// Metodo de llamado a lista de Visitantes y luego poder Crear
                break;
        }
    }


    private void editSwitchHabitaciones() {

        Scanner teclado = new Scanner();
        ///Pedir numero de habitacion y asignarlo
        /// Mostrar Habitacion

        System.out.println("1- Editar tipo de la habitacion \n" +
                "2- Editar numero de la habitacion\n" +
                "3-Editar coste de la habitacion\n" +
                "4-Editar diponibilidad\n");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Solicitar nuevo tipo y asignar
                break;
            case 2:
                ///Solicitar nuevo num y asignar
                break;
            case 3:
                ///Solicitar nuevo coste y asignar
                break;
            case 4:
                ///Solicitar nueva disponibilidad y asignar

        }


    }

 private void   editSwitchEmpleados(){

     Scanner teclado = new Scanner();
     ///Pedir El empleado por nroLegajo
     /// Mostrar mostrar Empleado

     System.out.println("1- Editar Nombre del Empleado \n" +
             "2- Editar apellido del Empleado\n" +
             "3-Editar nro Legajo del Empleado\n" +
             "4-Editar estado del Empleado\n");

     int opcion = teclado.nextInt();


     switch (opcion) {
         case 1:
             ///Solicitar y asignar
             break;
         case 2:
             ///Solicitar  y asignar
             break;
         case 3:
             ///Solicitar  y asignar
             break;
         case 4:
             ///Solicitar  y asignar

     }

 }

 private void   editSwitchEstadias(){

     Scanner teclado = new Scanner();
     ///Pedir El empleado por nroLegajo
     /// Mostrar mostrar Empleado

     System.out.println("1- Editar Nombre de la  Estadia \n" +
             "2- Editar apellido de la  Estadia\n" +
             "3-Editar nro Legajo de la  Estadia\n" +
             "4-Editar estado de la  Estadia\n");

     int opcion = teclado.nextInt();


     switch (opcion) {
         case 1:
             ///Solicitar y asignar
             break;
         case 2:
             ///Solicitar  y asignar
             break;
         case 3:
             ///Solicitar  y asignar
             break;
         case 4:
             ///Solicitar  y asignar

     }

 }


    @Override
    public void crearEstadia(Visitante visitante, Habitacion habitacion, boolean checkIn, boolean checkOut, int costo) {

    }

    @Override
    public void editarEstadia(int ID) {

    }

    @Override
    public void listarEstadias() {

    }

    @Override
    public void buscarEstadia(int dni) {

    }

    @Override
    public void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado) {

    }

    @Override
    public void editarReserva(int id) {

    }

    @Override
    public void listarReservas() {

    }

    @Override
    public void buscarReserva(int id) {

    }

    @Override
    public void darAlta() {
        IAltaBajaModificacion.super.darAlta();
    }

    @Override
    public void darBaja() {
        IAltaBajaModificacion.super.darBaja();
    }

    @Override
    public void modificar() {
        IAltaBajaModificacion.super.modificar();
    }
}


///===================================================================================================================

