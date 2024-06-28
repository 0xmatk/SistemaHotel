package Clases;
import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarHabitacion;
import Interfaces.IAdministrarReserva;
import Interfaces.IAdministrarVisitante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Empleado extends Usuario implements IAdministrarVisitante, IAdministrarEstadia, IAdministrarReserva {
    private int nroLegajo;
    private boolean estado;

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String usuario, String clave, int nroLegajo) {
        super(nombre, apellido, usuario, clave);
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
        int opcion;
        System.out.printf("<<<<<<<<<<<<<<<<<<<<<<<<<<Menu de Empleado>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

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
                    System.out.println("Ingrese el id de la reserva del hotel");
                    int nuevoid = teclado.nextInt();
                    teclado.nextLine();
                    darCheckIn(hotel,nuevoid);
                    break;
                case 3:
                    System.out.println("Ingrese el id de la reserva del hotel");
                    nuevoid = teclado.nextInt();
                    teclado.nextLine();
                    darCheckOut(hotel,nuevoid);
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
                "3- Vizualizar Estadia\n" +
                "4- Eliminar Estadia\n " +
                "Presione ESC para salir....\n");

        opcion = Integer.parseInt(teclado.nextLine().trim());


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
                        "3- Visualizar Reserva\n" +
                "4- Eliminar Reserva\n " +
                        "Presione ESC para salir....\n");

         opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                crearReserva(hotel);
          break;
            case 2:
                this.editSwitchReservas(hotel);
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
        boolean continuar = true;
        int opcion;

        do {
            System.out.println(
                    "1- Crear Visitante\n" +
                            "2- Visualizar visitantes\n" +
                            "3- Editar Visitante\n" +
                            "4- Eliminar Visitante\n" +
                            "5 - Salir\n"
            );


                opcion = Integer.parseInt(teclado.nextLine().trim());
                System.out.println(opcion);

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
                        hotel.mostrarVisitantes();
                        break;
                    case 3:
                        // Lógica para editar visitante
                        break;
                    case 4:
                        System.out.println("Ingrese el dni del visitante a dar de baja: ");
                        if (teclado.hasNextInt()) {
                            int dni = teclado.nextInt();
                            teclado.nextLine();
                            darBaja(hotel, dni);
                        } else {
                            System.out.println("Entrada no válida. Por favor, ingrese un número.");
                            teclado.nextLine();
                        }
                        break;
                    case 5:

                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
        } while (continuar);

        teclado.close();

    }




    protected void  editSwitchEstadias(Hotel hotel){
        int opcion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el id de la estadia que quiere editar: ");

        int id = teclado.nextInt();
        teclado.nextLine();
        Estadia e = hotel.encontrarEstadia(id);
        if(e == null){
            System.out.println("Estadia no encontrada");
        }else {


            do {

                System.out.println("1- Editar el visitante de la  Estadia \n" +
                        "2- Editar la llegada a la  Estadia\n" +
                        "3-Editar la salida de la  Estadia\n" +
                        "4-Editar estado de la  Estadia\n" +
                        "5- Editar el ID de la Estadia\n" +
                        "6- Editar estado del Check in de la estadia\n" +
                        "7- Editar estado del check out de la Estadia\n" +
                        "8- Editar el coste de la Estadia\n" +
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
            } while (opcion != 27);
        }
    }

    protected void  editSwitchReservas(Hotel hotel){
        int opcion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el id reserva que quiere editar: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        Reserva r = hotel.buscarReservaPorID(id);

        if (r == null) {
            System.out.println("ID de reserva no encontrado");
        }else {

            do {

                System.out.println("1- Editar el visitante de la  Reserva \n" +
                        "2- Editar la llegada a la  Reserva\n" +
                        "3-Editar la salida de la  Reserva\n" +
                        "4-Editar estado de la  Reserva\n" +
                        "5- Editar el ID de la Reserva" +
                        "Presione ESC para salir....");
                opcion = teclado.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el dni del visitante a asignar: ");
                        int dni = teclado.nextInt();
                        teclado.nextLine();
                        Visitante vist = hotel.buscarVisitante(id);
                        r.setVisitante(vist);
                        break;
                    case 2:
                        r.setLlegada(pedirFecha("llegada", teclado));
                        break;
                    case 3:
                        r.setSalida(pedirFecha("salida", teclado));
                        break;
                    case 4:
                        if(r.estado == true){
                            r.estado= false;
                        }else{
                            r.estado=true;
                        }
                            break;
                    case 5:
                        /// Solicitar y asignar
                        break;
                    default:
                        break;

                }
            } while (opcion != 27);
        }
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
    ///=======================================================================================================0



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


