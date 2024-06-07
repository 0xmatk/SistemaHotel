package Clases;

import java.util.LinkedHashSet;
import java.util.Collections;
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
       boolean flag = reservas.add(reserva);
       if(flag){
           System.out.println("Se agrego la reserva.");
       }else{
           System.out.println("No se agrego la reserva. La reserva ya existe. ");
       }
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

}
