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
        reservas.add(reserva);
    }

    public void agregarEstadia(Estadia estadia) {
        reservas.add(estadia);
    }

}
