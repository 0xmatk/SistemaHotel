package Interfaces;

import Clases.Estadia;
import Clases.Habitacion;
import Clases.Hotel;
import Clases.Visitante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public interface IAdministrarEstadia {

    public default void crearEstadia(Hotel hotel) {
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

            Date fechaLlegada = ingresarFecha("Fecha de llegada (dd-mm-yyyy): ", scanner);
            Date fechaSalida = ingresarFecha("Fecha de salida (dd-mm-yyyy): ", scanner);
            if (fechaLlegada == null || fechaSalida == null || fechaLlegada.after(fechaSalida)) {
                System.out.println("Las fechas ingresadas no son válidas.");

            }

            Estadia estadia = new Estadia(visitante, habitacion, fechaLlegada, fechaSalida);
            hotel.agregarEstadia(estadia);

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
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
            sdf.setLenient(false);
            return sdf.parse(fechaStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Ingrese la fecha nuevamente.");

        }
        return null;
    }



    public default void editarEstadia(Hotel hotel) {
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


        System.out.println("Ingrese las nuevas fechas de llegada y salida (dd-mm-yyyy). Deje en blanco para no modificar.");

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


    public default void listarEstadias(Hotel hotel) {
        hotel.mostrarEstadias();
    }


    public default void buscarEstadia(Hotel hotel, int id) {
        Estadia e = hotel.encontrarEstadia(id);
    }


    public default void darCheckIn(Hotel hotel, int id) {
        Estadia estadiaAEncontrar = hotel.encontrarEstadia(id);
        if (estadiaAEncontrar == null) {
            System.out.println("Su id es incorrecto");
        }else{
            if (estadiaAEncontrar != null){
                estadiaAEncontrar.setCheckIn(true);
            }
        }

    }


    public default void darCheckOut(Hotel hotel, int id) {
        Estadia estadiaAEncontrar = hotel.encontrarEstadia(id);
        if (estadiaAEncontrar == null) {
            System.out.println("Su id es incorrecto");
        }else{
            if (estadiaAEncontrar != null){
                estadiaAEncontrar.setCheckOut(true);
            }
        }

    }



}
