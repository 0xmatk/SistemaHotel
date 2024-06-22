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



    public Set<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public Set<Estadia> getEstadias() {
        return estadias;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void mostrarEmpleados(){
        for(Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
    public void eliminarEmpleado(Empleado empleado){
        this.empleados.remove(empleado);
    }

}
