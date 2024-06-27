package Clases;
import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarHabitacion;
import Interfaces.IAdministrarReserva;
import Interfaces.IAdministrarVisitante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Empleado extends Usuario implements IAdministrarVisitante, IAdministrarEstadia{
    private int nroLegajo;
    private boolean estado;


    public Empleado(String nombre, String apellido, String usuario, String clave, int nroLegajo) {
        super(nombre, apellido, usuario, clave);
        this.nroLegajo = nroLegajo;
        this.estado = isEstado();
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
        int opcion;
        System.out.printf("<<<<<<<<<<<<<<<<<<<<<<<<<<Menu de Empleado>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        do {
            System.out.println("1- Habitaciones  \n" +
                    "2- Check in \n" +
                    "3- Check out \n" +
                    "4- Estadia \n" +
                    "5- Reservas \n" +
                    "6- Visitantes \n" +
                    "Presione ESC para salir....");
            opcion = teclado.nextInt();


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
                default:
                    break;


            }
        }while(opcion!=27);
    }


    protected void empSwitchHabitaciones(Hotel hotel) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do{

        System.out.println("1- Visualizar Habitaciones disponibles \n" +
                "2- Visualizar habitacion en particular\n" +
                "3- Visualizar todas las habitaciones" +
                "Presione ESC para salir....");

       opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                hotel.mostrarHabitacionesDisp();
                break;
            case 2:
              hotel.mostrarHabitacionPart();
                break;
            case 3:
                hotel.mostrarHabitaciones();
            default:
                break;
        }
        }while(opcion!=27);
    }


    protected void empSwitchEstadia(Hotel hotel) {
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{

        System.out.println("1-Editar Estadias\n" +
                "2- Crear Estadia\n" +
                "3- Vizualizar Estadia" +
                "4- Eliminar Estadia " +
                "Presione ESC para salir....");

        opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.editSwitchEstadias(hotel);
                break;
            case 2:
                crearEstadia(hotel);
                break;
            case 3:
                this.editSwitchVisitantes(hotel);
                break;
            default:
                break;

        }
        }while(opcion!=27);
    }

    protected void empSwitchReserva(Hotel hotel) {
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{
        System.out.println(
                "1- Crear Reserva\n" +
                "2-Editar Reservas\n" +
                        "3- Visualizar Reserva" +
                "4- Eliminar Reserva " +
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
            default:
                break;
        }
        }while(opcion!=27);
    }

    protected void empSwitchVisitante(Hotel hotel) {
        Visitante v = null;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(
                    "1- Crear Visitante\n" +
                            "2- Visualizar visitantes\n" +
                            "3- Editar Visitante\n" +
                            "4- Eliminar Visitante\n" +
                            "Presione Esc para salir...\n"
            );

            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {
                case 1:
                    v = crearVisitante(hotel);
                    if (v != null) {
                        darAlta(hotel, v);
                    } else {
                        System.out.println("NULL");
                    }

                    break;
                case 2:
                    System.out.println("Mostrando visitantes: ");
                    //hotel.getVisitantes();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    System.out.println("Ingrese el dni del visitante a dar de baja: ");
                    int dni = teclado.nextInt();
                    darBaja(hotel, dni);
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcion != 27);

        teclado.close();
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
                "8- Editar el coste de la Estadia\n" +
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
                break;
        }
        }while(opcion!=27);

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
                "5- Editar el ID de la Reserva" +
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
                break;

        }
        }while(opcion!=27);

    }

    protected void  editSwitchVisitantes(Hotel hotel){ Scanner teclado = new Scanner(System.in);
        ///Pedir El empleado por nroLegajo
        /// Mostrar mostrar Empleado
        int opcion;


        do{


        System.out.println("1- Editar el DNI del  visitante  \n" +
                "2- Editar el Origen del visitante \n" +
                "3-Editar el domicilio de origen del visitante \n" +
                "4-Editar estado del  visitante \n" +
                "5- Editar el Gasto del visitante" +
                "6- Editar el nro de Habitacion del visitante" +
                "7- Editar el token del visitante" +
                "8- Editar la Presencia del visitante" +
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
                break;

        }
        }while(opcion!=27);

    }

    ///=======================================================================================================0


    public Reserva crearReserva(Hotel hotel, Visitante visitante, Habitacion habitacion, Date llegada, Date salida){
        Visitante v = hotel.buscarVisitante(visitante.getDni());
        if(visitante == null){
            //darAlta(); interfaz administrarVisitante

        }


        return null;
    }


    @Override
    public void crearEstadia(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de nueva estadía:");

        try {
            System.out.print("Ingrese el DNI del visitante: ");
            int dni = scanner.nextInt();
            scanner.nextLine();

            Visitante visitante = hotel.buscarVisitante(dni);
            if (visitante == null) {
                System.out.println("El visitante con DNI " + dni + " no está registrado.");;
            }

            hotel.mostrarHabitacionesDisp();
            System.out.print("Ingrese el número de habitación: ");
            int numeroHabitacion = scanner.nextInt();
            scanner.nextLine();

            Habitacion habitacion = hotel.buscarNumeroHabitacion(numeroHabitacion);
            if (habitacion == null) {
                System.out.println("La habitación número " + numeroHabitacion + " no está disponible.");

            }

            Date fechaLlegada = ingresarFecha("Fecha de llegada (yyyy-MM-dd): ", scanner);
            Date fechaSalida = ingresarFecha("Fecha de salida (yyyy-MM-dd): ", scanner);
            if (fechaLlegada == null || fechaSalida == null || fechaLlegada.after(fechaSalida)) {
                System.out.println("Las fechas ingresadas no son válidas.");

            }

            Estadia estadia = new Estadia(visitante, habitacion, fechaLlegada, fechaSalida);
            hotel.getEstadias().add(estadia);

            System.out.println("Estadía creada y registrada correctamente.");

        } catch (Exception e) {
            System.out.println("Error al ingresar datos para la estadía: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private Date ingresarFecha(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        String fechaStr = scanner.nextLine();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false); // Para que sea estricto en el formato
            return sdf.parse(fechaStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Ingrese la fecha nuevamente.");

        }
        return null;
    }



    @Override
    public void editarEstadia(Hotel hotel, int id) {
        Scanner scanner = new Scanner(System.in);

        hotel.mostrarEstadias();

        System.out.print("Ingrese el ID de la estadía que desea editar: ");
        int idEstadia = scanner.nextInt();
        scanner.nextLine();


        Estadia estadia = hotel.encontrarEstadia(idEstadia);
        if (estadia == null) {
            System.out.println("No se encontró ninguna estadía con el ID ingresado.");
           return;
        }


        System.out.println("Detalles actuales de la estadía:");
        System.out.println(estadia);


        System.out.println("Ingrese las nuevas fechas de llegada y salida (yyyy-MM-dd). Deje en blanco para no modificar.");

        Date nuevaFechaLlegada = ingresarFecha("Nueva fecha de llegada: ", scanner);
        Date nuevaFechaSalida = ingresarFecha("Nueva fecha de salida: ", scanner);


        System.out.println("Desea cambiar la habitación asignada? (S/N)");
        String opcionCambiarHabitacion = scanner.nextLine().trim();
        if (opcionCambiarHabitacion.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el numero de habitacion a cambiar: ");
            hotel.mostrarHabitaciones();
            scanner.nextInt();
            scanner.nextLine();
        }

        if (nuevaFechaLlegada != null) {
            estadia.setLlegada(nuevaFechaLlegada);
        }
        if (nuevaFechaSalida != null) {
            estadia.setSalida(nuevaFechaSalida);
        }


        System.out.println("Estadía editada correctamente.");
    }

    @Override
    public void listarEstadias(Hotel hotel) {
        hotel.mostrarEstadias();
    }

    @Override
    public void buscarEstadia(Hotel hotel, int id) {
        Estadia e = hotel.encontrarEstadia(id);
    }
}


