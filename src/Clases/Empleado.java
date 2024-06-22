package Clases;
import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarHabitacion;
import Interfaces.IAdministrarReserva;

import java.util.Date;
import java.util.Scanner;

public class Empleado extends Persona{
    private int nroLegajo;
    private boolean estado;

    public Empleado(String nombre, String apellido, int nroLegajo) {
        super(nombre, apellido);
        this.nroLegajo = nroLegajo;
        this.estado = true;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
///=========================================================================================================================


    public void empSwitch(Hotel hotel) {
        Scanner teclado;
        teclado = new Scanner(System.in);


        System.out.println("1- Visualizar informacion del hotel \n" +
                "2- Editar informacion del hotel\n" +
                "3-Eliminar informacion del hotel\n" +
                "4-Crear informacion del hotel\n");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.empSwitchVisualizar(hotel);
                break;

            case 2:
                this.empSwitchEditar(hotel);
                break;

            case 3:
                this.empSwitchEliminar(hotel);
                break;
            case 4:
                this.empSwitchCrear(hotel);


        }
    }


    protected void empSwitchVisualizar(Hotel hotel) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1- Visualizar Habitaciones del hotel \n" +
                "2- Visualizar Visitantes\n" +
                "3-visualizar Estadias\n" +
                "4-Visualizar Reservas\n" );

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                // Metodo de llamado
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y mostrar
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y mostrar
                break;
            case 4:
                hotel.mostrarReservas();
                break;
        }
    }


    protected void empSwitchEditar(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1-Editar Estadias\n" +
                "2-Editar Reservas\n" +
                "3- Editar Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.editSwitchEstadias(hotel);
                break;
            case 2:
                this.editSwitchReservas(hotel);
                break;
            case 3:
                this.editSwitchVisitantes(hotel);
                break;

        }
    }

    protected void empSwitchEliminar(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "1-Eliminar Estadias\n" +
                "2-Eliminar Reservas\n" +
                "3- Eliminar Visitantes ");

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
        }
    }

    protected void empSwitchCrear(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "1-Crear Estadias\n" +
                "2-Crear Reservas\n" +
                "3- Crear Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                // Sub-menu
               //hotel.agregarEstadia();
                break;
            case 2:
                //hotel.agregarReserva();
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y luego poder Crear
                break;
        }
    }


    protected void   editSwitchEstadias(Hotel hotel){

        Scanner teclado = new Scanner(System.in);
        ///Pedir El empleado por nroLegajo
        /// Mostrar mostrar Empleado

        System.out.println("1- Editar el visitante de la  Estadia \n" +
                "2- Editar la llegada a la  Estadia\n" +
                "3-Editar la salida de la  Estadia\n" +
                "4-Editar estado de la  Estadia\n" +
                "5- Editar el ID de la Estadia\n" +
                "6- Editar estado del Check in de la estadia\n" +
                "7- Editar estado del check out de la Estadia\n" +
                "8- Editar el coste de la Estadia\n");

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
                break;
            case 5:
                /// Solicitar y asignar
                break;
            case 6:
                /// Solicitar y asignar
                break;
            case 7:
                /// Solicitar y asignar
                break;
            case 8:
                /// Solicitar y asignar
                break;
        }

    }

    protected void   editSwitchReservas(Hotel hotel){

        Scanner teclado = new Scanner(System.in);
        ///Pedir El empleado por nroLegajo
        /// Mostrar mostrar Empleado

        System.out.println("1- Editar el visitante de la  Reserva \n" +
                "2- Editar la llegada a la  Reserva\n" +
                "3-Editar la salida de la  Reserva\n" +
                "4-Editar estado de la  Reserva\n" +
                "5- Editar el ID de la Reserva");

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
                break;
            case 5:
                /// Solicitar y asignar
                break;

        }

    }

    protected void  editSwitchVisitantes(Hotel hotel){ Scanner teclado = new Scanner(System.in);
        ///Pedir El empleado por nroLegajo
        /// Mostrar mostrar Empleado

        System.out.println("1- Editar el DNI del  visitante  \n" +
                "2- Editar el Origen del visitante \n" +
                "3-Editar el domicilio de origen del visitante \n" +
                "4-Editar estado del  visitante \n" +
                "5- Editar el Gasto del visitante" +
                "6- Editar el nro de Habitacion del visitante" +
                "7- Editar el token del visitante" +
                "8- Editar la Presencia del visitante");

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
                break;
            case 5:
                /// Solicitar y asignar
                break;

        }

    }

    ///=======================================================================================================0

    public void crearReserva(){

    }
}


