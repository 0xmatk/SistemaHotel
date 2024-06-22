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


        System.out.println("1- Habitaciones  \n" +
                "2- Check in \n" +
                "3- Check out \n" +
                "4- Estadia \n" +
                "5- Reservas \n" +
                "6- Visitantes \n");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:

                this.empSwitchHabitaciones(hotel);
                break;
            case 2:
                ///Dar check in
                break;
            case 3:
                ///Dar Check out
                break;

            case 4:
                this.empSwitchEstadia(hotel);
                break;

            case 5:
                this.empSwitchReserva(hotel);
                break;
            case 6:
                this.empSwitchVisitante(hotel);


        }
    }


    protected void empSwitchHabitaciones(Hotel hotel) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1- Visualizar Habitaciones disponibles \n" +
                "2- Visualizar habitacion en particular\n" +
                "3- Visualizar todas las habitaciones");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///hotel.mostrarHabitacionesDisp();
                break;
            case 2:
              ///hotel.mostrarHabitacionPart();
                break;
            case 3:
                ///hotel.mostrarHabitaciones();
        }
    }


    protected void empSwitchEstadia(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1-Editar Estadias\n" +
                "2- Crear Estadia\n" +
                "3- Vizualizar Estadia" +
                "3- Eliminar Estadia ");

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

    protected void empSwitchReserva(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "1- Crear Reserva\n" +
                "2-Editar Reservas\n" +
                        "3- Visualizar Reserva" +
                "3- Eliminar Reserva ");

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

    protected void empSwitchVisitante(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "1-Crear Visitante\n" +
                "2-Visualizar visitante\n" +
                "3- Editar Visitante " +
                        "4- Eliminar Visitante");

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


    public Reserva crearReserva(Hotel hotel, Visitante visitante, Habitacion habitacion, Date llegada, Date salida){
        Visitante v = hotel.buscarVisitante(visitante.getDni());
        if(visitante == null){
            //darAlta(); interfaz administrarVisitante

        }


        return null;
    }


}


