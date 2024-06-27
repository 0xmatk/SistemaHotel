package Clases;

import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarHabitacion;
import Interfaces.IAdministrarReserva;
import Interfaces.IAltaBajaModificacion;

import java.util.Date;
import java.util.Scanner;


public class Administrador extends Usuario implements IAdministrarHabitacion {


    public Administrador() {
    }

    public Administrador(String nombre, String apellido, String usuario, String clave) {
        super(nombre, apellido, usuario, clave);
    }

    ///=================================================================================================================
    public void adminSwitch(Hotel hotel) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int opcion;

        System.out.printf("<<<<<<<<<<<<<<<<<<<<<<<<<<Menu de Administrador>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        ///Ver si hay que agregar alguna opcion que pueda hacer el Admin
        do {

            System.out.println("1- Visualizar informacion del hotel \n" +
                    "2- Editar informacion del hotel\n" +
                    "3-Eliminar informacion del hotel\n" +
                    "4-Crear informacion del hotel\n \n" +
                    "Presione ESC para salir....");

             opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    this.adminSwitchVisualizar(hotel);
                    break;

                case 2:
                    this.adminSwitchEditar(hotel);
                    break;

                case 3:
                    this.adminSwitchEliminar(hotel);
                    break;
                case 4:
                    this.adminSwitchCrear(hotel);
                    break;
                default:
                    break;
            }

        }while (opcion != 27);
    }

    protected void adminSwitchVisualizar(Hotel hotel) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do{
        System.out.println("1- Visualizar Habitaciones del hotel \n" +
                "2- Visualizar empleados\n" +
                "3-visualizar Estadias\n" +
                "4-Visualizar Reservas\n" +
                "5- Visualizar Visitantes\n \n" +
                "Presione ESC para salir....\n ");

         opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Visualizando Habitaciones del hotel");
               hotel.mostrarHabitaciones();
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
            default:
                ///nada
                break;
        }
        }while (opcion != 27);
    }


    protected void adminSwitchEditar(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{

        System.out.println("1- Editar Habitaciones del hotel \n" +
                "2- Editar empleados\n" +
                "3-Editar Estadias\n" +
                "4-Editar Reservas\n" +
                "5- Editar Visitantes\n \n" +
                "Presione ESC para salir....\n");

         opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.editSwitchHabitaciones(hotel);
                break;
            case 2:
                this.editSwitchEmpleados(hotel);
                break;
            case 3:
                this.editSwitchEstadias(hotel);
                break;
            case 4:
                this.editSwitchReservas(hotel);
                break;
            case 5:
                this.editSwitchVisitantes(hotel);
                break;
            default:
                ///nada
                break;
        }
        }while (opcion != 27);

    }

    protected void adminSwitchEliminar(Hotel hotel) {
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{
        System.out.println("1- Eliminar Habitaciones del hotel \n" +
                "2- Eliminar empleados\n" +
                "3-Eliminar Estadias\n" +
                "4-Eliminar Reservas\n" +
                "5- Eliminar Visitantes\n \n " +
                "Presione ESC para salir....");

        opcion = teclado.nextInt();

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
            default:
                ///nada
                break;
        }
        }while (opcion != 27);
    }

    protected void adminSwitchCrear(Hotel hotel) {
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{
        System.out.println("1- Crear Habitaciones del hotel \n" +
                "2- Crear empleados\n" +
                "3-Crear Estadias\n" +
                "4-Crear Reservas\n" +
                "5- Crear Visitantes\n \n" +
                "Presione ESC para salir....\n");

        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                crearHabitacion(hotel);

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
            default:
                ///nada
                break;

        }}while (opcion != 27);

    }


    protected void editSwitchHabitaciones(Hotel hotel) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ///Pedir numero de habitacion y asignarlo
        /// Mostrar Habitacion

        do{

        System.out.println("1- Editar tipo de la habitacion \n" +
                "2- Editar numero de la habitacion\n" +
                "3-Editar coste de la habitacion\n" +
                "4-Editar diponibilidad\n \n" +
                "Presione ESC para salir....\n");

         opcion = teclado.nextInt();


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
            default:
                ///nada
                break;
        }
        }while (opcion != 27);


    }

    protected void   editSwitchEmpleados(Hotel hotel){
        int opcion;
        Scanner teclado = new Scanner(System.in);
     ///Pedir El empleado por nroLegajo
     /// Mostrar mostrar Empleado

        do{

     System.out.println("1- Editar Nombre del Empleado \n" +
             "2- Editar apellido del Empleado\n" +
             "3-Editar nro Legajo del Empleado\n" +
             "4-Editar estado del Empleado\n \n" +
             "Presione ESC para salir....");

      opcion = teclado.nextInt();


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
             ///Solicitar  y
             break;
         default:
             ///nada
             break;

     }
        }while (opcion != 27);

 }

    protected void   editSwitchEstadias(Hotel hotel){
        int opcion;
        Scanner teclado = new Scanner(System.in);
     ///Pedir El empleado por nroLegajo
     /// Mostrar mostrar Empleado

        do{

     System.out.println("1- Editar el visitante de la  Estadia \n" +
             "2- Editar la llegada a la  Estadia\n" +
             "3-Editar la salida de la  Estadia\n" +
             "4-Editar estado de la  Estadia\n" +
             "5- Editar el ID de la Estadia\n" +
             "6- Editar estado del Check in de la estadia\n" +
             "7- Editar estado del check out de la Estadia\n" +
             "8- Editar el coste de la Estadia \n \n " +
             "Presione ESC para salir....");

      opcion = teclado.nextInt();


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
         default:
             ///nada
             break;
     }
        }while (opcion != 27);

 }

    protected void   editSwitchReservas(Hotel hotel){
        int opcion;
        Scanner teclado = new Scanner(System.in);
     ///Pedir El empleado por nroLegajo
     /// Mostrar mostrar Empleado
        do{

     System.out.println("1- Editar el visitante de la  Reserva \n" +
             "2- Editar la llegada a la  Reserva\n" +
             "3-Editar la salida de la  Reserva\n" +
             "4-Editar estado de la  Reserva\n" +
             "5- Editar el ID de la Reserva\n \n" +
             "Presione ESC para salir....\n");

     opcion = teclado.nextInt();


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
         default:
             ///nada
             break;

     }
        }while (opcion != 27);

 }

    protected void  editSwitchVisitantes(Hotel hotel){ Scanner teclado = new Scanner(System.in);
        int opcion;

        ///Pedir El empleado por nroLegajo
      /// Mostrar mostrar Empleado
        do{

      System.out.println("1- Editar el DNI del  visitante  \n" +
              "2- Editar el Origen del visitante \n" +
              "3-Editar el domicilio de origen del visitante \n" +
              "4-Editar estado del  visitante \n" +
              "5- Editar el Gasto del visitante\n" +
              "6- Editar el nro de Habitacion del visitante\n" +
              "7- Editar la Presencia del visitante\n \n" +
              "Presione ESC para salir....");

       opcion = teclado.nextInt();


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
          default:
              ///nada
              break;

      }
        }while (opcion != 27);

  }
}



///===================================================================================================================




///===================================================================================================================

