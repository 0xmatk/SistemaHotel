package Clases;

import Interfaces.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Administrador extends Usuario implements IAdministrarHabitacion, IAdministrarVisitante, IAltaBajaModificacion, IAdministrarEstadia, IAdministrarReserva {


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
                mostrarHabitaciones(hotel);
                break;
            case 3:
                hotel.mostrarEstadias();
                break;
            case 4:
                hotel.mostrarReservas();
                break;
            case 5:
                mostrarVisitantes(hotel);
                break;
            default:
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
                eliminarHabitacion(hotel);
                break;
            case 2:
                Scanner nroLegajo = new Scanner(System.in);
                System.out.println("Ingrese el nro de legajo del empleado: ");
                int nro = Integer.parseInt(nroLegajo.nextLine().trim());
                darBajaEmpleado(hotel, nro);
                break;
            case 3:
                Scanner id = new Scanner(System.in);
                System.out.println("Ingrese el id de la Estadia a borrar: ");
                int idEstadia = Integer.parseInt(id.nextLine().trim());
                hotel.eliminarEstadia(idEstadia);
                break;
            case 4:
               Scanner id2 = new Scanner(System.in);
               System.out.println("Ingrese el id de la Reserva a borrar: ");
               int idReserva = Integer.parseInt(id2.nextLine().trim());
               hotel.eliminarReserva(idReserva);
                break;
            case 5:
                Scanner dni = new Scanner(System.in);
                System.out.println("Ingrese el id de la Visitante a borrar: ");
                int idVisitante = Integer.parseInt(dni.nextLine().trim());
                darBaja(hotel, idVisitante);
                break;
            default:
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
                Scanner scanner = new Scanner(System.in);
                System.out.println("===== Crear Empleado =====");

                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine().trim();

                System.out.print("Ingrese el apellido: ");
                String apellido = scanner.nextLine().trim();

                System.out.print("Ingrese el nro de legajo: ");
                int nroLegajo = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Ingrese el usuario: ");
                String usuario = scanner.nextLine().trim();

                System.out.print("Ingrese la clave: ");
                String clave = scanner.nextLine().trim();

                crearEmpleado(hotel, nombre, apellido, nroLegajo, usuario, clave);
                break;
            case 3:
                crearEstadia(hotel);
                break;
            case 4:
                crearReserva(hotel);
                break;
            case 5:
                crearVisitante(hotel);
                break;
            default:
                ///nada
                break;

        }}while (opcion != 27);

    }


    protected void editSwitchHabitaciones(Hotel hotel) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de habitacion a editar: ");
        int nro = Integer.parseInt(teclado.nextLine().trim());
        Habitacion h = buscarNumeroHabitacion(hotel, nro);

        if(h == null){
            System.out.println("No se encuentra la habitacion.");
        }

        do{

        System.out.println("1- Editar tipo de la habitacion \n" +
                "2- Editar numero de la habitacion\n" +
                "3-Editar coste de la habitacion\n" +
                "4-Editar diponibilidad\n \n" +
                "Presione ESC para salir....\n");

         opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                editarHabitacion(hotel,nro);
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

        System.out.println("Ingrese el nro de legajo del Empleado: \n");
        int nro = Integer.parseInt(teclado.nextLine().trim());
        Empleado e = buscarEmpleado(hotel, nro);
        System.out.println("Empleado encontrado: \n");
        System.out.println(e);

        do{

     System.out.println("1- Editar Nombre del Empleado \n" +
             "2- Editar apellido del Empleado\n" +
             "3-Editar nro Legajo del Empleado\n" +
             "4-Editar estado del Empleado\n \n" +
             "Presione ESC para salir....");

      opcion = teclado.nextInt();


     switch (opcion) {
         case 1:
             Scanner t = new Scanner(System.in);
             System.out.println("Ingrese el nuevo nombre: ");
             String nombreModificar = t.nextLine();
             e.setNombre(nombreModificar);

             break;
         case 2:
             Scanner t1 = new Scanner(System.in);
             System.out.println("Ingrese el nuevo apellido: ");
             String apellidoModificar = t1.nextLine();
             e.setApellido(apellidoModificar);
             break;
         case 3:
            Scanner t2 = new Scanner(System.in);
            System.out.println("Ingrese el nuevo legajo: ");
            int legajoModificar = Integer.parseInt(t2.nextLine().trim());
            e.setNroLegajo(legajoModificar);
            break;
         case 4:
             darBajaEmpleado(hotel, nro);
             break;
         default:
             break;

     }
        }while (opcion != 27);

 }

    protected void  editSwitchEstadias(Hotel hotel){
        int opcion;
        Scanner teclado = new Scanner(System.in);


        do{

     System.out.println("1- Editar el visitante de la  Estadia \n" +
             "2- Editar la llegada a la  Estadia\n" +
             "3- Editar la salida de la  Estadia\n" +
             "4- Editar estado de la  Estadia\n" +
             "5- Editar estado del Check in de la estadia\n" +
             "6- Editar estado del check out de la Estadia\n" +
             "7- Editar el coste de la Estadia \n \n " +
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

    protected void  editSwitchReservas(Hotel hotel){
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

        System.out.println("Ingrese el dni del estadia: ");
        int dni = Integer.parseInt(teclado.nextLine().trim());
        Visitante v = hotel.buscarVisitante(dni);


        do{

      System.out.println("1- Cambios de habitacion / Fechas " +
              "2- Editar el Gasto del visitante\n" +
              "3- Editar el nro de Habitacion del visitante\n" +
              "Presione ESC para salir....");

       opcion = teclado.nextInt();


      switch (opcion) {
          case 1:
              editarEstadia(hotel);
              break;
          case 2:
              Scanner t = new Scanner(System.in);
              System.out.println("Ingrese el gasto: ");
              float gasto = Integer.parseInt(t.nextLine().trim());
              v.setGastos(gasto);

              break;
          case 3:
              Scanner t1 = new Scanner(System.in);
              System.out.println("Ingrese el nro de habitacion: ");
              int nro = Integer.parseInt(t1.nextLine().trim());
             Habitacion h =  hotel.buscarNumeroHabitacion(nro);
             if(h == null){
                 System.out.println("Nro no encontrado");
             }else{
                 v.setNroHabitacion(nro);
             }
              break;
          default:

              break;

      }
        }while (opcion != 27);

  }


    private  Date pedirFecha(String tipoFecha, Scanner scanner) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            try {
                System.out.print("Ingrese la fecha de " + tipoFecha + " (yyyy-MM-dd): ");
                String fechaString = scanner.nextLine();
                Date fecha = dateFormat.parse(fechaString);
                return fecha;
            } catch (Exception e) {
                System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
            }
        }

    }


    @Override
    public void crearReserva(Hotel hotel){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dni del visitante");
        int dni = scanner.nextInt();
        scanner.nextLine();
        Visitante nuevo= hotel.buscarVisitante(dni);

        Date llegada = pedirFecha("llegada", scanner);
        Date salida = pedirFecha("salida", scanner);
        Reserva Aux= new Reserva(nuevo,null,llegada,salida);

        for(Habitacion aux: hotel.getHabitaciones()){
            if(aux.getFechaLejana().before(Aux.llegada)){
                hotel.agregarReserva(Aux);
                aux.setFechaLejana(Aux.salida);
            }else{
                if(aux.getFechaProxima().after(Aux.salida)){
                    hotel.agregarReserva(Aux);
                    aux.setFechaProxima(Aux.llegada);
                }
            }

        }

        scanner.close();
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



}







