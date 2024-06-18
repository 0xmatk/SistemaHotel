package Clases;

import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Hotel {
    private Set<Habitacion> habitaciones;
    private Set<Empleado> empleados;
    private Set<Estadia> estadias;
    private Set<Reserva> reservas;


    public Hotel() {
        this.habitaciones = new LinkedHashSet<>();
        this.reservas = new LinkedHashSet<>();
        this.estadias = new LinkedHashSet<>();
        this.empleados = new LinkedHashSet<>();
    }



    public void agregarReserva(Reserva reserva) {
        for(Reserva r : reservas) {
            if (reserva.getLlegada().equals(r.getLlegada()) && reserva.getSalida().equals(r.getSalida())) {
                System.out.println("Error: La nueva reserva es igual a una reserva existente.");
                return;
            }
        }
        reserva.habitacion.setDisponible(false);
        reservas.add(reserva);

    }

    public void agregarEstadia(Estadia estadia) {
        boolean flag = reservas.add(estadia);

        if(flag){
            System.out.println("Se agrego la estadia.");
        }else{
            System.out.println("No se agrego la estadia. La estadia ya existe. ");
        }
    }

    public void mostrarEstadias(){
        for(Estadia estadia : estadias){
            System.out.println(estadia);
        }
    }


    public void mostrarReservas(){
        for(Reserva reserva: reservas){
            System.out.println(reserva);
        }
    }

    public Reserva encontrarReserva(int id){
        for(Reserva r : reservas){
            if(r.getID() == id){
                return r;
            }

        }
        return null;
    }

    public void eliminarReserva(int id){
        for(Reserva r : reservas){
            if(r.getID() == id){
                r.setEstado(false);
            }
        }
    }


    public Estadia encontrarEstadia(int id){
        for(Estadia estadia : estadias){
            if(estadia.getID() == id){
                return estadia;
            }
        }

        return null;
    }

    public void eliminarEstadia(int id){
        for(Estadia estadia : estadias){
            if(estadia.getID() == id){
                estadia.setEstado(false);
            }
        }
    }

    public void mostrarHabitaciones(){
        for(Habitacion habitacion : habitaciones){
            System.out.println(habitacion);
        }
    }

    public void eliminarHabitacion(int numero){
        for(Habitacion habitacion : habitaciones){
            if(habitacion.getNumero() == numero){
                this.habitaciones.remove(habitacion);
            }else{
                System.out.println("La habitacion no existe");
            }

        }
    }

    public Habitacion buscarNumeroHabitacion(int numero){
        for(Habitacion habitacion : habitaciones){
            if(habitacion.getNumero() == numero){
                return habitacion;
            }
        }
        return null;
    }

    public void editarHabitacion(int numero){
        Habitacion habitacion = buscarNumeroHabitacion(numero);

        if(habitacion != null){
            while (true) {
                System.out.println("Editando la habitación " + numero);
                System.out.println("Menú:");
                System.out.println("1. Establecer Tipo");
                System.out.println("2. Establecer Coste");
                System.out.println("3. Establecer Disponibilidad");
                System.out.println("4. Mostrar Información de la Habitación");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");

                Scanner teclado = new Scanner(System.in);
                int opcion =  teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el tipo de habitación: ");
                        String tipo =  teclado.nextLine();
                        habitacion.setTipo(tipo);
                        break;
                    case 2:
                        System.out.print("Introduce el coste de la habitación: ");
                        int coste =  teclado.nextInt();
                        habitacion.setCoste(coste);
                        break;
                    case 3:
                        System.out.print("¿Está disponible la habitación? (true/false): ");
                        boolean disponible =  teclado.nextBoolean();
                        habitacion.setDisponible(disponible);
                        break;
                    case 4:
                        System.out.println("Información de la Habitación:");
                        System.out.println(habitacion);
                        break;
                    case 5:
                        System.out.println("Saliendo de la edición de la habitación...");
                        return;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        }
    }

    public void mostrarEmpleados(){
        for(Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }










}
