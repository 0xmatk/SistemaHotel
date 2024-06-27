package Clases;

import Genericos.SetGenerico;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import Enum.EstadoHabitacion;

public class Hotel {
    private SetGenerico<Habitacion> habitaciones;
    private SetGenerico<Empleado> empleados;
    private SetGenerico<Estadia> estadias;
    private SetGenerico<Reserva> reservas;
    private SetGenerico<Visitante> visitantes;


    public Hotel() {
        this.habitaciones = new SetGenerico<>();
        this.reservas = new SetGenerico<>();;
        this.estadias = new SetGenerico<>();
        this.empleados = new SetGenerico<>();
        this.visitantes = new SetGenerico<>();
    }



    public void crearReserva(Reserva reserva) {
        for(Reserva r : getReservas()) {
            if (reserva.getLlegada().equals(r.getLlegada()) && reserva.getSalida().equals(r.getSalida())) {
                System.out.println("Error: La nueva reserva es igual a una reserva existente.");
                return;
            }
        }
        reserva.habitacion.setEstado(EstadoHabitacion.NO_DISPONIBLE);
        reservas.add(reserva);

    }

    public void agregarEstadia(Estadia estadia) {
        getEstadias().add(estadia);
    }

    public void mostrarEstadias(){
        for(Estadia estadia : getEstadias()){
            System.out.println(estadia);
        }
    }


    public void mostrarReservas(){
        for(Reserva reserva: getReservas()){
            System.out.println(reserva);
        }
    }

    public Reserva encontrarReserva(int id){
        for(Reserva r : getReservas()){
            if(r.getID() == id){
                return r;
            }

        }
        return null;
    }

    public void eliminarReserva(int id){
       Reserva r = encontrarReserva(id);
       if(r != null){
           r.setEstado(false);
       }else{
           System.out.println("No se encontro el reserva.");
       }
    }


    public Estadia encontrarEstadia(int id){
        for(Estadia estadia : getEstadias()){
            if(estadia.getID() == id){
                return estadia;
            }
        }

        return null;
    }

    public void eliminarEstadia(int id){
        for(Estadia estadia : getEstadias()){
            if(estadia.getID() == id){
                estadia.setEstado(false);
            }
        }
    }

    public void mostrarEstadiasPorDNI(int dni){
        for(Estadia estadia : getEstadias()){
            if(estadia.visitante.getDni() == dni){
                System.out.println(estadia);
            }else{
                System.out.println("No tiene estadias.");
            }
        }
    }

    public void mostrarHabitaciones(){
        for(Habitacion habitacion : this.habitaciones){
            System.out.println(habitacion);
        }
    }

    public void mostrarHabitacionesDisp(){
        for(Habitacion habitacion : getHabitaciones()){
            if(habitacion.getEstado() == EstadoHabitacion.DISPONIBLE){
            System.out.println(habitacion);
        }
    }
    }

    public void agregarHabitacion(Habitacion habitacion){
        getHabitaciones().add(habitacion);
    }

    public void mostrarHabitacionPart(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese numero de habitacion: ");
        int numero = t.nextInt();
        Habitacion buscada= this.buscarNumeroHabitacion(numero);
        System.out.println(buscada);

    }


    public Habitacion buscarNumeroHabitacion(int numero){
        for(Habitacion habitacion : getHabitaciones()){
            if(habitacion.getNumero() == numero){
                return habitacion;
            }
        }
        return null;
    }


    public Visitante buscarVisitante(int dni){
        for(Visitante v : getVisitantes()){
            if(v.getDni() == dni){
                return v;
            }
        }
        return null;
    }

    public Reserva buscarReservaPorID(int id){
        for(Reserva r : getReservas()){
            if(r.getID() == id){
                return r;
            }
        }

        return null;
    }

    public Reserva buscarReserva(Reserva reserva){
        for(Reserva r : getReservas()){
            if(r.equals(reserva)){
                return r;
            }
        }
        return null;
    }

    public SetGenerico<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public SetGenerico<Empleado> getEmpleados() {
        return empleados;
    }

    public SetGenerico<Estadia> getEstadias() {
        return estadias;
    }

    public SetGenerico<Reserva> getReservas() {
        return reservas;
    }

    public SetGenerico<Visitante> getVisitantes() {
        return visitantes;
    }
}
